# BuildItBigger ![alt text][launcher]


## Summary
**A** simple joke telling app that fetches jokes from a GCE.  While the app isn’t much, BuildItBigger shows how to ship multiple variations of the same app.  The flavors for this project were paid and free (with ads).


## Specifications
**Common Requirements**  
•  Follow Java style guide, git style guide, [core app quality guide][2], and [tablet app quality guide][3].

**Required Components**
•  Project contains a Java library for supplying jokes.  
•  Project contains an Android library with an activity that displays jokes passed to it as intent extras.  
•  Project contains a Google Cloud Endpoints module that supplies jokes from the Java library.  
•  Project loads jokes from GCE module via an AsyncTask.  
•  Project contains connected tests to verify that the AsyncTask is indeed loading jokes.  
•  Project contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.  
•  Ads are required in the free version.  

**Required Behavior**  
•  App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library. Note that the GCE module need only be deployed locally.  
•  App conforms to common standards found in the Android Nanodegree General Project Guidelines.  


## Issues
•  Demo videos, images, and links to download app are forthcoming.  
•  API may or may not still be functional.  
•  Repo should be merged with the other demo applications for convenience.  
•  Upload Java style guide used.  
•  Upload Git style guide used.  



[launcher]: https://github.com/DaceyE/BuildItBigger/blob/master/app/src/main/res/mipmap-mdpi/ic_launcher.png
[2]: https://developer.android.com/docs/quality-guidelines/core-app-quality
[3]: https://developer.android.com/docs/quality-guidelines/tablet-app-quality
