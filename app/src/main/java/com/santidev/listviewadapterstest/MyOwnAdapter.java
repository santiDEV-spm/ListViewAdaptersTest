package com.santidev.listviewadapterstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyOwnAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Animal> myList = new ArrayList<>();

    public MyOwnAdapter(Context context, int layout, List<Animal> myList) {
        this.context = context;
        this.layout = layout;
        this.myList = myList;
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Animal getItem(int itemPosition) {
        return myList.get(itemPosition);
    }

    @Override
    public long getItemId(int itemPosition) {
        return itemPosition;
    }

    @Override
    public View getView(int itemPosition, View view, ViewGroup viewGroup) {
        /*
        * Aqui, recuperamos el objeto en la posicion i-esima que debe ser mostrado.
        * Preparamos la vista con los objetos del layout que hayamos creado en su momento
        * Rellenamos la informacion de estos widgets con el objeto
        * Para acabr, se infla la vista dentro de la viewgroup
        */

        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(this.layout, null);

        Animal currentAnimal = myList.get(itemPosition);

        TextView tvName = (TextView) v.findViewById(R.id.tvName);
        TextView tvScientificName = (TextView) v.findViewById(R.id.tvScientificName);
        TextView tvLife = (TextView) v.findViewById(R.id.tvLife);
        ImageView img = (ImageView) v.findViewById(R.id.img);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, currentAnimal.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        tvName.setText(currentAnimal.getName());
        tvScientificName.setText(currentAnimal.getScientificName());
        tvLife.setText(currentAnimal.getAverageLife());

        return v;
    }
}
