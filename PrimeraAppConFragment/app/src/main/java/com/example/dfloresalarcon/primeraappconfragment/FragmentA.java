package com.example.dfloresalarcon.primeraappconfragment;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dfloresalarcon on 29/01/15.
 */
public class FragmentA extends Fragment {

    public FragmentA(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //RECOGER EL BOTON DEL LAYOUT
        Button abrirB = (Button) rootView.findViewById(R.id.openB);

        final Bundle b = savedInstanceState;


        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            abrirB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //tostada
                    Toast.makeText(getActivity(), "Abriendooo", Toast.LENGTH_LONG).show();

                    if (b == null) {
                        getFragmentManager().beginTransaction()
                                .add(R.id.contenedorDer, new FragmentB())
                                .commit();
                    }
                }
            });

        }
        else
        {
            abrirB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //tostada
                    Toast.makeText(getActivity(), "Abriendooo", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intent);
                }
            });
        }



        return rootView;
    }
}
