package com.example.tiago.refinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tela01 extends AppCompatActivity {

    private Button voltar01;
    private Button ok1;
    private EditText edite01;
    private TextView texto1,texto2;
    private Button botao05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela01);

        texto1 = (TextView) findViewById(R.id.texto1);
        texto2 = (TextView) findViewById(R.id.texto2);
        ok1 = (Button) findViewById(R.id.ok1);
        edite01 = (EditText) findViewById(R.id.edite01);


        ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float produc = Float.parseFloat(edite01.getText().toString());
                float total = produc * 480 / 168000;
                float res1 = 480 - total;
                int fim1 = (int) Math.round(res1);

                              if (total < 480) {
                    texto1.setText(null);
                    texto2.setText("Sua parada foi de: " + fim1 + " minutos.");
                    Toast.makeText(tela01.this, "Mais Sorte da próxima vez!", Toast.LENGTH_LONG).show();

                } else {
                    texto2.setText(null);
                    texto1.setText("Não houve parada de produção.");
                    Toast.makeText(tela01.this, "Você fez um Excelente Trabalho!", Toast.LENGTH_LONG).show();

                }



                }


        });

        voltar01 =(Button) findViewById(R.id.voltar01);

        voltar01.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                voltar01Activity();
            }

            private void voltar01Activity() {
                startActivity(new Intent(tela01.this, MainActivity.class));

            }

        });

    }


}
