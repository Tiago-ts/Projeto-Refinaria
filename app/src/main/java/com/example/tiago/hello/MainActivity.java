package com.example.tiago.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2,textView;
    private EditText edite01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        edite01 = (EditText) findViewById(R.id.edite01);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView2.setText(edite01 + " Respeita as minhas Notas...");
            }

        });

    }


    }

