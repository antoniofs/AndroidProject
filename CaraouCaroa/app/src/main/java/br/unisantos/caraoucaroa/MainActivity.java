package br.unisantos.caraoucaroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = { "Cara", "Coroa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.imbJogar);
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gerar Opção
                Random r = new Random();
                int numeroRandom = r.nextInt(2);

                Intent intent = new Intent(MainActivity.this, DetalheLayout.class);
                intent.putExtra( "opcao", opcao[numeroRandom] );

                startActivity( intent );

            }
        });


    }
}
