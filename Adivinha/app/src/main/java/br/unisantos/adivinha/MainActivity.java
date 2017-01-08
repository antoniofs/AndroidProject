package br.unisantos.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.btnjogar);
        textoResultado = (TextView) findViewById(R.id.txtresultado);

        //textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random r = new Random();

                int numeroAleatorio = r.nextInt(10000);

                textoResultado.setText("Número Escolhido " + numeroAleatorio);
            }
        });



    }
}
