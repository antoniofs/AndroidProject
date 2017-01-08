package br.unisantos.minhasanotacoes;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends Activity {

    private ImageView btnSalvar;
    private EditText texto;
    private static final String NOME_ARQUIVO = "arquivo_anotaao.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalvar = (ImageView) findViewById(R.id.imgSalvar);
        texto = (EditText) findViewById(R.id.edtTexto);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoEscrito = texto.getText().toString();
                gravarNoArquivo( textoEscrito );
            }
        });

        if(lerArquivo() != null) {
            texto.setText( lerArquivo());
        }

    }

    private void gravarNoArquivo(String texto) {

        try {

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("NOME_ARQUIVO", Context.MODE_PRIVATE) );
            outputStreamWriter.write( texto );
            outputStreamWriter.close();

        }catch (IOException e) {
            Log.v("MainActivity", e.toString());
        }

    }

    private String lerArquivo() {

        String resultado = "";

        try {

            InputStream arquivo = openFileInput("NOME_ARQUIVO");

            if( arquivo != null) {
                InputStreamReader inputStreamReader = new InputStreamReader( arquivo );

                BufferedReader  bufferedReader = new BufferedReader(inputStreamReader);
                String linhaArquivo = "";
                while ( ( linhaArquivo = bufferedReader.readLine() ) != null) {

                    resultado += linhaArquivo;
                }

            }
            arquivo.close();

        }catch (IOException e) {
            Log.v("MainActivity", e.toString());
        }

        return  resultado;
    }
}
