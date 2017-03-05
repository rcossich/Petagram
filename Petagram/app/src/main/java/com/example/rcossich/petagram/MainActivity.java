package com.example.rcossich.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota_POJO> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.mFavoritos:
                Intent intent = new Intent(this,Favoritos.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota_POJO>();
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_01,"Mascota 01",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_02,"Mascota 02",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_03,"Mascota 03",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_04,"Mascota 04",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_05,"Mascota 05",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_06,"Mascota 06",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_07,"Mascota 07",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_08,"Mascota 08",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_09,"Mascota 09",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_10,"Mascota 10",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_11,"Mascota 11",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_12,"Mascota 12",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_13,"Mascota 13",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_14,"Mascota 14",0));
        mascotas.add(new Mascota_POJO(R.drawable.dog_pet_15,"Mascota 15",0));

    }
}
