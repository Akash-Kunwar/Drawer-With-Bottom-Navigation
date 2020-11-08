package com.touchizen.drawerwithbottomnavigation.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.touchizen.drawerwithbottomnavigation.Dream11;
import com.touchizen.drawerwithbottomnavigation.NostraPro;
import com.touchizen.drawerwithbottomnavigation.R;

public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
    @Override
    public void onStart() {
        super.onStart();
        View v=getView();
        Button gamezy,dream11,ballebazi,nostra;
        gamezy = (Button)v.findViewById(R.id.gamezy);
        dream11 =(Button)v.findViewById(R.id.dream11);
        ballebazi =(Button)v.findViewById(R.id.ballebazi);
        nostra =(Button)v.findViewById(R.id.nostra);

        gamezy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dream11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getActivity(), Dream11.class);
                startActivity(i);
            }
        });
        ballebazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        nostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), NostraPro.class);
                startActivity(i);
            }
        });

    }
}