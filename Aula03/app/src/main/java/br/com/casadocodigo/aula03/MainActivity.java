package br.com.casadocodigo.aula03;

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

        Button botaoMudarText = (Button) findViewById(R.id.botaoA);
        Button mudarCor = (Button) findViewById(R.id.botaoB);
        final TextView texto = (TextView) findViewById(R.id.textView);
        final RelativeLayout fundo = (RelativeLayout) findViewById(R.id.activity_main);

        botaoMudarText.setOnClickListener(new Button.OnClickListener()
        {
            public  void onClick(View v)
            {
                texto.setText("HELLO");
            }
        };

        mudarCor.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick (View v)
            {
                fundo.setBackgroundColor(Color.parseColor("#0B9AE2"));
            }
        }


        );

    }
}
