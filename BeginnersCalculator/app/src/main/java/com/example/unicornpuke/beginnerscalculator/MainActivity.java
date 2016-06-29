package com.example.unicornpuke.beginnerscalculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonAdd, buttonSub, buttonMult, buttonDiv;
    private TextView calcResult;
    private EditText calcFirst, calcSec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonSub = (Button)findViewById(R.id.buttonSub);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonMult = (Button)findViewById(R.id.buttonMult);
        calcResult = (TextView)findViewById(R.id.calcResult);
        calcFirst = (EditText)findViewById(R.id.calcFirst);
        calcSec = (EditText)findViewById(R.id.calcSec);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num1 = calcFirst.getText().toString();
        String num2 = calcSec.getText().toString();

        switch (view.getId()){
            case R.id.buttonAdd:
                float addition = (float) Integer.parseInt(num1) + Integer.parseInt(num2);
                calcResult.setText(String.valueOf(addition));
                break;
            case R.id.buttonSub:
                float subtraction = (float) Integer.parseInt(num1) - Integer.parseInt(num2);
                calcResult.setText(String.valueOf(subtraction));
                break;
            case R.id.buttonMult:
                float multiplication = (float) Integer.parseInt(num1) * Integer.parseInt(num2);
                calcResult.setText(String.valueOf(multiplication));
                break;
            case R.id.buttonDiv:
                try{
                    float division = (float) Integer.parseInt(num1) / Integer.parseInt(num2);
                    calcResult.setText(String.valueOf(division));
                }catch (Exception e){
                    calcResult.setText("Cannot divide!!");
                }
                break;
        }
    }
}
