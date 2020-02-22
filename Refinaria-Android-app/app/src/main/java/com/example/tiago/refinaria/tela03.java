package com.example.tiago.refinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tela03 extends AppCompatActivity {

    private Button voltar03;
    private Button ok3;
    private EditText edite03;
    private TextView texto3,texto03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);



        texto3 = (TextView) findViewById(R.id.texto3);
        texto03 = (TextView) findViewById(R.id.texto03);
        ok3 = (Button) findViewById(R.id.ok3);
        edite03 = (EditText) findViewById(R.id.edite03);

        ok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float produc = Float.parseFloat(edite03.getText().toString());
                float tota3 = produc*480/48000;
                float res3 = 480-tota3;
                int fim3 = (int) Math.round(res3);
                if (tota3 < 480) {

                    texto3.setText(null);
                    texto03.setText("Sua parada foi de: " + fim3 + " minutos.");
                    Toast.makeText(tela03.this, "Mais Sorte da próxima vez!", Toast.LENGTH_LONG).show();


                } else {
                    texto03.setText(null);
                    texto3.setText("Não houve parada de produção.");
                    Toast.makeText(tela03.this, "Você fez um Excelente Trabalho!", Toast.LENGTH_LONG).show();

                }



            }

        });

        voltar03 =(Button) findViewById(R.id.voltar03);

        voltar03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar03Activity();
            }

            private void voltar03Activity() {
                startActivity(new Intent(tela03.this, MainActivity.class));
            }
        });
    }
}
