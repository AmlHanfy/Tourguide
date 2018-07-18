package com.example.aml.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity  {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        final ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Pride and Prejudice"));
        lists.add(new List("Lost in Arcadia"));
        lists.add(new List("The overneath"));
        lists.add(new List("The emerald circus"));
        lists.add(new List("Nanoshock"));
        ListAdapter adapter = new ListAdapter(this, lists,R.color.category_library);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent , View view ,int position , long id){
                List list=  lists.get(position);
            }
        });
    }
    }
