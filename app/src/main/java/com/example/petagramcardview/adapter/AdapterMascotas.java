package com.example.petagramcardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagramcardview.Mascota;
import com.example.petagramcardview.R;

import java.util.ArrayList;

public class AdapterMascotas extends RecyclerView.Adapter<AdapterMascotas.ViewHolderDatos>{

    ArrayList<Mascota> listMascotas;

    public AdapterMascotas(ArrayList<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }

     @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
            holder.nombre.setText(listMascotas.get(position).getNombre());
         holder.favorito.setText(listMascotas.get(position).getFavorito());
            holder.foto.setImageResource(listMascotas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listMascotas.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre ;
        TextView favorito ;
        ImageView foto;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.texto_nommascotas);
            favorito = (TextView) itemView.findViewById(R.id.texto_favoritomascota);
            foto = (ImageView) itemView.findViewById(R.id.img_mascotas);
        }

    }
}
