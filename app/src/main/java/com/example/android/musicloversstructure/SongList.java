package com.example.android.musicloversstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class SongList extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        // Create 50 dummy songs to populate the list view
        String songAuthor = getResources().getString(R.string.add_song_artist_name);
        String songName = getResources().getString(R.string.add_song_name);
        int songsCount = 50;
        int i = 0;
        ArrayList<String> songsList = new ArrayList<>();
        while( i < songsCount){
            songsList.add(songAuthor + " " + " - " + " " + songName);
            i++;
        }
        // Set an adapter on the list view
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsList);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(itemsAdapter);

        }
}
