package com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.adaptadores.recycler_adapter_cardview;
import com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.modelos.recycler_model;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recycler;
    List<recycler_model> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        datos = new ArrayList<recycler_model>();
        recycler_model persona1 = new recycler_model("Juan Gutierrez Perez","juan@gmail.com","965878457","78457878","Lima - Perú",R.drawable.imagen1);
        recycler_model persona2 = new recycler_model("Jose Aguilar Castillo","jose@gmail.com","985478788","45787844","Arequipa - Perú",R.drawable.imagen2);
        recycler_model persona3 = new recycler_model("Manuel Gonzales Orue","manuel@gmail.com","963665566","33256887","Lima - Perú",R.drawable.imagen3);
        recycler_model persona4 = new recycler_model("Ricardo Carbajal Rojas","ricardo@gmail.com","987474747","15457845","Huancayo - Perú",R.drawable.imagen4);
        recycler_model persona5 = new recycler_model("Carlos Aguilar Castillo","jose@gmail.com","998552243","78787788","Pasco - Perú",R.drawable.imagen5);
        recycler_model persona6 = new recycler_model("Paolo Aguilar Castillo","jose@gmail.com","999654512","44771515","Trujillo - Perú",R.drawable.imagen6);
        recycler_model persona7 = new recycler_model("Jose Aguilar Castillo","jose@gmail.com","997878451","12113333","Ica - Perú",R.drawable.imagen7);
        recycler_model persona8 = new recycler_model("Ramon Vazquez Huanca","jose@gmail.com","988577848","21025021","Moquegua - Perú",R.drawable.imagen8);
        recycler_model persona9 = new recycler_model("Jaime Alca Carmona","jose@gmail.com","998548784","15454440","Lima - Perú",R.drawable.imagen9);
        recycler_model persona10 = new recycler_model("Ernesto Alcala Campos","jose@gmail.com","985478788","45788989","Arequipa - Perú",R.drawable.imagen10);
        recycler_model persona11 = new recycler_model("Juan Piedra Cadena", "juanpiedra@gmail.com","965898745","78784848","Lima - Peru",R.drawable.imagen11);
        datos.add(persona1);
        datos.add(persona2);
        datos.add(persona3);
        datos.add(persona4);
        datos.add(persona5);
        datos.add(persona6);
        datos.add(persona7);
        datos.add(persona8);
        datos.add(persona9);
        datos.add(persona10);
        datos.add(persona11);

        recycler = findViewById(R.id.recicler2);
        recycler_adapter_cardview adaptador = new recycler_adapter_cardview(getApplicationContext(),datos);
        recycler.setAdapter(adaptador);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                return true;
            case R.id.opcion3:
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
