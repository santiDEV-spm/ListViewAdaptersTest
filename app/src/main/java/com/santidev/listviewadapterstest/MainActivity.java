package com.santidev.listviewadapterstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Butterfly", "Rhopalocera", "5 moths of life"));
        animals.add(new Animal("Polar bear", "Ursus maritimus", "10 years of life"));
        animals.add(new Animal("Cow", "Bos taurus", "5 years of life"));
        animals.add(new Animal("Eagle", "Accipitridae", "8 years of life"));
        animals.add(new Animal("Horse", "Equus caballus", "10 years of life"));
        animals.add(new Animal("Mosquito", "Culicidae", "6 days of life"));

        ListView listView = (ListView) findViewById(R.id.listView);
        MyOwnAdapter adapter = new MyOwnAdapter(this,R.layout.item_listview, animals);
        listView.setAdapter(adapter);
    }
}