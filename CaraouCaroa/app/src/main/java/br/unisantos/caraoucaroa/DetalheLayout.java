package br.unisantos.caraoucaroa;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheLayout extends AppCompatActivity {

    private ImageView botaoVoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_layout);

        moeda = (ImageView) findViewById(R.id.imgMoeda);
        botaoVoltar = (ImageView) findViewById(R.id.imgVoltar);

        Bundle extra = getIntent().getExtras();
        if(extra != null)
        {
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("Cara"))
            {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
