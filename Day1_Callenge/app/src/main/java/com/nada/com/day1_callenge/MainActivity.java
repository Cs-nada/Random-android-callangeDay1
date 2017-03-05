package com.nada.com.day1_callenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Random rondom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textViewA);
        button= (Button)findViewById(R.id.buttonA);


        rondom= new Random();
        int i = rondom.nextInt(90) ;

        textView.setText(String.valueOf(i));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_B.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
