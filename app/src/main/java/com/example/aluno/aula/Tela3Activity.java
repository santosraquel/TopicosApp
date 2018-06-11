package com.example.aluno.aula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela3Activity extends AppCompatActivity {
    private EditText EditTextValor;
    private EditText EditTextCotacao;
    private Button buttonCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        EditTextValor = (EditText) findViewById(R.id.editTextValor);
        EditTextCotacao = (EditText) findViewById(R.id.editTextCotacao);
        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor = Double.parseDouble(EditTextValor.getText().toString());
                double valorCot = Double.parseDouble(EditTextCotacao.getText().toString());

                double Resultado = (valor*valorCot);



            }
        });


    }
}
