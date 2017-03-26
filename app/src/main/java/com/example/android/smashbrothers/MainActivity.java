package com.example.android.smashbrothers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int p1 = 0; // score for player 1
    int p2 = 0; // score for player 2

    Spinner spinner1, spinner2;
    ArrayAdapter<CharSequence> adapter1, adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.bowser);

        spinner1 = (Spinner) findViewById(R.id.character_spinner1);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.character_array1,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Player 1 is " +
                        parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); // first player character select

        spinner2 = (Spinner) findViewById(R.id.character_spinner2);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.character_array2,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Player 2 is " +
                        parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); // second player character select
    }

    public void koP1(View view) {
        p1 = p1 + 5;
        p2 = p2 - 5;
        displayForP1(p1);
        displayForP2(p2);
    } // Player 1 KOs opponent

    public void fallP1(View view) {
        p1 = p1 - 5;
        displayForP1(p1);
    } // Player 1 commits suicide or dies due to their own action

    public void bullsEyeKOP1(View view) {
        p1 = p1 + 8;
        p2 = p2 - 5;
        displayForP2(p2);
        displayForP1(p1);
    } // KO'd a foe with a shooting item

    public void wimpyKOP1(View view) {
        p1 = p1 + 40;
        p2 = p2 - 5;
        displayForP2(p2);
        displayForP1(p1);
    } // KO'd a foe with a weak attack

    public void koP2(View view) {
        p2 = p2 + 5;
        p1 = p1 - 5;
        displayForP2(p2);
        displayForP1(p1);
    } // Player 2 KOs opponent

    public void fallP2(View view) {
        p2 = p2 - 5;
        displayForP2(p2);
    } // Player 2 commits suicide or dies due to their own action

    public void bullsEyeKOP2(View view) {
        p2 = p2 + 8;
        p1 = p1 - 5;
        displayForP2(p2);
        displayForP1(p1);
    } // KO'd a foe with a shooting item

    public void wimpyKOP2(View view) {
        p2 = p2 + 40;
        p1 = p1 - 5;
        displayForP2(p2);
        displayForP1(p1);
    } // KO'd a foe with a weak attack

    public void reset(View view) {
        p1 = 0;
        p2 = 0;
        displayForP1(p1);
        displayForP2(p2);
    }

    public void displayForP1(int p1) {
        TextView pointView = (TextView) findViewById(R.id.player1_score);
        pointView.setText(String.valueOf(p1));
    }

    public void displayForP2(int p2) {
        TextView pointView = (TextView) findViewById(R.id.player2_score);
        pointView.setText(String.valueOf(p2));
    }
}
