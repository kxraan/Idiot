package com.example.idiot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yes = findViewById(R.id.yes);
        Button no = findViewById(R.id.no);

        yes.setOnClickListener(v->{
            setContentView(R.layout.restart);
            Button restart = findViewById(R.id.restart);
            restart.setOnClickListener(e->{
            recreate();
            });
        });

        no.setOnClickListener(v->{
            Random random = new Random();
            int x = random.nextInt(750);
            int y = random.nextInt(2000);
            no.setX(x);
            no.setY(y);
           // no.layout(2,1,1,1);
        });



    }
}