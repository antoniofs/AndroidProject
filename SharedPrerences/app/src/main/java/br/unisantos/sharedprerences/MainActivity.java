package br.unisantos.sharedprerences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button salvar;
    private EditText nome;
    private TextView mostraNome;

    private static final String ARQUIVO_PREFERENCIAS = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salvar = (Button) findViewById(R.id.btnSalvar);
        nome = (EditText) findViewById(R.id.edtNome);
        mostraNome = (TextView) findViewById(R.id.txtMostrarNome);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if( nome.getText().toString().equals("") ){
                    Toast.makeText(MainActivity.this, "Por favor, prencher nome ", Toast.LENGTH_SHORT).show();

                }else {
                    editor.putString("nome", nome.getText().toString());
                    editor.commit();
                    mostraNome.setText("Ola " + nome.getText().toString());
                }

            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
        if( sharedPreferences.contains("nome") ) {
            String nomeUsuario = sharedPreferences.getString("nome", "usuario não defenido");

        }else {
            mostraNome.setText("Ola não definido");
        }


    }
}
