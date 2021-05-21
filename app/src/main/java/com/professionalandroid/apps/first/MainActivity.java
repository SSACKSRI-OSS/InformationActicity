package com.professionalandroid.apps.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button plastic;
    Button glass;
    Button paper;
    Button vinyl;
    Button can;
    Button stiropom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plastic = (Button)findViewById(R.id.plasticpet);
        glass = (Button)findViewById(R.id.glass);
        paper = (Button)findViewById(R.id.paper);
        vinyl = (Button)findViewById(R.id.vinyl);
        can = (Button)findViewById(R.id.can);
        stiropom = (Button)findViewById(R.id.stiropom);

    }

    @Override
    protected void onStart() {
        super.onStart();
        plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlasticActivity.class);
                startActivity(intent);
            }
        });
        glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), GlassActivity.class);
                startActivity(intent2);
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), PaperActivity.class);
                startActivity(intent3);
            }
        });
        vinyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), VinylActivity.class);
                startActivity(intent4);
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), CanActivity.class);
                startActivity(intent5);
            }
        });
        stiropom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), StiropomActivity.class);
                startActivity(intent6);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}