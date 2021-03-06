## Goal of This Sprint
 Create an Android app for our rideshare project:
 1. Make the pages and layout.
 2. Make the buttons, scrolling, etc. work.
 3. Connect the app to our sprint1 backend.

 ## How Everything Works
 I'm assuming you know how Git, GitHub, TravisCI, and Heroku from sprint1. If you forgot, click on the `backend` folder in GitHub, and you'll see the README.md for sprint1.

 You need to know these things for sprint2:
 - **Android Studio:** Where we write our Android app
 - **Gradle:** creates and runs tests for our Android app

 ## Android Studio
 1. Download and install Android Studio. It will take a while.
 2. Open the `frontend-driver` or `frontend-passenger` folder with Android Studio.
 3. Build the project (make sure it is up to date, pull just to make sure).
 4. Run the app.
 5. Select create "New Virtual Device" to run the app on an emulator.
 5. Ping our website in the terminal with this example code: `curl -X GET https://rideshare08.herokuapp.com/api/trip/trips/8`
     1. Our Heroku server stops running after 30 minutes of inactivity.
     2. The above command sort of "wakes" it up.
     3. Now our app can talk to the server.
 6. Login in the app as a driver or passenger.

 In steps 3 and 5, you may have to downlaod some stuff if it's your first time.
 The whole process may take a while.
 On Windows, you may have to install HAXM X86 hardware acceleration to get the emulator running.
