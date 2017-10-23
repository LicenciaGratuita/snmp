package com.example.radik.noc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Aulas;
    Button Gobierno;
    Button Laboratorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aulas=(Button)findViewById(R.id.button3);
        Gobierno=(Button)findViewById(R.id.button);
        Laboratorio=(Button)findViewById(R.id.button2);

        Aulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoAulas= new Intent(MainActivity.this,AulasActivity.class);
                startActivity(GoAulas);
            }
        });
        Gobierno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoGobierno= new Intent(MainActivity.this,gobActivity.class);
                startActivity(GoGobierno);
             }
        });
        Laboratorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoLaboratorio= new Intent(MainActivity.this,labActivity.class);
                startActivity(GoLaboratorio);
            }
        });
    }
}
