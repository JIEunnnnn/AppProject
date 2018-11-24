package com.example.owner.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.TextView;


import static com.example.owner.afinal.R.*;


public class MainActivity extends AppCompatActivity {

    ImageButton googleMap, todoList, music;

    EditText dlgEdit1, dlgEdit2, dlgEdit3;
    View dialog;

    TextView tvMP3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        googleMap = (ImageButton) findViewById(id.googleMap);
        todoList = (ImageButton) findViewById(id.todoList);
        music = (ImageButton) findViewById(id.music);

        dlgEdit1 = (EditText) findViewById(id.dlgEdit1);
        dlgEdit2 = (EditText) findViewById(id.dlgEdit2);
        dlgEdit3 = (EditText) findViewById(id.dlgEdit3);



        googleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });
        todoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
                startActivity(intent);



    }
    });
    }

    }


