package br.com.caelum.contador2app.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.caelum.contador2app.R;
import br.com.caelum.contador2app.fragment.FragmentContador;

public class TelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        Toolbar toolbar = (Toolbar) findViewById(R.id.layout_toolbar);
        setSupportActionBar(toolbar);

        FragmentContador contadorEsquerda = new FragmentContador();
        Bundle bundle = new Bundle();
        bundle.putSerializable("nome", "Nós");
        contadorEsquerda.setArguments(bundle);
        Bundle bundle1 = new Bundle();
        bundle1.putSerializable("nome", "Eles");
        FragmentContador contatorDireita = new FragmentContador();
        contatorDireita.setArguments(bundle1);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_esquerda, contadorEsquerda);
        transaction.replace(R.id.frame_direita, contatorDireita);
        transaction.commit();
    }
}
