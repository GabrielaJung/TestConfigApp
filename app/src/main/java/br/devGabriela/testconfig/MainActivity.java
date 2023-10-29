package br.devGabriela.testconfig;
import br.devGabriela.testconfig.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText txtNome;
    EditText txtEmail;
    Button buttonAdd;

    // classe compatível com o tipo listener
    View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("EVT", "EVT Click no botao");
            adicionar(v);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // busca elementos da tela
        txtNome = findViewById(R.id.textEditNome);
        txtEmail = findViewById(R.id.textEditEmail);
        buttonAdd = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(btnClickListener);
    }

    public void acessarLayoutDois(View v){
        Intent it = new Intent(getBaseContext(), CreditosActivity.class);
        it.putExtra("nome", txtNome.getText().toString());
        startActivity(it);
    }

    public void adicionar(View v){
        Pessoa p = new Pessoa();
        p.setNome(txtNome.getText().toString());
        p.setEmail(txtEmail.getText().toString());
        Toast.makeText(getBaseContext(), p.toString(), Toast.LENGTH_LONG).show();
    }
}