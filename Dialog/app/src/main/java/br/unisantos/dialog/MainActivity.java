package br.unisantos.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btnAbrir);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new  AlertDialog.Builder( MainActivity.this );

                dialog.setTitle("Titulo da Dialog");
                dialog.setMessage("MENSAGEM DO DIALOG");

                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.ic_menu_help);

                dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Precionado o botao não", Toast.LENGTH_SHORT).show();
                    }
                });

            dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"Precionado botao sim", Toast.LENGTH_SHORT).show();
                }
            });
                dialog.create();
                dialog.show();
            }
        });

    }
}
