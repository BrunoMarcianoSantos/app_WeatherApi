package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardSearch, cardLocal, cardSensor, cardWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardSearch = findViewById(R.id.cardSearch);
        cardLocal = findViewById(R.id.cardLocal);
        cardSensor = findViewById(R.id.cardSensor);
        cardWeather = findViewById(R.id.cardWeather);

        cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast("Teste botao Pesquisar");
            }
        });

        cardLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast("Teste botao Local");
            }
        });

        cardSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast("Teste botao Condição ambiente");
            }
        });

        cardWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast("Teste botao Climas");
            }
        });
    }

    public void Toast (String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}