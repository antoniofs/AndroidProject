package br.com.casadocodigo.aula06;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alerta(View view) {
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Funcionou");
        alertDialog.setMessage("Botao Alerta 1");
        alertDialog.show();
    }

    public void alertaX(View view) {
        //acesssar botao
        Button b = (Button)view;

        //prepara mensagem
        String mensagem = "Você apertou o botao";

        //adicionar o nome do botao a mensagem
        mensagem = mensagem.concat(b.getText().toString());

        //mostrar caixa de mensagem
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Botão Apertado");
        alertDialog.setMessage(mensagem);
        alertDialog.show();



    }

}
