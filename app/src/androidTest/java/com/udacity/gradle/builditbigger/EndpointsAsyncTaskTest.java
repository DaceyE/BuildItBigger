package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Tests that the EndpointsAsyncTask retrieves a non-null and non-empty string from the backend GCE module.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    private static final String LOG_TAG = "NonEmptyStringTest";

    public void testVerifyNonEmptyResponse() {
        String myString = null;

        //Fetch the string from the GCE via an asyncTask
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute(getContext());
            myString = task.get();
        } catch (Exception e) {
            //print the exception stacktrace to logcat
            e.printStackTrace();
            Log.e(LOG_TAG, e.getMessage(), e);
        }

        //Test that the string is not null
        assertNotNull(myString);

        //Test that the string is not the empty string
        try {
            assertFalse(myString.equals(""));
        } catch (NullPointerException e) {
            //print the exception stacktrace to logcat
            e.printStackTrace();
            Log.e(LOG_TAG, e.getMessage(), e);
        }
    }

} //End of Class