package com.yucelterlemezoglu.anime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnePieceActivity extends AppCompatActivity {

    TextView textViewOnePiece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_piece);

        textViewOnePiece = (TextView) findViewById(R.id.textViewOnePiece);
        textViewOnePiece.setMovementMethod(new ScrollingMovementMethod());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open("textonepiece.txt"), "UTF-8"));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
                textViewOnePiece.setText(mLine);
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
