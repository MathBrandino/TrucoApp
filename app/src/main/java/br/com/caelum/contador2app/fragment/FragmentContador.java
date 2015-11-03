package br.com.caelum.contador2app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import br.com.caelum.contador2app.R;

/**
 * Created by matheus on 03/11/15.
 */
public class FragmentContador extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contador, container, false);

        Bundle arguments = getArguments();

        TextView nome = (TextView) view.findViewById(R.id.nome);
        nome.setText((String) arguments.getSerializable("nome"));

        RadioButton op0 = (RadioButton) view.findViewById(R.id.opcao_0);
        op0.setText("0");
        op0.toggle();


        RadioButton op1 = (RadioButton) view.findViewById(R.id.opcao_1);
        op1.setText("1");


        RadioButton op2 = (RadioButton) view.findViewById(R.id.opcao_2);
        op2.setText("2");


        RadioButton op3 = (RadioButton) view.findViewById(R.id.opcao_3);
        op3.setText("3");


        RadioButton op4 = (RadioButton) view.findViewById(R.id.opcao_4);
        op4.setText("4");


        RadioButton op5 = (RadioButton) view.findViewById(R.id.opcao_5);
        op5.setText("5");


        RadioButton op6 = (RadioButton) view.findViewById(R.id.opcao_6);
        op6.setText("6");


        RadioButton op7 = (RadioButton) view.findViewById(R.id.opcao_7);
        op7.setText("7");


        RadioButton op8 = (RadioButton) view.findViewById(R.id.opcao_8);
        op8.setText("8");


        RadioButton op9 = (RadioButton) view.findViewById(R.id.opcao_9);
        op9.setText("9");


        RadioButton op10 = (RadioButton) view.findViewById(R.id.opcao_10);
        op10.setText("10");


        RadioButton op11 = (RadioButton) view.findViewById(R.id.opcao_11);
        op11.setText("11");


        RadioButton op12 = (RadioButton) view.findViewById(R.id.opcao_12);
        op12.setText("12");


        return view;

    }
}
