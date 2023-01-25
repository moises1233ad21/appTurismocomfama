package com.example.holacomfama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        //Atributos

        //Metodos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //crear el menu xml creado previamente

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu); //se le dice que infle o haga el menu, se llama
                        //se llama a la ruta en xml "R.menu.menu" Y La ruta en java "menu"
        return true;


    }

    //Dar funcionamiento al menu


     public boolean onOptionsItemSelected(MenuItem item) {

        //observamos a que item del menu le damos click
         int itemSeleccionado = item.getItemId();

         switch (itemSeleccionado){

             case(R.id.opcion1):
                 Toast.makeText(this, "Seleccionaste Opcion 1", Toast.LENGTH_SHORT).show();
                 break;

             case(R.id.opcion2):
                 Toast.makeText(this, "Seleccionaste Opcion 2", Toast.LENGTH_SHORT).show();
                 break;

             case(R.id.opcion3):
                 Toast.makeText(this, "Seleccionaste Opcion 3", Toast.LENGTH_SHORT).show();
                 break;


         }


        return super.onOptionsItemSelected(item);
    }
}






