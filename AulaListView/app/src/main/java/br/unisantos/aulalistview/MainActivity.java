package br.unisantos.aulalistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaDeIntens;
    private String[] intens =
    {
        "Antonio", "Flavio", "Sousa",
        "Silva", "Nascimento",
        "Junior"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeIntens = (ListView) findViewById(R.id.ltvOne);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                intens
        );

        listaDeIntens.setAdapter( adapter );

        listaDeIntens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Teste de Click", Toast.LENGTH_SHORT);
            }
        });

    }
}
