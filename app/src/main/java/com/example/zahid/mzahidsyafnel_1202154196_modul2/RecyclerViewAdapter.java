package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvData,rvHarga;
    private ArrayList<Integer> gambar;


    public RecyclerViewAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String dan Integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            //agar isi dari array nya dapat pindah layout dengan membawa data sesuai dibawah
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMakanan.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,ikan,cabai,tomat,asam jawa,terung";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,jeruk nipis,daun salam,daun jeruk,cabe merah";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 2 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,Daging Sapi,Cabai Merah,jahe,kunyit,daun jeruk";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,gulai,daging ayam,daun kunyit,daun jeruk";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,cumi-cumi,santan,bawang merah,bawang putih,jahe";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,Kikil Lutut sapi,jahe,daun salam,cabai merah";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,kepala kakap,daun salam,daun kunyit,daun jeruk";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Nasi,daging sapi,daun kunyit,daun jeruk,kelapa parut";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}
