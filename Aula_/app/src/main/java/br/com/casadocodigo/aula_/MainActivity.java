package br.com.casadocodigo.aula_;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoTexto = (TextView) findViewById(R.id.textView);
        Button botaoTexto = (Button) findViewById(R.id.Btn1);
        Button botaoCor = (Button) findViewById(R.id.Btn2);
        final RelativeLayout fundo = (RelativeLayout) findViewById(R.id.Fundotela);

        botaoTexto.setOnClickListener(new Button.OnClickListener()
                                        {

                                          public  void onClick(View v)
                                          {
                                              campoTexto.setText("Felpudinho");
                                          }

                                        }


        );


        botaoCor.setOnClickListener(new Button.OnClickListener()
                                      {

                                          public  void onClick(View v)
                                          {
                                              fundo.setBackgroundColor(Color.parseColor("#0B9AE2"));
                                          }

                                      }


        );


    }
}
