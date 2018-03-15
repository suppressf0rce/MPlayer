package com.binarylab.mplayer;

import android.content.Intent;

import com.binarylab.mplayer.activities.LoadingActivity;
import com.binarylab.mplayer.activities.MainActivity;

/**
 * This class loads all the resources needed by the application
 * and updates the progress bar accordingly. After it is done it switches to the main activity
 */
public class LoadingThread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            LoadingActivity.getInstance().setProgressValue(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        //Switching to main activity and killing the loading activity
        Intent changeIntent = new Intent(LoadingActivity.getInstance(), MainActivity.class);
        LoadingActivity.getInstance().startActivity(changeIntent);
        LoadingActivity.getInstance().finish();
    }
}
