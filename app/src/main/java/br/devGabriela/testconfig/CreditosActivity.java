package br.devGabriela.testconfig;
import br.devGabriela.testconfig.R;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        Intent it = getIntent();
        String nome = it.getStringExtra("nome");

        TextView txtCredits = findViewById(R.id.txtCredits);
        txtCredits.setText("Desenvolvido por " + nome);
    }

    public void acessarLayoutMain(View v){
        finish();
    }
}