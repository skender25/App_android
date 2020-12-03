package com.example.navprueba.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navprueba.Main2Activity;
import com.example.navprueba.R;
import com.example.navprueba.Videobienvenida;

public class HomeFragment extends Fragment {
    private View view;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       homeViewModel =
               ViewModelProviders.of(this).get(HomeViewModel.class);
         view = inflater.inflate(R.layout.fragment_home, container, false);
        Button button = (Button) view.findViewById(R.id.button);
      //  ImageButton img = (ImageButton)view.findViewById(R.id.imageButton3);
        configureImageButton();
      //  ImageButton.OnClickListener

       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Videobienvenida.class);
                startActivity(intent);
            }
        });*/


        return view;

    }

    private void configureImageButton() {
        // TODO Auto-generated method stub
        ImageButton btn = (ImageButton) view.findViewById(R.id.imageButton3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Videobienvenida.class);
                startActivity(intent);
            }
        });




    }
}
