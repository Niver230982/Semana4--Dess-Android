package com.example.appmacostas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appmacostas.adaptadores.MascotaAdaptador;
import com.example.appmacostas.model.Mascota;

import java.util.ArrayList;

public class Activity_Favoritos extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_favoritos);

        listaMascotas = findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicilizarListaMascotas();
        inicializarAdaptador();

    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicilizarListaMascotas(){
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(1,"Simbad",R.drawable.perro1, 4));
        mascotas.add(new Mascota(2,"Lara",R.drawable.perro2, 2));
        mascotas.add(new Mascota(3,"Osa",R.drawable.perro3, 3));
        mascotas.add(new Mascota(4,"Vartan",R.drawable.perro4, 1));
        mascotas.add(new Mascota(5,"Toby",R.drawable.perro5, 5));

    }

}