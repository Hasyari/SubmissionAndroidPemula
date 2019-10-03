package com.dicoding.submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Book> list = new ArrayList<>();
    private RecyclerView rvBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBook = findViewById(R.id.rv_Book);
        rvBook.setHasFixedSize(true);

        list.addAll(DataBook.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        CardBookAdapter cardViewHero = new CardBookAdapter(this);
        cardViewHero.setCardBookAdapter(list);
        rvBook.setAdapter(cardViewHero);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, DataDiri.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
