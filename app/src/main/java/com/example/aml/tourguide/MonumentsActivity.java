package com.example.aml.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Aml on 2017-12-12.
 */

public class MonumentsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);
        final ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Taj Mahal"));
        lists.add(new List(" Qutub Minar"));
        lists.add(new List("The pyramids"));
        lists.add(new List("the sea"));
        lists.add(new List("Gateway of India"));
        ListAdapter adapter = new ListAdapter(this, lists,R.color.category_historical_monuments);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent , View view , int position , long id){
                List list=  lists.get(position);
            }
        });
    }
}
