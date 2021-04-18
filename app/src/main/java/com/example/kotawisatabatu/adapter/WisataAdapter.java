package com.example.kotawisatabatu.adapter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kotawisatabatu.R;
import com.example.kotawisatabatu.activity.DetailActivity;
import com.example.kotawisatabatu.model.ClsWisata;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ListViewHolder> {
    private ArrayList<ClsWisata> listWisata;

    public WisataAdapter(ArrayList<ClsWisata> listWisata) {
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public WisataAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_listitem_wisata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.ListViewHolder holder, int position) {
        ClsWisata clsWisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(clsWisata.getFoto())
                .apply(new RequestOptions().override(120, 160))
                .into(holder.imgWisata);
        holder.tvNama.setText(clsWisata.getNama());
        holder.tvDeskripsi.setText(clsWisata.getDeskripsi());
        holder.tvHargaTiket.setText(clsWisata.getHarga_tiket());
        holder.tvAlamat.setText(clsWisata.getAlamat());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                String txtFavoriteDesc;
                String txtButtonValue = String.valueOf(holder.btnFavorite.getText());
                if(txtButtonValue.equals("0")) {
                    txtFavoriteDesc = "Favorite ";
                    holder.btnFavorite.setText("1");
//                    holder.btnFavorite.setIcon(R.drawable.ic_baseline_favorite_24);
                    holder.btnFavorite.setIcon(holder.itemView.getContext().getDrawable(R.drawable.ic_baseline_favorite_24));
                } else {
                    txtFavoriteDesc = "Unfavorite ";
                    holder.btnFavorite.setText("0");
                    holder.btnFavorite.setIcon(holder.itemView.getContext().getDrawable(R.drawable.ic_baseline_favorite_border_24));
                }
                Toast.makeText(holder.itemView.getContext(), txtFavoriteDesc +
                        listWisata.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();

            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
                intent.putExtra(Intent.EXTRA_TEXT, clsWisata.getNama());
                startActivity(holder.itemView.getContext(), Intent.createChooser(intent,"Share to :"), null);
            }
        });
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
            Bundle bundle=new Bundle();
            bundle.putInt("image", clsWisata.getFoto());
            intent.putExtras(bundle);
            intent.putExtra(DetailActivity.EXTRA_ACTION_BAR_TITLE, clsWisata.getNama());
            intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, clsWisata.getDeskripsi());
            intent.putExtra(DetailActivity.EXTRA_NO_TELP, clsWisata.getNo_telp());
            intent.putExtra(DetailActivity.EXTRA_ALAMAT, clsWisata.getAlamat());
            intent.putExtra(DetailActivity.EXTRA_LONLAT, clsWisata.getLonlat());
            intent.putExtra(DetailActivity.EXTRA_HARGA_TIKET, clsWisata.getHarga_tiket());
            startActivity(holder.itemView.getContext(), intent, null);
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgWisata;
        TextView tvNama, tvDeskripsi, tvHargaTiket, tvAlamat;
        MaterialButton btnFavorite, btnShare;
        CardView cardView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWisata = itemView.findViewById(R.id.img_wisata);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvHargaTiket = itemView.findViewById(R.id.tv_harga_tiket);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            btnFavorite = itemView.findViewById(R.id.btn_favorite);
            btnShare = itemView.findViewById(R.id.btn_share);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
