package br.unisantos.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button botao;
    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private TextView textoExibicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btnEscolher);
        radioGroup = (RadioGroup) findViewById(R.id.radioButton);
        textoExibicao = (TextView) findViewById(R.id.txtExibicao);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioButton = ;

                textoExibicao.setText("id " + R.id.radioButton);
            }
        });


    }
}
