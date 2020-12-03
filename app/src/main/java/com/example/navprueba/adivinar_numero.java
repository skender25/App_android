package com.example.navprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class adivinar_numero extends AppCompatActivity {
    EditText editText;
    TextView textView;
    TextView R1;
    TextView R2;
    TextView C1;
    TextView p1;
    ImageButton button3;
    ImageButton button2;
    int arg;
    char cat ;
    ImageButton img ;

    int i =1 ;
    int suma=1;
    boolean bandera = false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adivinar_numero);


        textView = findViewById(R.id.textView);
        R1 = findViewById(R.id.respuesta);
        R2 = findViewById(R.id.respuesta2);
        p1 = findViewById(R.id.pgt);

        C1 = findViewById(R.id.textView2);
        final ImageButton button1 = (ImageButton) findViewById(R.id.sibtn);
         button2 = (ImageButton) findViewById(R.id.btnno);

         button3 = (ImageButton) findViewById(R.id.otravez);
        img = (ImageButton)findViewById(R.id.imageButton);

    /*    editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {



            }

            @Override
            public void afterTextChanged(Editable s) {

                String test = editText.getText().toString();
                String caca = ".jamiaca.";


                textView.setText( caca.replace("." , "") );

            }
        });*/

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1
                //  R2.setText("?");
                if (i == 1){
                    suma = 1;

                    img.setImageResource(R.drawable.numero2);
                    textView.setText("pregunta 2");
                    p1.setText("Y ahora?");

                }
                //2
                if (i == 2){

                    suma = suma + 2;
                    textView.setText("pregunta 3");
                    img.setImageResource(R.drawable.numero3);
                    p1.setText("Y aqui?");
                }
                //3
                if (i == 3){

                    suma = suma + 4;
                    textView.setText("pregunta 4");
                    img.setImageResource(R.drawable.numero4);
                    p1.setText("Mira fijamente el numero , si está en la lista?");

                }
                //4
                if (i == 4){

                    suma = suma + 8;
                    textView.setText("pregunta 5");
                    img.setImageResource(R.drawable.numero5);
                    p1.setText("Y en esta lista?");

                }//5
                if (i == 5){

                    suma = suma + 16;
                    textView.setText("pregunta 6");
                    img.setImageResource(R.drawable.numero6);


                }
                //6
                if (i == 6){

                    suma = suma + 32;

                }
                i ++;

                // textView.setText(suma);
                if (i > 6) {
                    if (arg==2) {
                        suma = suma -1;
                        R1.setText("Estas pensando en el numero:");
                        R2.setText(Integer.toString(suma));
                        button2.setEnabled(false);
                        button1.setEnabled(false);
                    }else {
                        R1.setText("Estas pensando en el numero:");
                        R2.setText(Integer.toString(suma));
                        button2.setEnabled(false);
                        button1.setEnabled(false);
                    }
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this.getBaseContext(), MainActivity.class);
                //  MainActivity.this.startActivity(intent);
                //  MainActivity.this.finish();
           /*   i ++ ;
              textView.setText(Integer.toString(suma));*/

                if (i == 1){

                    arg = 2;
                    img.setImageResource(R.drawable.numero2);
                    textView.setText("pregunta 2");
                    p1.setText("Y ahora?");

                }
                //2
                if (i == 2){


                    textView.setText("pregunta 3");
                    p1.setText("Y ahora?");
                    img.setImageResource(R.drawable.numero3);
                }
                //3
                if (i == 3){


                    textView.setText("pregunta 4");
                    p1.setText("Y aqui?");
                    img.setImageResource(R.drawable.numero4);

                }
                //4
                if (i == 4){


                    p1.setText("Mira fijamente el numero , si está en la lista?");
                    textView.setText("pregunta 4");
                    img.setImageResource(R.drawable.numero5);

                }//5
                if (i == 5){


                    p1.setText("Y en esta lista?");
                    textView.setText("pregunta 6");
                    img.setImageResource(R.drawable.numero6);


                }
                //6
                if (i == 6){



                }

                i ++;
                // textView.setText(suma);
                if (i > 6) {
                    if (arg==2) {
                        suma = suma -1;
                        R1.setText("Estas pensando en el numero:");
                        R2.setText(Integer.toString(suma));
                        button2.setEnabled(false);
                        button1.setEnabled(false);
                    }else {
                        R1.setText("Estas pensando en el numero:");
                        R2.setText(Integer.toString(suma));
                        button2.setEnabled(false);
                        button1.setEnabled(false);
                    }

                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this.getBaseContext(), MainActivity.class);
                //  MainActivity.this.startActivity(intent);
                //  MainActivity.this.finish();
                Intent intent = new Intent(adivinar_numero.this.getBaseContext(), adivinar_numero.class);
                adivinar_numero.this.startActivity(intent);
                adivinar_numero.this.finish();

            }
        });




    }

    public void Volver(View vista1) {
        onBackPressed();

    }
}
