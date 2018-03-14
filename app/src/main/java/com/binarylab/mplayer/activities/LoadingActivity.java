package com.binarylab.mplayer.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.binarylab.mplayer.LoadingThread;
import com.binarylab.mplayer.R;

import java.util.Locale;

public class LoadingActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progressText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressText = findViewById(R.id.progressText);

        Thread thread = new Thread(new LoadingThread(this));
        thread.start();

    }

    /**
     * This method can change the progress and text in real time, and it runs
     * on the ui thread.
     *
     * @param val an value of the progress could be only between [0 - 100]
     */
    public void setProgressValue(final int val) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                progressText.setText(String.format(Locale.getDefault(), "%d%%", val));
                progressBar.setProgress(val);
            }
        });
    }
}
