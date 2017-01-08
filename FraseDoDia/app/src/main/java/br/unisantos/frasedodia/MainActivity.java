package br.unisantos.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] fraseDoDia = {
            "Imagine uma nova história para sua vida e acredite nela.",
            "Não espere por uma crise para descobrir o que é importante em sua vida.",
            "A amizade desenvolve a felicidade e reduz o sofrimento, duplicando a nossa alegria e dividindo a nossa dor.",
            "Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade."

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.txtMostrarFrase);
        botaoNovaFrase = (Button) findViewById(R.id.BtnFrase);

        //textoNovaFrase.setText( fraseDoDia[1] );

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                textoNovaFrase.setText(fraseDoDia[r.nextInt(fraseDoDia.length)]);
            }
        });

    }
}
