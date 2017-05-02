package com.example.android.musicloversstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        TextView addSong = (TextView) findViewById(R.id.home_add_song);
        addSong.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent addSongIntent = new Intent (Home.this,AddSong.class);
                startActivity(addSongIntent);
            }
        });

        TextView songList = (TextView) findViewById(R.id.home_song_list);
        songList.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent (Home.this,SongList.class);
                startActivity(songListIntent);
            }
        });
    }
}
