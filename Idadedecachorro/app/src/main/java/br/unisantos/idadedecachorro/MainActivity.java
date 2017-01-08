package br.unisantos.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button descobrirIdade;
    private EditText idade;
    private TextView mostrarIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descobrirIdade = (Button) findViewById(R.id.btnDescobrirIdade);
        idade = (EditText) findViewById(R.id.EdtIdade);
        mostrarIdade = (TextView) findViewById(R.id.txtAparecerIdade);

        descobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtDigitado = idade.getText().toString();

                if (txtDigitado.isEmpty()) {
                    mostrarIdade.setText("Nenhum numero Digitado");

                } else {
                    int valorDigitado = Integer.parseInt(txtDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    mostrarIdade.setText("A idade do cachorro em anos humanos é " + resultadoFinal + " anos");
                }
            }
        });



    }
}
