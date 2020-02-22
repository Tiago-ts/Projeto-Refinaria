package com.example.tiago.refinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tela02 extends AppCompatActivity {

    private Button voltar02;
    private Button ok2;
    private EditText edite02;
    private TextView texto2,texto02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);



        texto2 = (TextView) findViewById(R.id.texto2);
        texto02 = (TextView) findViewById(R.id.texto02);
        ok2 = (Button) findViewById(R.id.ok2);
        edite02 = (EditText) findViewById(R.id.edite02);

        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float produc = Float.parseFloat(edite02.getText().toString());
                float tota2 = produc*480/160000;
                float res2 = 480-tota2;
                int fim2 = (int) Math.round(res2);

                if (tota2 < 480) {
                    texto2.setText(null);
                    texto02.setText("Sua parada foi de: " + fim2 + " minutos.");
                    Toast.makeText(tela02.this, "Mais Sorte da próxima vez!", Toast.LENGTH_LONG).show();


                } else {
                    texto02.setText(null);
                    texto2.setText("Não houve parada de produção.");
                    Toast.makeText(tela02.this, "Você fez um Excelente Trabalho.!", Toast.LENGTH_LONG).show();

                }


            }

        });

        voltar02 =(Button) findViewById(R.id.voltar02);
        voltar02.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                voltar02Activity();
            }

            private void voltar02Activity() {
                startActivity(new Intent(tela02.this, MainActivity.class));
            }
        });
    }
}
