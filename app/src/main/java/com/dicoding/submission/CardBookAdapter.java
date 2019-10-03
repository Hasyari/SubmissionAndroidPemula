package com.dicoding.submission;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class CardBookAdapter extends RecyclerView.Adapter<CardBookAdapter.CardViewHolder> {

    private ArrayList<Book> listBook;
    private Context context;

    public CardBookAdapter(Context context) {
        this.context = context;
    }

    public void setCardBookAdapter(ArrayList<Book> list) {
        this.listBook = list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_book, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, final int position) {

        final Book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getImg_buku())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img_Buku);
        holder.tvNamaBuku.setText(book.getNama_buku());
        holder.tvDeskripsiBuku.setText(book.getDeskripsi_buku());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v) {

                Intent intent = new Intent(context, DetailBook.class);
                intent.putExtra("nama_buku", book.getNama_buku());
                intent.putExtra("nama_penulis", book.getNama_penulis());
                intent.putExtra("nama_penerbit", book.getNama_penerbit());
                intent.putExtra("deskripsi_buku", book.getDeskripsi_buku());
                intent.putExtra("tahun_buku", book.getTahun_terbit());
                intent.putExtra("isbn_buku", book.getIsbn_buku());
                intent.putExtra("halaman_buku", book.getHalaman_buku());
                intent.putExtra("img_buku", book.getImg_buku());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img_Buku;
        TextView tvNamaBuku, tvDeskripsiBuku;
        ItemClickListener itemClickListener;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Buku = itemView.findViewById(R.id.img_book);
            tvNamaBuku = itemView.findViewById(R.id.tv_name_book);
            tvDeskripsiBuku = itemView.findViewById(R.id.tv_deskrip_book);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClickListener(v);

        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }
    }

    public interface ItemClickListener {
        void onItemClickListener(View v);
    }
}
