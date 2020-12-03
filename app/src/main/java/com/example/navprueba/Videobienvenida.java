package com.example.navprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.navprueba.ui.home.HomeFragment;

public class Videobienvenida extends AppCompatActivity {
    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videobienvenida);

        videoview = (VideoView) findViewById(R.id.videoView);
        videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.navasvideo));

        MediaController mediaController = new MediaController(this);
        videoview.setMediaController(mediaController);

        videoview.start();


    }

    public void Volver(View vista1) {
        onBackPressed();

    }
}
