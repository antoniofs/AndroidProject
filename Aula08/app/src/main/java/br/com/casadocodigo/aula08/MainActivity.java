package br.com.casadocodigo.aula08;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickToastLongo(View view)
    {
        //mostra mensagem toats
        Toast toast = Toast.makeText(MainActivity.this, "Longo TOAST", Toast.LENGTH_LONG);
        toast.show();


    }

    public void ClickToastCurto(View view)
    {
        Toast toast = Toast.makeText(MainActivity.this, "Curto TOAST", Toast.LENGTH_LONG);
        toast.show();

    }

    public void Som(View view) {
        MediaPlayer somPickObjeto = MediaPlayer.create(this, R.raw.main);
        somPickObjeto.start();
    }


}
