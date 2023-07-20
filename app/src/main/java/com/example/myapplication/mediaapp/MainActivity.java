package com.example.myapplication.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private Button play, pause;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play= findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jaat);
        mediaPlayer.start();
       play.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mediaPlayer.start();

           }
       });
       pause.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mediaPlayer.pause();
           }
       });

    }
}