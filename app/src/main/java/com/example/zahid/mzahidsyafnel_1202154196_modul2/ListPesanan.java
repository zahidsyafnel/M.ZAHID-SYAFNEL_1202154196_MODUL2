package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a, b;

    //Daftar Menu Makanan
    private String[] Judul = {"Asem Padeh", "Ayam Pop", "Dendeng Balado", "Gulai Ayam", "Gulai Cumi", "Gulai Tunjang Kikil",
            "Kepala Kakap", "Rendang Daging"};
    //Daftar Harga
    private String[] test = {"Rp. 20.000", "Rp. 20.000", "Rp. 20.000", "Rp. 25.000", "Rp. 20.000", "Rp. 20.000", "Rp. 25.000", "Rp. 25.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.asampadeh, R.drawable.ayampop, R.drawable.dendengbalado, R.drawable.gulaiayam, R.drawable.gulaicumi,
            R.drawable.gulaitunjangkikil, R.drawable.kepalakakap, R.drawable.rendangdaging};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //mensetting toolbar yang akan muncul di atas dengan nama List Makanan
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_list);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("List Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);
    }


    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter

    private void DaftarItem() {
        for (int w = 0; w < Judul.length; w++) {
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}

