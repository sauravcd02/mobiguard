package com.mhvmedia.rakshakawach.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mhvmedia.rakshakawach.BuildConfig;
import com.mhvmedia.rakshakawach.databinding.ActivitySplashBinding;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    private ActivitySplashBinding binding;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        final long period = 100;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //this repeats every 100 ms
                if (i < 100) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (i > 100) {
                                binding.counter.setText("Loading . .  100%");
                            } else {
                                binding.counter.setText("Loading . .  " + String.valueOf(i) + "%");
                            }
                        }
                    });
                    i = i + (int) Math.floor(Math.random() * (5 - 3 + 1) + 7);
                    ;
                } else {
                    //closing the timer
                    timer.cancel();
                    Intent intent = new Intent(Splash.this, Slider.class);
                    startActivity(intent);
                    // close this activity
                    finish();
                }
            }
        }, 0, period);

        String versionName = BuildConfig.VERSION_NAME;
        binding.version.setText("Version - " + versionName);
    }
}