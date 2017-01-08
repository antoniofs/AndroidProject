package br.com.casadocodigo.aula03segundatela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mudarTela = (Button) findViewById(R.id.botaoA);

        mudarTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.segundatela);
            }
        });

    }

    public  void chamaTela(View v) {
        setContentView(R.layout.segundatela);
    }
}
