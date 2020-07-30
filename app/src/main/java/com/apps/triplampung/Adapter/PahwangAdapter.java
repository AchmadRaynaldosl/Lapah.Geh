package com.apps.triplampung.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.triplampung.R;
import com.apps.triplampung.database.DetailWisataEntity;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PahwangAdapter extends RecyclerView.Adapter<PahwangAdapter.ViewHolder> {

    private Context context;
    private List<DetailWisataEntity> detailWisataEntities;

    public PahwangAdapter(Context context, List<DetailWisataEntity> detailWisataEntities) {
        this.context = context;
        this.detailWisataEntities = detailWisataEntities;
    }

    @NonNull
    @Override
    public PahwangAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.foto_wisata_item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PahwangAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(detailWisataEntities.get(position).getImg_pahwang())
                .into(holder.image_detail_wisata);
    }

    @Override
    public int getItemCount() {
        return detailWisataEntities.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image_detail_wisata;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image_detail_wisata = itemView.findViewById(R.id.img_detail);
        }
    }
}
