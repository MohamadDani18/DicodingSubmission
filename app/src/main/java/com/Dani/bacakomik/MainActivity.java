package com.Dani.bacakomik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKomiks;
    private ArrayList<komik> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKomiks = findViewById(R.id.rv_komiks);
        rvKomiks.setHasFixedSize(true);

        list.addAll(KomiksData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKomiks.setLayoutManager(new LinearLayoutManager(this));
        ListKomikAdapter listKomikAdapter = new ListKomikAdapter(list);
        rvKomiks.setAdapter(listKomikAdapter);

        listKomikAdapter.setOnItemClickCallback(new ListKomikAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(komik data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData(komik komik){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_KOMIK_NAME, komik.getName());
        intent.putExtra(DetailActivity.EXTRA_KOMIK_GENRE, komik.getGenre());
        intent.putExtra(DetailActivity.EXTRA_KOMIK_DETAIL, komik.getDetail());
        intent.putExtra(DetailActivity.EXTRA_KOMIK_IMAGE, komik.getPhoto());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }





}
