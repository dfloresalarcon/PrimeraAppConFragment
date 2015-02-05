package com.example.dfloresalarcon.primeraappconfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dfloresalarcon on 30/01/15.
 */
public class FragmentB extends Fragment {

    public FragmentB(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sencond, container, false);

        return rootView;
    }
}
