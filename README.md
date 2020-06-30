# Tour-A-Versity#
---
Design Document  
Charles Holt, Alen Anand, Kyle Brady

### Introduction
Going to a new University can be an intimidating experience. Wondering on to campus for the first time can seem extremely overwhelming to someone who isn’t prepared. That is where Tour-A-Versity comes in. This app is designed to give students and visitors a guide around campus to help them find the way to where they want to go, and maybe learn a few fun facts on the way.

### Storyboard

https://projects.invisionapp.com/prototype/ckavbxjj000ovga010af1mcv9/play

<img src="https://github.com/holtcl/Tour-A-Versity/blob/master/Artboard%201.svg">

### Functional Requirements

As a student starting out at the University of Cincinnati  
I want to find my way around the University Campus  
So that I can successfully manage naviagting my way around to help ensure my success with the University

1.1  
- **Given** Tour-A-Versity app is installed on phone
- **When** I open up the app
- **Then** I get an interactive map on my phone  
  
1.2  
- **Given** Tour-A-Versity app is running on phone  
- **When** I click on Tangeman University Center  
- **Then** information reguarding Tangeman University Center along with photos and facts appear on the screen.
  
1.3  
- **Given** Tour-A-Versity app is running on phone
- **When** I click the option to submit a photo of a specific building
- **Then** My phone opens the camera application and allows me to take a photo of the building and submit it.
  
1.4  
- **Given** Tour-A-Versity app is running on phone
- **When** I select the GPS icon on the main screen
- **Then** I get a new page that shows me where I am on campus with the help of the GPS

### Class Diagram
![ClassDiagram](https://user-images.githubusercontent.com/55214193/83365837-355ed880-a379-11ea-9cff-1f901489f286.png)

### Class Diagram Description

- The Main ViewModel is to select the building where you wish to find more information  
- The Building DTO class is for transferring information across the application
- The IBuilding DAO is used to transfer data 

### Product Backlog
- Open the app to view a map of the campus  
- Tap on a building to view information on the building  
- Upload photo taken from phone to the app  
- Use GPS feature to find where you are on the map  


### Scrum Board
-See GitHub Projects

### Scrum Roles

###### Dev Ops 
- Charles Holt  
###### UI Specialist
- Alen Anand  
###### Integration Specialist
- Kyle Brady  


### Link to WebEx
WebEx meeting at 4:00 p.m. on Wednesdays - link will be emailed to all members
