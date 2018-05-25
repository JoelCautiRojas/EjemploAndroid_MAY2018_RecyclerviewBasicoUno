package com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.adaptadores;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.R;
import com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.modelos.recycler_model;

import java.util.List;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.ViewHolder>{

    private Context contexto;
    private LayoutInflater inflador;
    private List<recycler_model> datos;

    public recycler_adapter(Context contexto, List<recycler_model> datos) {
        this.contexto = contexto;
        this.datos = datos;
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.item_recyclerview,parent,false);
        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(datos.get(position).getNombre());
        holder.correo.setText(datos.get(position).getCorreo());
        holder.telefono.setText("Telefono: "+datos.get(position).getTelefono());
        holder.dni.setText("Dni: "+datos.get(position).getDni());
        holder.direccion.setText(datos.get(position).getDireccion());
        holder.imagen.setImageResource(datos.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre, correo, telefono, dni, direccion;
        ImageView imagen;

        ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            correo = itemView.findViewById(R.id.correo);
            telefono = itemView.findViewById(R.id.telefono);
            dni = itemView.findViewById(R.id.dni);
            direccion = itemView.findViewById(R.id.direccion);
            imagen = itemView.findViewById(R.id.imagen);
        }
    }
}
