package com.example.navprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class respondetrick extends AppCompatActivity {
    EditText editText;

    TextView txt;

    EditText editText2;

    TextView textView;

    String ffinal = "";

    int i = 0;

    int numletras;

    String outfinal;

    CharSequence pResponder = "Alejandro Responde la siguiente Pregunta";


    String pResponderS = pResponder.toString();

    char[] pResponderA = pResponderS.toCharArray();

    int r2;

    String respuestaS;

    String respuestaSS = "";

    char[] respuestaSSA;

    byte testByte = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respondetrick);


        editText = (EditText) findViewById(R.id.editText);
        final CharSequence respuesta = editText.getText();
        editText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        //  txt = (TextView)findViewById(R.id.texto);
        textView = (TextView) findViewById(R.id.textView);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);

        r2 = (int) Math.round(Math.random() * 10.00);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String altanero;
                if (ffinal != "") {
                    Toast.makeText(getApplicationContext(), ffinal.replace(".",""), 1).show();
                } else {
                    String str;
                    switch (r2) {
                        case 1:
                            altanero = "Tienes que vaciar tu mente";
                            break;
                        case 2:
                            altanero = "Hay pensamientos impuros en tu mente";
                            break;
                        case 3:
                            altanero = "Tu mente no está en optimas condiciones";
                            break;
                        case 4:
                            altanero = "Solo personas con pensamientos puros pueden conectarse a distancia";
                            break;
                        case 5:
                            altanero = "Aprende a dejar tu mente en silencio";
                            break;
                        case 6:
                            altanero = "Te falta concentración";
                            break;
                        case 7:
                            altanero = "Ténes que esforzarte menos y aprender a fluir";
                            break;
                        case 8:
                            altanero = "No intentes hacerlo , hazlo";
                            break;
                        case 9:
                            altanero = "A las personas incredulas les cuesta fluir";
                            break;
                        default:
                            altanero = "El no cree sin ver ni aun viendo creerá...";
                            break;

                    }
                    Toast.makeText(getApplicationContext(), altanero, 1).show();

                }



            }
        });


        //   button1.setOnClickListener(new View.OnClickListener() {
        //       public void onClick(View param1View) {

      /*  button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });*/


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this.getBaseContext(), MainActivity.class);
                //  MainActivity.this.startActivity(intent);
                //  MainActivity.this.finish();
                Intent intent = new Intent(respondetrick.this.getBaseContext(), respondetrick.class);
                respondetrick.this.startActivity(intent);
                respondetrick.this.finish();

            }
        });


    }

    public void ayuda(View vista) {
        String altanero;

        switch (r2) {
            case 1:
                altanero = "Tienes que vaciar tu mente";
                break;
            case 2:
                altanero = "Hay pensamientos impuros en tu mente";
                break;
            case 3:
                altanero = "Tu mente no está en optimas condiciones";
                break;
            case 4:
                altanero = "Solo personas con pensamientos puros pueden conectarse a distancia";
                break;
            case 5:
                altanero = "Aprende a dejar tu mente en silencio";
                break;
            case 6:
                altanero = "Te falta concentración";
                break;
            case 7:
                altanero = "Ténes que esforzarte menos y aprender a fluir";
                break;
            case 8:
                altanero = "No intentes hacerlo , hazlo";
                break;
            case 9:
                altanero = "A las personas incredulas les cuesta fluir";
                break;
            default:
                altanero = "El no cree sin ver ni aun viendo creerá...";
                break;
        }
        Toast.makeText(getApplicationContext(), altanero, 1).show();
    }

    public void bandera(View vista) {
        onBackPressed();

    }
}
