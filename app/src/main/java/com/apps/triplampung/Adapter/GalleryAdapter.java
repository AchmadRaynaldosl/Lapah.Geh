package com.apps.triplampung.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.triplampung.R;
import com.apps.triplampung.ShowFotoWisata;
import com.apps.triplampung.database.GalleryEntity;
import com.bumptech.glide.Glide;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private Context context;
    private List<GalleryEntity> listGallery;

    public GalleryAdapter(Context context, List<GalleryEntity> listGallery) {
        this.context = context;
        this.listGallery = listGallery;
    }

    @NonNull
    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.foto_wisata_item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(listGallery.get(position).getImage_gallery())
                .into(holder.imgGallery);
    }

    @Override
    public int getItemCount() {
        return listGallery.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGallery;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgGallery = itemView.findViewById(R.id.img_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        Intent intent = new Intent(context, ShowFotoWisata.class);
                        intent.putExtra("image", listGallery.get(pos).getImage_gallery());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
