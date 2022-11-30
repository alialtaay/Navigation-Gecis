package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationcomponentodev.databinding.FragmentAnaSayfaBinding;


public class AnaSayfaF extends Fragment {
    private Button buttonA;
    private Button buttonX;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View tasarim = inflater.inflate(R.layout.fragment_ana_sayfa, container, false);
        buttonX = tasarim.findViewById(R.id.buttonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.sayfaXGecis);
            }
        });
        buttonA = tasarim.findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.sayfaGecis);
            }
        }

        );


        return tasarim;
    }
}