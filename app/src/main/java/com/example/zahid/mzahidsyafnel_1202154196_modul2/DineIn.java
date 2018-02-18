package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private TextInputLayout x,y;
    private Spinner z;
    String mSpinnerlabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //setting toolbar yang akan muncul di atas dengan nama Dine In
        Toolbar mToolbar = (Toolbar) findViewById(R.id.appbar_dinein);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dine In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //inisiasi untuk Spinner

        z = (Spinner) findViewById(R.id.nomeja);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (z != null){
            z.setAdapter(adapter);
        }
    }

    public void pilihpesanan(View view) {

        //inisiasi untuk TextInputLayot

        x = (TextInputLayout) findViewById(R.id.nama);

        //membuat string test agar spinner dapat dipilih
        String test = z.getSelectedItem().toString();

        //jika spinner null
        if (z ==null){
            Toast.makeText(this,"Isi dulu bosku",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 1
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = x.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 2
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = x.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 3
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = x.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 4
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = x.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 5
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = x.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }

        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent x = new Intent(DineIn.this,ListPesanan.class);
        startActivity(x);

    }
}
