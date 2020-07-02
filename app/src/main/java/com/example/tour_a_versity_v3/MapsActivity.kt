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

//class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {
class MapsActivity :
    AppCompatActivity(), OnMapReadyCallback,
    GoogleMap.OnInfoWindowClickListener {

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
        //set values for TUC
        val tucLat = 39.13175
        val tucLng = -84.51774
        val zoomLevel = 17f
        //create LatLng object for TUC
        val tucLatLng = LatLng(tucLat, tucLng)
        //move camera to TUC & add marker
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(tucLatLng, zoomLevel))
        tucMarker = map.addMarker(MarkerOptions()
                .position(tucLatLng)
                .title("TUC")
                .snippet("Tangeman University Center")
        )

        //create another marker for CECH
        val cechLat = 39.130315
        val cechLng = -84.518680
        val cechLatLng = LatLng(cechLat, cechLng)
        cechMarker = map.addMarker(MarkerOptions()
                .position(cechLatLng)
                .title("CECH")
                .snippet("College of Education, Criminal Justice, Human Services, and IT")
        )
    }
    override fun onInfoWindowClick(p0: Marker?) {
        if (p0 === tucMarker){
            val intent = Intent(this, TucInfo::class.java)
            startActivity(intent)
        }
        else if (p0 === cechMarker){
            val intent = Intent(this, CechInfo::class.java)
            startActivity(intent)
        }
    }

}