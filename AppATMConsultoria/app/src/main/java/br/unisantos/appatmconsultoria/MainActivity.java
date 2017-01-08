package br.unisantos.appatmconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private ImageButton empresa;
    private ImageButton clientes;
    private ImageButton contato;
    private ImageButton servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresa = (ImageButton) findViewById(R.id.amgbtnEmpresa);
        clientes = (ImageButton) findViewById(R.id.imgbtnClientes);
        contato = (ImageButton) findViewById(R.id.imgbtnContato);
        servicos = (ImageButton) findViewById(R.id.imgbtnServicos);

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Aempresa.class));
            }
        });

    }
}
