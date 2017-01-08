package br.unisantos.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button botaoMostor;
    private CheckBox cao;
    private CheckBox gato;
    private CheckBox peixe;
    private TextView exibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoMostor = (Button) findViewById(R.id.btnResultado);
        cao = (CheckBox) findViewById(R.id.cbxCao);
        gato = (CheckBox) findViewById(R.id.cbxGato);
        peixe = (CheckBox) findViewById(R.id.cbxPeixe);
        exibicao = (TextView) findViewById(R.id.txtResultado);

        botaoMostor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String intensSelecionados;

                intensSelecionados =  " Intem: " + cao.getText() + " Status " + cao.isChecked() + "\n";
                intensSelecionados += " Intem: " + gato.getText() + " Status " + gato.isChecked() + "\n";
                intensSelecionados += " Intem " + peixe.getText() + " Status " + peixe.isChecked() + "\n";

                exibicao.setText(intensSelecionados);

            }
        });


    }
}
