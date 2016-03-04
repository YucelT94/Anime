package com.yucelterlemezoglu.anime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TokyoGhoulActivity extends AppCompatActivity {

    TextView textViewTokyoGhoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyo_ghoul);

        textViewTokyoGhoul = (TextView) findViewById(R.id.textViewTokyoGhoul);
        textViewTokyoGhoul.setMovementMethod(new ScrollingMovementMethod());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open("texttokyoghoul.txt"), "UTF-8"));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
                textViewTokyoGhoul.setText(mLine);
            }
        } catch (IOException e) {
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
