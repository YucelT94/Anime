package com.yucelterlemezoglu.anime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FairyTailActivity extends AppCompatActivity {

    TextView textViewFairyTail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairy_tail);

        textViewFairyTail = (TextView) findViewById(R.id.textViewFairyTail);
        textViewFairyTail.setMovementMethod(new ScrollingMovementMethod());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open("textfairytail.txt"), "UTF-8"));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
                textViewFairyTail.setText(mLine);
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
