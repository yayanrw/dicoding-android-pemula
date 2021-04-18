package com.example.kotawisatabatu.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.kotawisatabatu.R;
import com.example.kotawisatabatu.adapter.WisataAdapter;
import com.example.kotawisatabatu.model.ClsWisata;
import com.example.kotawisatabatu.model.WisataData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<ClsWisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(getResources().getString(R.string.app_name));

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.hasFixedSize();

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }
    public void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        WisataAdapter wisataAdapter = new WisataAdapter(list);
        rvWisata.setAdapter(wisataAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra(AboutActivity.EXTRA_ACTION_BAR_TITLE, "About");
                startActivity(intent);
                break;
        }
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}