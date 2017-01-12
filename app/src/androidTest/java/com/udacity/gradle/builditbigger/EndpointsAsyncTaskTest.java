package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import org.junit.Test;
import java.util.concurrent.TimeUnit;


/**
 * Created by angel on 29/09/2016.
 */

public class EndpointsAsyncTaskTest extends AndroidTestCase{

    private EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(new OnTaskCompleted() {
        @Override
        public void onTask(String response) {
            System.out.println("onTask() called");
        }
    });

    @Test
    public void AsyncTaskTest() throws Exception
    {

        String result = asyncTask.execute().get(60, TimeUnit.SECONDS);
        assertNotNull(result);
        assertTrue("Test Failed",result.length() > 0);
    }
}
