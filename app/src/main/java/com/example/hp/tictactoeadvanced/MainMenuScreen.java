package com.example.hp.tictactoeadvanced;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainMenuScreen extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_menu);

        ((Button) findViewById(R.id.onePlayerBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "One Player button pressed!");
                Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
                intent.putExtra("GameType", true);
                startActivityForResult(intent, 0);
            }
        });

        ((Button) findViewById(R.id.twoPlayerBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Two Player button pressed!");
                Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
                intent.putExtra("GameType", false);
                startActivityForResult(intent, 0);
            }
        });

        ((Button) findViewById(R.id.exitGameBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Exit Game button pressed!");
                MainMenuScreen.this.finish();
            }
        });
    }
}

