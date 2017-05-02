package com.example.android.musicloversstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class SongList extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        // Create 50 dummy songs to populate the list view
        String songName = getResources().getString(R.string.add_song_name);
        String songAuthor = getResources().getString(R.string.add_song_artist_name);
        int songsCount = 50;
        int i = 0;
        ArrayList<String[]> songsList = new ArrayList<>();
        while( i < songsCount){
            String[] song = new String[]{ songName, songAuthor};
            songsList.add(i, song);
            i++;
        }
        // Set an adapter on the list view
        ListView songList = (ListView) findViewById(R.id.adapter_songs_list);
        songList.setAdapter(new SongsAdapter(this, songsList ));

        }
}
