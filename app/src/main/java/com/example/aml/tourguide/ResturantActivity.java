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

public class ResturantActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_list);
        final ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Gorilla drink"));
        lists.add(new List("Chocolate cake"));
        lists.add(new List("bacon burger"));
        lists.add(new List("Carnivore pizzadilla"));
        lists.add(new List("Pasta Napoletana"));
        ListAdapter adapter = new ListAdapter(this, lists,R.color.category_resturant);
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
