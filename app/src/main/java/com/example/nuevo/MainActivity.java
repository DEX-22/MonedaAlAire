package com.example.nuevo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    ImageView moneda;
    Space espacio;
    Button Boton;
    TextView t;
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Boton = findViewById(R.id.Boton);


    }



    private int Mostrar(int Numero){

        espacio = findViewById(R.id.Espacio);

        moneda = findViewById(R.id.moneda);
        if(Numero%2==0){

            numero = (int) Math.random();
            moneda.setImageResource(R.drawable.moneda1);
            return numero;

        }else{
            moneda.setImageResource(R.drawable.moneda2);
            numero = (int) Math.random();
            return numero;
        }


    }



        public void onClick(View V) {

            if (V.getId() == R.id.Boton) {
                Random numero = new Random();
                int nomero = numero.nextInt(1000);
                Mostrar(nomero);

            }

        }


}


