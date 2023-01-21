package com.example.holacomfama;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    //atributos

    MediaPlayer cancion;




    //metodos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); //el metodo que conecta con la interfaz grafica "R"

        //ocultar la action bar
        ActionBar barra  = getSupportActionBar();
        barra.hide(); //se hace desde la parte interna. porque por fuera no esta  asociando a nadie "R.layout.activity_splash"


        // lanzar la cancion.
        cancion = MediaPlayer.create(this,R.raw.cancion);
        cancion.start();


        // temporizar la duracion del splash.
        TimerTask inicioApp =  new TimerTask() { //TimerTask es una interfaz ya que trae metodo que se sobreescribe.
            @Override
            public void run() {

                //lanzar una nueva actividad
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioApp,10000);


        // cancion. aqui hare que deje de sonar la cancion.

    }









}