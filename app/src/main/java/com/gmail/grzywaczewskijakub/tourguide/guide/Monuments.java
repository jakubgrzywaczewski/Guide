package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        final ArrayList<Attractions> monumnetsAttractions = new ArrayList<Attractions>();
        monumnetsAttractions.add(new Attractions("Sokół Palace", "Tadeusza Kościuszki 41, 05-800 ruszków", R.drawable.sokol_palace));
        monumnetsAttractions.add(new Attractions("Church of the Immaculate Conception of the Blessed Virgin Mary", "3 Maja 124, 05-800 Pruszków", R.drawable.church_bvm));
        monumnetsAttractions.add(new Attractions("Church of the Transfiguration of the Lord", "ul. Kręta, 19, 05-800 Pruszków", R.drawable.church_toc));
        monumnetsAttractions.add(new Attractions("Building of Rolling Stock Repair Facility", "ul. Studzienna, 5, 05-800 Pruszków", R.drawable.zntk));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, monumnetsAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.monuments_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = monumnetsAttractions.get(position);
            }
        });
    }
}
