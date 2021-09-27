package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String firstStr = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String secondStr = secondNumber.getText().toString();
        Integer first = Integer.parseInt(firstStr);
        Integer second = Integer.parseInt(secondStr);

        Integer answer = first + second;
        String answerString = String.valueOf(answer);
        goToActivity2(answerString);
    }

    public void subtractFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String firstStr = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String secondStr = secondNumber.getText().toString();
        Integer first = Integer.parseInt(firstStr);
        Integer second = Integer.parseInt(secondStr);

        Integer answer = first - second;
        String answerString = String.valueOf(answer);
        goToActivity2(answerString);

    }

    public void multiplyFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String firstStr = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String secondStr = secondNumber.getText().toString();
        Integer first = Integer.parseInt(firstStr);
        Integer second = Integer.parseInt(secondStr);



        Integer answer = first*second;
        String answerString = String.valueOf(answer);
        goToActivity2(answerString);
    }

    public void divideFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String firstStr = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String secondStr = secondNumber.getText().toString();
        Integer first = Integer.parseInt(firstStr);
        Integer second = Integer.parseInt(secondStr);

        Integer answer = first/second;
        String answerString = String.valueOf(answer);
        goToActivity2(answerString);

    }

    public void goToActivity2(String answer) {
        Intent intent = new Intent(this,  MainActivity2.class);
        intent.putExtra("message", answer);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}