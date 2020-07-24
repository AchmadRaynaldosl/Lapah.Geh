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

import java.util.List;

public class PuncakMasAdapter extends RecyclerView.Adapter<PuncakMasAdapter.ViewHolder> {

    private Context context;
    private List<DetailWisataEntity> detailWisataEntities;

    public PuncakMasAdapter(Context context, List<DetailWisataEntity> detailWisataEntities) {
        this.context = context;
        this.detailWisataEntities = detailWisataEntities;
    }

    @NonNull
    @Override
    public PuncakMasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.foto_wisata_item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PuncakMasAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(detailWisataEntities.get(position).getImg_puncakmas())
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
