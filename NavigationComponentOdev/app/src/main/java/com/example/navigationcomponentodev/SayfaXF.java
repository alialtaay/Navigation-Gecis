package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SayfaXF extends Fragment {
    private Button buttonY2;

    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tasarim = inflater.inflate(R.layout.fragment_sayfa_x, container, false);

        buttonY2 = tasarim.findViewById(R.id.buttonY2);
        buttonY2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.sayfaY2Gecis);

            }



        });
        return tasarim;
    }
}