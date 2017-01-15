package br.unisantos.loginesenhausuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarios = databaseReference.child("Usuarios");
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        if( firebaseAuth.getCurrentUser() != null ) {
            Log.i("VerificaUsuario", "Usuario esta logado");

        }else {
            Log.i("VerificaUsuario", "Usuario NÃO esta logado");
        }


/*
        //login do usuario

        firebaseAuth.signInWithEmailAndPassword("antonioteste@icloud.com", "anonio123").addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if( task.isSuccessful() ) {
                    Log.i("CreateUser", "sucesso");
                }else {
                    Log.i("CreateUser", "Erro ao criar o usuario");
                }

            }
        });

        //Cadastro do usuario

        firebaseAuth.createUserWithEmailAndPassword("antonioteste@icloud.com", "anonio123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if( task.isSuccessful() ) {
                            Log.i("CreateUser", "sucesso");
                        }else {
                            Log.i("CreateUser", "Erro ao criar o usuario");
                        }
                    }
                });*/


    }
}
