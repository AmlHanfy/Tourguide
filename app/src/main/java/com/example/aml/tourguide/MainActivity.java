package com.example.aml.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView library = (TextView) findViewById(R.id.library);
// Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this,LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        TextView resturant = (TextView) findViewById(R.id.resturant);
        // Set a click listener on that View
        resturant.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the resturant  View is clicked on.
            @Override
            public void onClick(View view) {
                Intent resturantIntent= new Intent(MainActivity.this,ResturantActivity.class);
                startActivity(resturantIntent);
            }
        });

        TextView park = (TextView) findViewById(R.id.park);
        // Set a click listener on that View
        park.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the park category is clicked on.
            @Override
            public void onClick(View view) {
                Intent parkIntent = new Intent(MainActivity.this,ParkActivity.class);
                startActivity(parkIntent);
            }
        });

        TextView monuments = (TextView) findViewById(R.id.monuments);
        // Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the monuments category is clicked on.
            @Override
            public void onClick(View view) {
                Intent monumentsIntent = new Intent(MainActivity.this,MonumentsActivity.class);
                startActivity(monumentsIntent);
            }
        });
    }
}
