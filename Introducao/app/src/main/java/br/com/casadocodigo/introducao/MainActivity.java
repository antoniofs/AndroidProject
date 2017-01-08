package br.com.casadocodigo.introducao;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity {

    private EditText caxNome;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caxNome = (EditText) findViewById(R.id.caxNome);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(caxNome.getText().toString());
                dlg.setNeutralButton("OK",null);
                dlg.show();

            }
        });



    }
}
