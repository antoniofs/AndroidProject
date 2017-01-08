package br.unisantos.quantovocegosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView aparecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekProcess);
        aparecer = (ImageView) findViewById(R.id.imvAparecer);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i < 5) {
                    aparecer.setImageResource(R.drawable.pouco);
                    Toast.makeText(MainActivity.this, "Pouco", Toast.LENGTH_SHORT).show();
                    }else if(i == 5) {
                    aparecer.setImageResource(R.drawable.medio);
                }else if( i < 9) {
                    aparecer.setImageResource(R.drawable.logo);
                }else {
                    aparecer.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
