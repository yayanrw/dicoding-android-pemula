package com.example.kotawisatabatu.activity;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kotawisatabatu.R;
import com.google.android.material.button.MaterialButton;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ACTION_BAR_TITLE = "action_bar_title";
    public static final String EXTRA_DESKRIPSI = "deskripsi";
    public static final String EXTRA_ALAMAT = "alamat";
    public static final String EXTRA_NO_TELP = "no_telp";
    public static final String EXTRA_LONLAT = "lonlat";
    public static final String EXTRA_HARGA_TIKET = "harga_tiket";
    public static final int EXTRA_FOTO = 0;

    String nama, deskripsi, alamat, no_telp, lonlat, harga_tiket, foto;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = getIntent().getStringExtra(EXTRA_ACTION_BAR_TITLE);
        deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        alamat = getIntent().getStringExtra(EXTRA_ALAMAT);
        no_telp = getIntent().getStringExtra(EXTRA_NO_TELP);
        lonlat = getIntent().getStringExtra(EXTRA_LONLAT);
        harga_tiket = getIntent().getStringExtra(EXTRA_HARGA_TIKET);
//        foto = getIntent().getStringExtra(EXTRA_FOTO);
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
//        v.setImageResource(pic);

        setActionBarTitle(nama);

        TextView tvNama = findViewById(R.id.tv_nama);
        TextView tvDeskripsi = findViewById(R.id.tv_deskripsi);
        TextView tvAlamat = findViewById(R.id.tv_alamat);
        TextView tvNoTelp = findViewById(R.id.tv_no_telp);
        TextView tvHargaTiket = findViewById(R.id.tv_harga_tiket);
        ImageView imgWisata = findViewById(R.id.img_wisata);
        imgWisata.setClipToOutline(true);
        MaterialButton btnFavorite = findViewById(R.id.btn_favorite);
        MaterialButton btnShare = findViewById(R.id.btn_share);
        MaterialButton btnTelepon = findViewById(R.id.btn_telepon);
        MaterialButton btnPeta = findViewById(R.id.btn_peta);

        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvAlamat.setText(alamat);
        tvNoTelp.setText(no_telp);
        tvHargaTiket.setText(harga_tiket);
        Glide.with(DetailActivity.this)
                .load(pic)
                .apply(new RequestOptions().override(350, 300))
                .into(imgWisata);

        btnFavorite.setOnClickListener(v -> {
            String txtFavoriteDesc;
            String txtButtonValue = String.valueOf(btnFavorite.getText());
            if(txtButtonValue.equals("0")) {
                txtFavoriteDesc = "Favorite ";
                btnFavorite.setText("1");
//                    btnFavorite.setIcon(R.drawable.ic_baseline_favorite_24);
                btnFavorite.setIcon(getDrawable(R.drawable.ic_baseline_favorite_24));
            } else {
                txtFavoriteDesc = "Unfavorite ";
                btnFavorite.setText("0");
                btnFavorite.setIcon(getDrawable(R.drawable.ic_baseline_favorite_border_24));
            }
            Toast.makeText(DetailActivity.this, txtFavoriteDesc +
                    nama, Toast.LENGTH_SHORT).show();
        });

        btnShare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
            intent.putExtra(Intent.EXTRA_TEXT, nama);
            startActivity(intent);
        });

        btnTelepon.setOnClickListener(v -> {
            String phoneNumber = no_telp;
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(intent);
        });

        btnPeta.setOnClickListener(v -> {
            String uri = "http://maps.google.com/maps?q=loc:" + lonlat;
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        });
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