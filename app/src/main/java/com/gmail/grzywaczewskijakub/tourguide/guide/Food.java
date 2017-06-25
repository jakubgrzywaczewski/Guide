package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        final ArrayList<Attractions> foodAttractions = new ArrayList<Attractions>();
        foodAttractions.add(new Attractions("Fabrizio Italian Bar", "Bolesława Prusa 35b, 00-001 Pruszków", R.drawable.fabrizio));
        foodAttractions.add(new Attractions("Tratoria Rucola", "Prusa 35, 05-800 Pruszków", R.drawable.trattoria));
        foodAttractions.add(new Attractions("Tabla - Indian cuisine", "Józefa Ignacego Kraszewskiego 27F-27G, 00-001 Pruszków", R.drawable.tabla));
        foodAttractions.add(new Attractions("Corrado Pruszków", "Aleja Wojska Polskiego 36A, 00-001 Pruszków", R.drawable.corrado));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, foodAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.food_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = foodAttractions.get(position);
            }
        });
    }
}
