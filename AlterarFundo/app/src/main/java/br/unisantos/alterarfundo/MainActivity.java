package br.unisantos.alterarfundo;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButtonSelecionado;
    private RadioGroup radioGroup;
    private Button botaoSalvar;
    private static  final String ARQUIVO_PREFERENCIAS = "ArquivoPreferencia";
    private RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rdg);
        botaoSalvar = (Button) findViewById(R.id.btnSalvar);
        relative = (RelativeLayout) findViewById(R.id.layoutID);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

                if( idRadioButtonEscolhido > 0) {

                    radioButtonSelecionado = (RadioButton) findViewById( idRadioButtonEscolhido );
                    SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String corEscolhida = radioButtonSelecionado.getText().toString();
                    editor.putString("corEscolhida", corEscolhida);

                    editor.commit();

                    setBackGroud( corEscolhida );





                }

            }
        });

        //Recuperar a cor Salva

        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
        if( sharedPreferences.contains("corEscolhida") ) {
            String corRecuperada = sharedPreferences.getString("corEscolhida", "Laranja");
            setBackGroud( corRecuperada);
        }

    }

    private void setBackGroud(String cor) {

        if( cor.equals("Azul") )
        {
            relative.setBackgroundColor(Color.parseColor("#495b7c"));

        }else if(cor.equals("Laranja")) {

            relative.setBackgroundColor(Color.parseColor("#ffce26"));

        }else {

            relative.setBackgroundColor(Color.parseColor("#0009670"));

        }
    }
}
