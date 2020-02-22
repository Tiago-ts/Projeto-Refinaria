package com.example.tiago.refinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tela04 extends AppCompatActivity {

    private Button voltar04;
    private Button ok4;
    private EditText edite04;
    private TextView texto4,texto04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela04);



        texto4 = (TextView) findViewById(R.id.texto4);
        texto04 = (TextView) findViewById(R.id.texto04);
        ok4 = (Button) findViewById(R.id.ok4);
        edite04 = (EditText) findViewById(R.id.edite04);

        ok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float produc = Float.parseFloat(edite04.getText().toString());
                float total4 = produc*480/48000;
                float res4 = 480-total4;
                int fim4 = (int) Math.round(res4);


                if (total4 < 480) {
                    texto4.setText(null);
                    texto04.setText("Sua parada foi de: " + fim4 + " minutos.");
                    Toast.makeText(tela04.this, "Mais Sorte da próxima vez!", Toast.LENGTH_LONG).show();


                } else {
                    texto04.setText(null);
                    texto4.setText("Não houve parada de produção.");
                    Toast.makeText(tela04.this, "Você fez um Excelente Trabalho!", Toast.LENGTH_LONG).show();

                }



            }

        });

        voltar04 =(Button) findViewById(R.id.voltar04);

        voltar04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar04Activity();
            }

            private void voltar04Activity() {
                startActivity(new Intent(tela04.this, MainActivity.class));
            }
        });
    }
}
