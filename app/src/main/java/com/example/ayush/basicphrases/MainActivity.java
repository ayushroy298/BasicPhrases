package com.example.ayush.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    public void play(View view)
    {


        Button buttonPressed=(Button) view;
        Log.i("Button Pressed", buttonPressed.getTag().toString());
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw", getPackageName()));
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
