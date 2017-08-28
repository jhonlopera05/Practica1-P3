package com.jhonlopera.practica1_p3;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView display;
    private String num1 = "", num2 = "", acumulado = "", acumulado2 = "", operacion = "";
    int cmas = 0, cmenos = 0, cpor = 0, cdivision = 0, cpunto = 0;  //contadoras de operacion
    double numero1, numero2, Total;
    private Button bcero, buno, bdos, btres, bcuatro, bcinco, bseis, bsiete, bocho, bnueve, bpunto, bmas, bmenos, bpor, bdivision, bigual;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display = (TextView) findViewById(R.id.display);
        bcero = (Button) findViewById(R.id.cero);
        buno = (Button) findViewById(R.id.uno);
        bdos = (Button) findViewById(R.id.dos);
        btres = (Button) findViewById(R.id.tres);
        bcuatro = (Button) findViewById(R.id.cuatro);
        bcinco = (Button) findViewById(R.id.cinco);
        bseis = (Button) findViewById(R.id.seis);
        bsiete = (Button) findViewById(R.id.siete);
        bocho = (Button) findViewById(R.id.ocho);
        bnueve = (Button) findViewById(R.id.nueve);
        bpunto = (Button) findViewById(R.id.punto);
        bmas = (Button) findViewById(R.id.mas);
        bpor = (Button) findViewById(R.id.por);
        bmenos = (Button) findViewById(R.id.menos);
        bdivision = (Button) findViewById(R.id.division);
        bigual = (Button) findViewById(R.id.igual);
        clear = (Button) findViewById(R.id.clear);


        bcero.setOnClickListener(this);
        buno.setOnClickListener(this);
        bdos.setOnClickListener(this);
        btres.setOnClickListener(this);
        bcuatro.setOnClickListener(this);
        bcinco.setOnClickListener(this);
        bseis.setOnClickListener(this);
        bsiete.setOnClickListener(this);
        bocho.setOnClickListener(this);
        bnueve.setOnClickListener(this);
        bpunto.setOnClickListener(this);
        bmas.setOnClickListener(this);
        bmenos.setOnClickListener(this);
        bpor.setOnClickListener(this);
        bdivision.setOnClickListener(this);
        bigual.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == bcero) {
            if (operacion.equals("")) {
                acumulado += "0";
                display.setText(acumulado);
            } else {
                acumulado2 += "0";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == buno) {
            if (operacion.equals("")) {
                acumulado += "1";
                display.setText(acumulado);
            } else {
                acumulado2 += "1";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bdos) {
            if (operacion.equals("")) {
                acumulado += "2";
                display.setText(acumulado);
            } else {
                acumulado2 += "2";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == btres) {
            if (operacion.equals("")) {
                acumulado += "3";
                display.setText(acumulado);
            } else {
                acumulado2 += "3";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bcuatro) {
            if (operacion.equals("")) {
                acumulado += "4";
                display.setText(acumulado);
            } else {
                acumulado2 += "4";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bcinco) {
            if (operacion.equals("")) {
                acumulado += "5";
                display.setText(acumulado);
            } else {
                acumulado2 += "5";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bseis) {
            if (operacion.equals("")) {
                acumulado += "6";
                display.setText(acumulado);
            } else {
                acumulado2 += "6";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bsiete) {
            if (operacion.equals("")) {
                acumulado += "7";
                display.setText(acumulado);
            } else {
                acumulado2 += "7";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bocho) {
            if (operacion.equals("")) {
                acumulado += "8";
                display.setText(acumulado);
            } else {
                acumulado2 += "8";
                display.setText(acumulado + operacion + acumulado2);
            }
        }
        if (v == bnueve) {
            if (operacion.equals("")) {
                acumulado += "9";
                display.setText(acumulado);
            } else {
                acumulado2 += "9";
                display.setText(acumulado + operacion + acumulado2);
            }

        }
        if (v == bpunto) {

            if (cpunto == 0 && operacion.equals("")) {
                acumulado += ".";
                display.setText(acumulado);
                cpunto += 1;

            }
            if (cpunto == 0 && !(operacion.equals(""))) {
                acumulado2 += ".";
                display.setText(acumulado + operacion + acumulado2);
            }

        }
        if (v == bmas) {

            if (cpunto == 1) {
                cpunto = 0;
            }

            if (operacion.equals("")) {
                numero1 = Double.parseDouble(acumulado);
                display.setText(acumulado + "+");
                operacion = "+";
            } else {
                if (operacion.equals("+")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 + numero2);
                    display.setText(acumulado + "+");
                    acumulado2 = "";
                }
                else if (operacion.equals("-")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 - numero2);
                    display.setText(acumulado + "+");
                    acumulado2 = "";
                }
                else if (operacion.equals("*")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 * numero2);
                    display.setText(acumulado + "+");
                    acumulado2 = "";
                }
                else if (operacion.equals("/")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 / numero2);
                    display.setText(acumulado + "+");
                    acumulado2 = "";
                }
                operacion="+";
            }
        }
        if (v == bmenos) {

            if (cpunto == 1) {
                cpunto = 0;
            }

            if (operacion.equals("")) {
                numero1 = Double.parseDouble(acumulado);
                display.setText(acumulado + "-");
                operacion = "-";
            } else {
                if (operacion.equals("+")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 + numero2);
                    display.setText(acumulado + "-");
                    acumulado2 = "";
                }
                else if (operacion.equals("-")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 - numero2);
                    display.setText(acumulado + "-");
                    acumulado2 = "";
                }
                else if (operacion.equals("*")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 * numero2);
                    display.setText(acumulado + "-");
                    acumulado2 = "";
                }
                else if (operacion.equals("/")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 / numero2);
                    display.setText(acumulado + "-");
                    acumulado2 = "";
                }
                operacion="-";
            }
        }
        if (v == bpor) {

            if (cpunto == 1) {
                cpunto = 0;
            }

            if (operacion.equals("")) {
                numero1 = Double.parseDouble(acumulado);
                display.setText(acumulado + "*");
                operacion = "*";
            } else {
                if (operacion.equals("+")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 + numero2);
                    display.setText(acumulado + "*");
                    acumulado2 = "";
                }
                else if (operacion.equals("-")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 - numero2);
                    display.setText(acumulado + "*");
                    acumulado2 = "";
                }
                else if (operacion.equals("*")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 * numero2);
                    display.setText(acumulado + "*");
                    acumulado2 = "";
                }
                else if (operacion.equals("/")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 / numero2);
                    display.setText(acumulado + "*");
                    acumulado2 = "";
                }
                operacion="*";
            }
        }
        if (v == bdivision) {

            if (cpunto == 1) {
                cpunto = 0;
            }

            if (operacion.equals("")) {
                numero1 = Double.parseDouble(acumulado);
                display.setText(acumulado + "/");
                operacion = "/";
            } else {
                if (operacion.equals("+")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 + numero2);
                    display.setText(acumulado + "/");
                    acumulado2 = "";
                }
                else if (operacion.equals("-")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 - numero2);
                    display.setText(acumulado + "/");
                    acumulado2 = "";
                }
                else if (operacion.equals("*")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 * numero2);
                    display.setText(acumulado + "/");
                    acumulado2 = "";
                }
                else if (operacion.equals("/")) {
                    numero1 = Double.parseDouble(acumulado);
                    numero2 = Double.parseDouble(acumulado2);
                    acumulado = String.valueOf(numero1 / numero2);
                    display.setText(acumulado + "/");
                    acumulado2 = "";
                }
                operacion="/";
            }
        }
        if (v == bigual) {
            numero1 = Double.parseDouble(acumulado);
            numero2 = Double.parseDouble(acumulado2);

            if (operacion.equals("+")) {
                Total = numero1 + numero2;

            } else if (operacion.equals("-")) {
                Total = numero1 - numero2;

            } else if (operacion.equals("*")) {
                Total = numero1 * numero2;
            } else if (operacion.equals("/")) {
                Total = numero1 / numero2;
            }
            Total=Math.rint(Total*10000)/10000;
            acumulado = String.valueOf(Total);
            display.setText(String.format("%.3f",Total));

            //acumulado = "";
            acumulado2 = "";
            operacion="";

        }

        if (v == clear) {
            acumulado = "";
            acumulado2 = "";
            operacion = "";
            cmas = 0;
            cmenos = 0;
            cpor = 0;
            cdivision = 0;
            cpunto = 0;
            numero1 = 0;
            numero2 = 0;
            display.setText("");
            display.setHint("0");
        }


    }
}
