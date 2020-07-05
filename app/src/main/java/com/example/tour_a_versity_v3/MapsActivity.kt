package com.example.tour_a_versity_v3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private lateinit var map: GoogleMap
    private lateinit var tucMarker: Marker
    private lateinit var cechMarker: Marker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     */
    override fun onMapReady(googleMap: GoogleMap) {
        this.map = googleMap
        map.mapType = GoogleMap.MAP_TYPE_HYBRID
        map.setOnInfoWindowClickListener(this)
        val zoomLevel = 17f
        val tucLatLng = markTUC()
        //move camera to TUC & add marker
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(tucLatLng, zoomLevel))
        tucMarker = map.addMarker(MarkerOptions()
                .position(tucLatLng)
                .title("TUC")
                .snippet("Tangeman University Center")
        )

        //create another marker for CECH
        val cechLatLng = markCECH()
        cechMarker = map.addMarker(MarkerOptions()
                .position(cechLatLng)
                .title("CECH")
                .snippet("College of Education, Criminal Justice, Human Services, and IT")
        )
    }

    private fun markTUC(): LatLng {
        //set values for TUC
        val tucLat = 39.13175
        val tucLng = -84.51774

        //create and return LatLng object for TUC
        return LatLng(tucLat, tucLng)
    }

    private fun markCECH(): LatLng {
        //set values for CECH
        val cechLat = 39.130315
        val cechLng = -84.518680

        //create and return LatLng object for CECH
        return LatLng(cechLat, cechLng)
    }

    override fun onInfoWindowClick(p0: Marker?) {
        if (p0 == this.tucMarker){
            val intent = Intent(this, TUC_Info::class.java)
            startActivity(intent)
        }
        else if (p0 == cechMarker){
            val intent = Intent(this, CECH_Info::class.java)
            startActivity(intent)
        }
        else {
            // Accounts for other clicks, could also add in a print for the lat and lng
            // Could also grab that data and see if there was something the user was looking for
            println("Another marker on the map was clicked")
        }

    }

}