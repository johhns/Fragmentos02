package com.developer.johhns.fragmentos02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add( R.id.contenedor_a , new FragmentoA() )
                .add( R.id.contenedor_b , new FragmentoB() )
                .commit() ;

    }
}