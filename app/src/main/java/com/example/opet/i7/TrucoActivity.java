package com.example.opet.i7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.opet.i7.model.Truco;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class TrucoActivity extends AppCompatActivity {

    private TextView textJogador1;
    private EditText textJogador2;
    private TextView textPonto1;
    private TextView textPonto2;
    private Button btnPonto1;
    private Button btnPonto2;
    private TextView textResultado;
    private Button btnAbandonar;
    private Button btnJogar;

    private String uid;

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truco);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        textJogador1 = findViewById(R.id.textJogador1);
        textJogador2 = findViewById(R.id.textJogador2);
        textPonto1 = findViewById(R.id.textPonto1);
        textPonto2 = findViewById(R.id.textPonto2);
        btnPonto1 = findViewById(R.id.btnPonto1);
        btnPonto2 = findViewById(R.id.btnPonto2);
        textResultado = findViewById(R.id.textResultado);
        btnAbandonar = findViewById(R.id.btnAbandonar);
        btnJogar = findViewById(R.id.btnJogar);

        if (currentUser != null) {
            String email = currentUser.getEmail();

            textJogador1.setText(email);
            uid = currentUser.getUid().toString();
        }
    }

    public void ponto1(View view){

    }

    public void ponto2(View view) {

    }

    public void truco(View view) {

    }

    public void jogarNovamente(View view) {

    }

    public void voltarMenu(View view) {

    }
}
