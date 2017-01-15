package br.unisantos.iampresent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button add;
    private List<Aluno> novosAlunos = new ArrayList<Aluno>();
    private Button resultado;
    private LinearLayout container;
    private Button ok;
    private static int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Recuperando
        container = (LinearLayout) findViewById(R.id.lineCheckbox);
        add = (Button) findViewById(R.id.btnAdd);
        resultado = (Button) findViewById(R.id.btnResultado);
        ok = (Button) findViewById(R.id.btnOk);


        //Função para adicionar um novo Aluno
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirMensagemEdt("Novo Aluno(New Student)", "Para adicionar um novo aluno, click ok", container);
            }
        });



    }


    public void exibirMensagemEdt(String titulo, String texto, final LinearLayout frameLayout){

        AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);
        mensagem.setTitle(titulo);
        mensagem.setMessage(texto);

        // DECLARACAO DO EDITTEXT
        final EditText input = new EditText(this);
        mensagem.setView(input);
        mensagem.setNeutralButton("OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                if (input.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Texto em Branco",
                            Toast.LENGTH_SHORT).show();
                } else {
                    criarNovoAluno(frameLayout, input.getText().toString());

                    //TOAST
                    Toast.makeText(getApplicationContext(), input.getText().toString().trim(),
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        mensagem.show();
        // FORÇA O TECLADO APARECER AO ABRIR O ALERT
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);




    }

    public void criarNovoAluno(LinearLayout frameLayout, String texto){

        Aluno alunos = new Aluno(getApplication());
        alunos.setNome(texto);
        alunos.setId(contador);
        novosAlunos.add(contador, alunos);


        //Criando um botão passando o contexto
        CheckBox aluno = new CheckBox(this);
        aluno.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        aluno.setText(texto);
        aluno.setTextSize(30);
        aluno.setId(alunos.getId());

        //Espaçamento
        aluno.setPadding(5, 5, 5, 5);
        frameLayout.addView(aluno);
        contador++;
    }

}
