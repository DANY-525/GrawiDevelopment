package com.example.administrador.wishers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrador on 13/08/2017.
 */
public class ProgramacionAdapter extends BaseAdapter {


    List<Programacion>listaProgramable;


    Context context;

    public ProgramacionAdapter(Context context1) {
       listaProgramable =Programacion.crearUnaListaProgramacion();
        context=context1;
    }

    @Override
    public int getCount() {
        return listaProgramable.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View  v;
        if (convertView == null){

            v=View.inflate(context,R.layout.activity_adaptador_programacion,null);
        }else{


            v=convertView;
        }

        TextView textView =(TextView)v.findViewById(R.id.iracine);
        TextView textView1=(TextView)v.findViewById(R.id.contenido);
        TextView textView2=(TextView)v.findViewById(R.id.dia);


        ImageView imageView=(ImageView)v.findViewById(R.id.imagen);


        textView.setText(listaProgramable.get(position).getEventoCine());

        textView1.setText(listaProgramable.get(position).getSalirComida());
        textView2.setText(listaProgramable.get(position).getSalirFiesta());
        Picasso.with(context).load(listaProgramable.get(position).getIrEvento()).resize(200,200).centerCrop().into(imageView);






        return v;
    }
}
