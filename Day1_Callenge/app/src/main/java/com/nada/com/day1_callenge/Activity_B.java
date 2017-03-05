package com.nada.com.day1_callenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Activity_B extends AppCompatActivity {
    TextView textViewB;
    Button buttonB;
    Random rondom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__b);
        textViewB=(TextView)findViewById(R.id.textViewB);
        buttonB= (Button)findViewById(R.id.buttonB);


        rondom= new Random();
        int i = rondom.nextInt(90) ;

        textViewB.setText(String.valueOf(i));
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_B.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
