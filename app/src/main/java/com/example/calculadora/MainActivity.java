package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String Symbol;


    private TextView resultado;
    private Button Key_Pad0, Key_Pad1, Key_Pad2, Key_Pad3, Key_Pad4, Key_Pad5, Key_Pad6, Key_Pad7, Key_Pad8, Key_Pad9;
    private Button key_PadResta, Key_PadSuma, Key_PadDivision, Key_PadMultiplicacion, Key_PadLimpiar,Key_Padigual;



    @Override //sobre escritura de metodos
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);

        Key_Pad0= findViewById(R.id.num_cero);
        Key_Pad1= findViewById(R.id.num_uno);
        Key_Pad2= findViewById(R.id.num_dos);
        Key_Pad3= findViewById(R.id.num_tres);
        Key_Pad4= findViewById(R.id.num_cuatro);
        Key_Pad5= findViewById(R.id.num_cinco);
        Key_Pad6= findViewById(R.id.num_seis);
        Key_Pad7= findViewById(R.id.num_siete);
        Key_Pad8= findViewById(R.id.num_ocho);
        Key_Pad9= findViewById(R.id.num_nueve);


        Key_Padigual= findViewById(R.id.num_igual);
        Key_PadLimpiar= findViewById(R.id.num_borrar);
        Key_PadSuma= findViewById(R.id.num_suma);
        key_PadResta= findViewById(R.id.num_resta);
        Key_PadDivision= findViewById(R.id.division);
        Key_PadMultiplicacion= findViewById(R.id.num_multiplicacion);


        Key_Pad0.setOnClickListener(this);
        Key_Pad1.setOnClickListener(this);
        Key_Pad2.setOnClickListener(this);
        Key_Pad3.setOnClickListener(this);
        Key_Pad4.setOnClickListener(this);
        Key_Pad5.setOnClickListener(this);
        Key_Pad6.setOnClickListener(this);
        Key_Pad7.setOnClickListener(this);
        Key_Pad8.setOnClickListener(this);
        Key_Pad9.setOnClickListener(this);

        Key_Padigual.setOnClickListener(this);
        Key_PadLimpiar.setOnClickListener(this);
        Key_PadSuma.setOnClickListener(this);
        key_PadResta.setOnClickListener(this);
        Key_PadDivision.setOnClickListener(this);
        Key_PadMultiplicacion.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;



            case R.id.num_suma:
                Symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_resta:
                Symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.num_multiplicacion:
                Symbol = "*";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.division:
                Symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;


            case R.id.num_borrar:
                Symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                resultado.setText("");
                break;

            case R.id.num_igual:
                num2 = Integer.parseInt(numero);

                switch (Symbol){
                    case "-":
                        resultado.setText("" + (num1 - num2));
                        break;

                    case "+":
                        resultado.setText("" + (num1 + num2));
                        break;

                    case "/":
                        resultado.setText("" + (num1 / num2));
                        break;

                    case "*":
                        resultado.setText("" + (num1 * num2));
                        break;



                }
                numero = "";
                num1 = 0;
                num2 = 0;
                break;



        }



    }
}
