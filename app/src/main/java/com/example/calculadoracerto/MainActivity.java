package com.example.calculadoracerto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity<mp> extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mp;

    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,
            btsoma, btsubtrair, btmultiplicar, btdividir,
            btponto, btigual, btlimpar, btapagar;

    TextView textoResultado, text2, text3, text4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);



        btsoma = (Button) findViewById(R.id.btSoma);
        btsubtrair = (Button) findViewById(R.id.btSubtrair);
        btdividir = (Button) findViewById(R.id.btDividir);
        btmultiplicar = (Button) findViewById(R.id.btMultiplicar);

        btlimpar = (Button) findViewById(R.id.btLimpar);

        btponto = (Button) findViewById(R.id.btPonto);
        btigual = (Button) findViewById(R.id.btIgual);
        btapagar = (Button) findViewById(R.id.btApagar);

        textoResultado = (TextView) findViewById(R.id.textoResultado);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);

    }
    boolean aux = false;

    @Override
    public void onClick(View v) {






    }

    public void bt0(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "0");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "0");

        }

    }

    public void bt1(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "1");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "1");

        }

    }

    public void bt2(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "2");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "2");

        }

    }

    public void bt3(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "3");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "3");

        }

    }

    public void bt4(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "4");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "4");

        }

    }

    public void bt5(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "5");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "5");

        }

    }

    public void bt6(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "6");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "6");

        }

    }

    public void bt7(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "7");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "7");

        }

    }

    public void bt8(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "8");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "8");

        }

    }

    public void bt9(View v){

        if (aux == false){
            String str = textoResultado.getText().toString();
            textoResultado.setText(str + "9");
        }
        else{
            String str = text2.getText().toString();
            text2.setText(str + "9");

        }

    }


    public void btponto(View v){


            if (aux == false){
                String strponto = textoResultado.getText().toString();

                if(strponto.contains(".")) {

             }
                else{
                String str =  textoResultado.getText().toString();
                textoResultado.setText(str + ".");

                }

            }

         else{
             String strponto = text2.getText().toString();
             if(strponto.contains(".")) {

                }
                else{
                    String str =  text2.getText().toString();
                    text2.setText(str + ".");

                }

            }

        }


    public void btlimpar(View v){
        aux = false;
        textoResultado.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }

    public void btapagar(View v){

        mp = MediaPlayer.create(MainActivity.this, R.raw.odio);
        mp.start();

        if(aux == false){

            String str = textoResultado.getText().toString();
            if (str.length() > 0){

                String str_sub = str.substring(0, str.length() - 1);
                textoResultado.setText(str_sub);

            }
            else{
                textoResultado.setText("");
            }

        }
        else{
            String str = text2.getText().toString();
            if (str.length() > 0){
                String str_sub = str.substring(0, str.length() - 1);
                text2.setText(str_sub);

            }
            else{
                text2.setText("");
            }

        }

    }

    public void btigual(View v){
        String texto1 = textoResultado.getText().toString();
        String texto2 = text2.getText().toString();
        String texto3 = text3.getText().toString();

        mp = MediaPlayer.create(MainActivity.this, R.raw.odiodoispontozero);
        mp.start();

        if (texto2.length()>0){

            double txt1 = Double.parseDouble(texto1);
            double txt2 = Double.parseDouble(texto2);

            if (texto3.contains("*")){

                double conta = (txt1 * txt2);
                String str = Double.toString(conta);
                text4.setText(str);

            }
            else if(texto3.contains("/")){

                double conta = txt1 / txt2;
                String str = Double.toString(conta);
                text4.setText(str);

            }
            else if(texto3.contains("+")){

                double conta = txt1 + txt2;
                String str = Double.toString(conta);
                text4.setText(str);

            }
            else if(texto3.contains("-")){

                double conta = txt1 - txt2;
                String str = Double.toString(conta);
                text4.setText(str);

            }
            else{
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        }
        else{
            Toast.makeText(this, texto1, Toast.LENGTH_SHORT).show();
        }

    }

    public void btsoma(View v){
        aux = true;
        text3.setText("+");
    }

    public void btsubtrair(View v){
        aux = true;
        text3.setText("-");

    }

    public void btmultiplicar(View v){
        aux = true;
        text3.setText("*");

    }

    public void btdividir(View v){
        aux = true;
        text3.setText("/");

    }



}