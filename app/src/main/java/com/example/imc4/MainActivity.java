package com.example.imc4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    //Objetos encapsulados
    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;
    private TextView textViewResultado;
    private TextView textViewMaior;
    private TextView textViewMenor;




    //Metódo Principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculado os objetos com elementos do layouts
        editTextNota1 = findViewById(R.id.edit_text_nota1);
        editTextNota2 = findViewById(R.id.edit_text_nota2);
        editTextNota3 = findViewById(R.id.edit_text_nota3);




        textViewResultado = findViewById(R.id.text_view_resultado );
        textViewResultado.setText("");





    }

    public void calcularIMC(View v)
    {
        Double nota1 = Double.parseDouble(editTextNota1.getText()
                .toString()
                .replace(",","."));

        Double nota2 = Double.parseDouble(editTextNota2.getText()
                .toString()
                .replace(",","."));

        Double nota3 = Double.parseDouble(editTextNota3.getText()
                .toString()
                .replace(",","."));




        Double media = (nota1+nota2+nota3)/3;



        textViewResultado.setText(media.toString());

        if(nota1 > nota2 && nota1 > nota3)
        {
            textViewMaior = findViewById(R.id.text_view_resultado3 );
            textViewMaior.setText(nota1.toString());
        }
        if(nota2 > nota1 && nota2 > nota3)
        {
            textViewMaior = findViewById(R.id.text_view_resultado3 );
            textViewMaior.setText(nota2.toString());
        }
        if(nota3 > nota1 && nota3 > nota2)
        {
            textViewMaior = findViewById(R.id.text_view_resultado3 );
            textViewMaior.setText(nota3.toString());
        }


        if(nota1 < nota2 && nota1 < nota3)
        {
            textViewMenor = findViewById(R.id.text_view_resultado2 );
            textViewMenor.setText(nota1.toString());

        }

        if(nota2 < nota1 && nota2 < nota3)
        {
            textViewMenor = findViewById(R.id.text_view_resultado2 );
            textViewMenor.setText(nota2.toString());

        }

        if(nota3 < nota1 && nota3 < nota2)
        {
            textViewMenor = findViewById(R.id.text_view_resultado2 );
            textViewMenor.setText(nota3.toString());

        }













    }
    public void trocaActivity(View v){

        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("RESULTADO","22.6");
        startActivity(intent);


    }




}
