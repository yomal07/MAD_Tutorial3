package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etAct2_1;
    EditText etAct2_2;
    TextView tvAns;
    Button btnAdd;
    Button btnSubstarct;
    Button btnMultiply;
    Button btnDivision;
    String number1;
    Float number_1;
    String number2;
    Float number_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etAct2_1 = findViewById(R.id.num1_input);
        etAct2_2 = findViewById(R.id.num2_input);
        tvAns = findViewById(R.id.tv_answer);
        btnAdd = findViewById(R.id.btn_add);
        btnSubstarct = findViewById(R.id.btn_substract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivision = findViewById(R.id.btn_devision);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("num1");
        number2 = intent.getStringExtra("num2");

        etAct2_1.setText(number1);
        etAct2_2.setText(number2);

        number_1 = Float.parseFloat(number1);
        number_2 = Float.parseFloat(number2);
    }

    public void onClick_add(View view){
        Float answerAdd = number_1 + number_2;
        String addAnsString = new Float(answerAdd).toString();
        tvAns.setText(number1 + " + " +number2+ " = " + addAnsString);
    }

    public void onClick_sub(View view){
        Float answerSub = number_1 - number_2;
        String subAnsString = new Float(answerSub).toString();
        tvAns.setText(number1+" - "+number2+" = "+subAnsString);
    }

    public void onClick_multiply(View view){
        Float answerMult = number_1 * number_2;
        String multAnsString = new Float(answerMult).toString();
        tvAns.setText(number1+" * "+number2+" = "+multAnsString);
    }

    public void onClick_div(View view){
        Float answerDiv = number_1/number_2;
        String divAnsString = new Float(answerDiv).toString();
        tvAns.setText(number1+" / "+number2+" = "+divAnsString);
    }

}