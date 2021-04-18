package com.example.kotawisatabatu.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kotawisatabatu.R;

public class AboutActivity extends AppCompatActivity {
    public static final String EXTRA_ACTION_BAR_TITLE = "action_bar_title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imgFotoProfil = findViewById(R.id.img_foto_profil);

        String title = getIntent().getStringExtra(EXTRA_ACTION_BAR_TITLE);
        setActionBarTitle(title);

        Glide.with(AboutActivity.this)
                .load(R.drawable.yayan_new)
                .apply(new RequestOptions().override(150, 150))
                .into(imgFotoProfil);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}