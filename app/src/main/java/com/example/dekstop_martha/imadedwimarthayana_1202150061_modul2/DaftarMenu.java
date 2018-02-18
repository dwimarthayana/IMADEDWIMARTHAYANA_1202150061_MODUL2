package com.example.dekstop_martha.imadedwimarthayana_1202150061_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {
    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuLink mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recycle);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuLink(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("nasiayam");
            foods.add("pizzaayam");
            foods.add("pizzabuah");
            foods.add("pizzabuah");
            foods.add("pizzakeju");
            foods.add("pizzasapi");
            foods.add("pizzasayur");
            foods.add("pizzatebal");
            foods.add("pizzaron");

            // mamanggil harga
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(30000);
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.nasiayam);
            photos.add(R.drawable.pizzaayam);
            photos.add(R.drawable.pizzabuah);
            photos.add(R.drawable.pizzakeju);
            photos.add(R.drawable.pizzakeju);
            photos.add(R.drawable.pizzasapi);
            photos.add(R.drawable.pizzasayur);
            photos.add(R.drawable.pizzatebal);
            photos.add(R.drawable.pizzaron);
        }
    }
}
