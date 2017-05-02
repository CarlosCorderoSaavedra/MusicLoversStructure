package com.example.android.musicloversstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class SongInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);
    }

    public void openSongInfo(View view) {
        Intent songInfo = new Intent(this, SongInfo.class);
        startActivity(songInfo);
        finish();
    }
}
