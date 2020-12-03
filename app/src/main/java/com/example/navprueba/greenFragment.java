package com.example.navprueba;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class greenFragment extends Fragment {
    private View view;
    public greenFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view =inflater.inflate(R.layout.fragment_green, container, false);
       // getActivity().setTitle("Form");

       // Button btn = (Button) view.findViewById(R.id.btn);
        configureImageButton();

      /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getActivity(),Main2Activity.class);
                // intent.putExtra("Some" , "some acti");
                 startActivity(intent);
            }
        });

        Button btn2 = (Button) view.findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),adivinar_numero.class);
                // intent.putExtra("Some" , "some acti");
                startActivity(intent);
            }
        });*/

return view;
    }


    private void configureImageButton() {
        // TODO Auto-generated method stub
        ImageButton btn1 = (ImageButton) view.findViewById(R.id.btnaleresp);
        ImageButton btn2 = (ImageButton) view.findViewById(R.id.btnadivina);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Main2Activity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(),adivinar_numero.class);
                startActivity(intent1);
            }
        });



    }





}
