package com.apps.triplampung.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.triplampung.DetailWisata;
import com.apps.triplampung.R;
import com.apps.triplampung.database.WisataEntity;

import java.util.List;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ViewHolder> {

    private Context context;
    private List<WisataEntity> listWisata;

    public WisataAdapter(Context context, List<WisataEntity> listWisata) {
        this.context = context;
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public WisataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.wisata_item, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.ViewHolder holder, int position) {
        holder.txtWisata.setText(listWisata.get(position).getWisata());
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtWisata;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtWisata= itemView.findViewById(R.id.txtWisata);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        Intent intent = new Intent(context, DetailWisata.class);
                        intent.putExtra("id", listWisata.get(position).getId_wisata());
                        intent.putExtra("title", listWisata.get(position).getWisata());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
