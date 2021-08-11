package com.example.surfaceviewbug;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.os.Bundle;
import android.util.Rational;
import android.view.View;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");
        videoView.start();
    }

    public void enterPiP(View view) {
        enterPictureInPictureMode(
            new PictureInPictureParams.Builder()
                .setAspectRatio(new Rational(3, 2))
                .build()
        );
    }
}