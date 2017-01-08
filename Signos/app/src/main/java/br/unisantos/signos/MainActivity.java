package br.unisantos.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos =
            {
              "Aries", "Touro", "Gemeos", "Leão", "Virgem",
              "Libra", "Escorpiao", "Sagitario", "Capricornio", "Aquario",
              "Peixes"


            };

    private String[] mensagem =
            {
              "Bom", "Feliz", "Paz"

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.ltvSignos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
          getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int posicao = i;

                Toast.makeText(getApplicationContext(),mensagem[posicao], Toast.LENGTH_SHORT).show();

            }
        });


    }
}
