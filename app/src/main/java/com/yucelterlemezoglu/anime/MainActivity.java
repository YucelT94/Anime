package com.yucelterlemezoglu.anime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton buttonDeathNote, buttonFaryTail, buttonTokyoGhoul, buttonNaruto, buttonOnePiece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDeathNote = (ImageButton) findViewById(R.id.buttonDeathNote);
        buttonFaryTail = (ImageButton) findViewById(R.id.buttonFaryTail);
        buttonNaruto = (ImageButton) findViewById(R.id.buttonNaruto);
        buttonOnePiece = (ImageButton) findViewById(R.id.buttonOnePiece);
        buttonTokyoGhoul = (ImageButton) findViewById(R.id.buttonTokyoGhoul);

        buttonDeathNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeathNoteActivity.class);
                startActivity(intent);
            }
        });
        buttonFaryTail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FairyTailActivity.class);
                startActivity(intent);
            }
        });
        buttonNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NarutoActivity.class);
                startActivity(intent);
            }
        });
        buttonOnePiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnePieceActivity.class);
                startActivity(intent);
            }
        });
        buttonTokyoGhoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TokyoGhoulActivity.class);
                startActivity(intent);
            }
        });
    }
}
