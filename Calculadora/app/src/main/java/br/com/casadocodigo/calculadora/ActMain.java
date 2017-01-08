package br.com.casadocodigo.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import  android.widget.*;
import android.view.*;

public class ActMain extends AppCompatActivity implements View.OnClickListener{

    private Button calcular;
    private EditText edtValor1;
    private EditText edtValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        //Declaração
     edtValor1 = (EditText) findViewById(R.id.edtValor1);
     edtValor2 = (EditText) findViewById(R.id.edtValor2);
     calcular  = (Button) findViewById(R.id.btnCalcular);

        calcular.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();

        if(v1.trim().isEmpty() || v2.trim().isEmpty() )
        {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("A dados em branco");
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }
        else {
            double valor1 = Double.parseDouble(edtValor1.getText().toString());
            double valor2 = Double.parseDouble(edtValor2.getText().toString());

            double resultado = valor1 + valor2;

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("O resulto da soma é" + resultado);
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
        }


}
