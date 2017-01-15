package br.unisantos.iampresent;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by anjun on 24/12/2016.
 */

public class Aluno {


    private int id;
    private String nome;
    private boolean marcado;
    private int presencaTotal = 0;

    //SHARED PREFERENCES
    private Context contexto;
    private SharedPreferences sharedPreferences;
    private final String NOME_AQUIVO = "lista_preferencia";
    private int MODE = 0;
    private SharedPreferences.Editor editor;



    public Aluno (Context contexAplicacao) {

        contexto = contexAplicacao;
        sharedPreferences = contexto.getSharedPreferences(NOME_AQUIVO, MODE);
        editor = sharedPreferences.edit();

    }

    public void salvarUsuario(String nome, int id, boolean marcado, int presencaTotal) {

        editor.putString("Nome", nome);
        editor.putInt("ID", id);
        editor.putInt("Presenca", presencaTotal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public int getPresencaTotal() {
        return presencaTotal;
    }

    public void setPresencaTotal(int presencaTotal) {
        this.presencaTotal = presencaTotal;
    }
}
