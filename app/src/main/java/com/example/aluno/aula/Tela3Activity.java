package com.example.aluno.aula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela3Activity extends AppCompatActivity {
    private EditText EditTextValor;
    private EditText EditTextCotacao;
    private Button buttonCalcular;
    private TextView conversao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        EditTextValor = (EditText) findViewById(R.id.editTextValor);
        EditTextCotacao = (EditText) findViewById(R.id.editTextCotacao);
        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
        conversao = (TextView) findViewById(R.id.textConversao);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor = Double.parseDouble(EditTextValor.getText().toString());
                double valorCot = Double.parseDouble(EditTextCotacao.getText().toString());

                double ValorReal = (valor*valorCot);
                conversao.setText("O valor em dólar é:"+ValorReal);


            }
        });


    }
}
