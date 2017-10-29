package cl.inacap.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button suma, resta, divide, multiplica, calculo, borrar, num1, num2,
            num3, num4, num5,num6, num7, num8, num9, num0, decimal, negativo;

    EditText inputNumero,inputConcatena;
    double numero1 = Double.NaN, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacion de objetos con elementos de las interfaz

        suma = (Button) findViewById(R.id.btnSuma);
        resta= (Button) findViewById(R.id.btnResta);
        multiplica = (Button) findViewById(R.id.btnMultiplo);
        divide = (Button) findViewById(R.id.btnDivide);
        calculo = (Button) findViewById(R.id.btnIgual);
        borrar =(Button) findViewById(R.id.btnBorrar);
        num0 =(Button) findViewById(R.id.btnNum0);
        num1 =(Button) findViewById(R.id.btnNum1);
        num2 =(Button) findViewById(R.id.btnNum2);
        num3 =(Button) findViewById(R.id.btnNum3);
        num4 =(Button) findViewById(R.id.btnNum4);
        num5 =(Button) findViewById(R.id.btnNum5);
        num6 =(Button) findViewById(R.id.btnNum6);
        num7 =(Button) findViewById(R.id.btnNum7);
        num8 =(Button) findViewById(R.id.btnNum8);
        num9 =(Button) findViewById(R.id.btnNum9);
        decimal =(Button) findViewById(R.id.btnDecimal);
        inputNumero = (EditText) findViewById(R.id.edtinputNumero);



        //asignar Botones a evento On Click

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplica.setOnClickListener(this);
        divide.setOnClickListener(this);
        calculo.setOnClickListener(this);
        borrar.setOnClickListener(this);
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        decimal.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            //Construccion de numero
            case R.id.btnNum0:
                inputConcatena = (EditText)  findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"0"); break;
            case R.id.btnNum1:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"1"); break;
            case R.id.btnNum2:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"2"); break;
            case R.id.btnNum3:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"3"); break;
            case R.id.btnNum4:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"4"); break;
            case R.id.btnNum5:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"5"); break;
            case R.id.btnNum6:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"6"); break;
            case R.id.btnNum7:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"7"); break;
            case R.id.btnNum8:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"8"); break;
            case R.id.btnNum9:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"9"); break;
            case R.id.btnDecimal:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                inputNumero.setText(inputConcatena.getText().toString()+"."); break;

            //Operaciones de calculo
            case R.id.btnSuma:
                operador="+";
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                numero1=Double.parseDouble(inputConcatena.getText().toString());
                inputNumero.setText(""); break;

            case R.id.btnResta:
                operador="-";
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                numero1=Double.parseDouble(inputConcatena.getText().toString());
                inputNumero.setText(""); break;

            case R.id.btnMultiplo:
                operador="*";
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                numero1=Double.parseDouble(inputConcatena.getText().toString());
                inputNumero.setText(""); break;

            case R.id.btnDivide:
                operador="/";
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                numero1=Double.parseDouble(inputConcatena.getText().toString());
                inputNumero.setText(""); break;

            case R.id.btnBorrar:
                numero1 = 0;
                numero2 = 0;
                inputNumero.setText(""); break;

            case R.id.btnIgual:
                inputConcatena = (EditText) findViewById(R.id.edtinputNumero);
                numero2 = Double.parseDouble(inputConcatena.getText().toString());

                if(operador.equals("+")){
                    inputNumero.setText("");
                    resultado = numero1 + numero2;

                }

                if(operador.equals("-")){
                    inputNumero.setText("");
                    resultado = numero1 - numero2;

                }

                if(operador.equals("*")){
                    inputNumero.setText("");
                    resultado = numero1 * numero2;

                }

                if(operador.equals("/")){
                    inputNumero.setText("");
                    if(numero2 !=0){
                        resultado = numero1 / numero2;
                    }else{
                        inputNumero.setText("Error");
                    }
                }

                inputNumero.setText(String.valueOf(resultado));


        }
    }


}


            /*



            */