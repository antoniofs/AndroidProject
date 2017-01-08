package br.unisantos.myapplication;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private EditText textoTarefa;
    private Button botaoAdicionar;
    private ListView listaDeTarefas;
    private SQLiteDatabase bancoDeDados;
    private ArrayList<Integer> ids;

    private ArrayAdapter<String> intensAdpatador;
    private ArrayList<String> intens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

        textoTarefa = (EditText) findViewById(R.id.textoID);
        botaoAdicionar = (Button) findViewById(R.id.botaoID);


        bancoDeDados = openOrCreateDatabase("apptarefa", MODE_PRIVATE, null);

        bancoDeDados.execSQL("CREATE TABLE IF NOT EXISTS tarefas(id INTEGER PRIMARY KEY AUTOINCREMENT, tarefa VARCHAR)");

        botaoAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = textoTarefa.getText().toString();
                salvarTarefa(texto);

        }
        });

            recuperarTarefas();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void salvarTarefa(String texto) {
        try {

            if( texto.toString().isEmpty()) {

                Toast.makeText(MainActivity.this, "Digite uma Tarefa", Toast.LENGTH_SHORT).show();

            }else {
                bancoDeDados.execSQL("INSERT INTO tarefas (tarefa) VALUES ('" + texto + "')");
                recuperarTarefas();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void recuperarTarefas() {
        try {
            Cursor cursor = bancoDeDados.rawQuery("SELECT * FROM tarefas ORDER BY id DESC", null);

            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaTarefas = cursor.getColumnIndex("tarefa");

            listaDeTarefas = (ListView) findViewById(R.id.listviewID);

            intens = new ArrayList<String>();

            intensAdpatador = new ArrayAdapter<String>( getApplicationContext(),
                    android.R.layout.simple_list_item_2,
                    android.R.id.text1,
                    intens

            );

            listaDeTarefas.setAdapter( intensAdpatador );

            cursor.moveToFirst();

            while( cursor != null ){

                Log.i("Resultado", "Tarefa:" + cursor.getString(indiceColunaTarefas));
                ids.add(Integer.parseInt( cursor.ge))
                intens.add( cursor.getString(indiceColunaTarefas) );
                cursor.moveToNext();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
