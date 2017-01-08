package br.unisantos.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText gasolina;
    private EditText alcool;
    private Button verifica;
    private TextView mostrarNaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gasolina = (EditText) findViewById(R.id.cxtGasolina);
        alcool = (EditText) findViewById(R.id.cxtAlcool);
        verifica = (Button) findViewById(R.id.btnVerificar);
        mostrarNaTela = (TextView) findViewById(R.id.txtMostrarOMelhor);

        verifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorGasolina = gasolina.getText().toString();
                String valorAlcool = alcool.getText().toString();

                double dbAlcool = Double.parseDouble( valorAlcool );
                double dbGasolina = Double.parseDouble( valorGasolina );

                if(valorAlcool.isEmpty() || valorGasolina.isEmpty()) {
                    mostrarNaTela.setText("Por favor coloque os valores nas duas caixas");
                }else if(dbAlcool < dbGasolina){
                    mostrarNaTela.setText("O melhor é o Alcool");
                }else {
                    mostrarNaTela.setText("O melhor é Gasolina");
                }

            }
        });


    }
}
