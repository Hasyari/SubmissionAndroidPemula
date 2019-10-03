package com.dicoding.submission;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailBook extends AppCompatActivity {

    TextView tvNamaBuku, tvNamaPenulis, tvNamaPenerbit, tvDeskripsi, tvTahun, tvIsbnBuku, tvHalamanBuku;
    ImageView imgBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        Toolbar toolbar = findViewById(R.id.toolbar);
        tvNamaBuku = findViewById(R.id.namaBuku);
        tvNamaPenulis = findViewById(R.id.namaPenulis);
        tvNamaPenerbit = findViewById(R.id.namaPenerbit);
        tvDeskripsi = findViewById(R.id.deskripsiBuku);
        tvTahun = findViewById(R.id.tahunBuku);
        imgBuku = findViewById(R.id.imgBuku);
        tvIsbnBuku = findViewById(R.id.isbnBuku);
        tvHalamanBuku = findViewById(R.id.halaman_buku);


        int iImgBuku = getIntent().getIntExtra("img_buku", 0);
        tvNamaBuku.setText(getIntent().getStringExtra("nama_buku"));
        tvNamaPenulis.setText(getIntent().getStringExtra("nama_penulis"));
        tvNamaPenerbit.setText(getIntent().getStringExtra("nama_penerbit"));
        tvDeskripsi.setText(getIntent().getStringExtra("deskripsi_buku"));
        tvTahun.setText(getIntent().getStringExtra("tahun_buku"));
        tvIsbnBuku.setText(getIntent().getStringExtra("isbn_buku"));
        tvHalamanBuku.setText(getIntent().getStringExtra("halaman_buku"));
        imgBuku.setBackgroundResource(iImgBuku);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Detail Buku");


        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));



    }

}
