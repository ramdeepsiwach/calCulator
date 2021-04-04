package com.se_p2.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    TextView result;
    TextView input;
    boolean addition=false;
    boolean subtraction =false;
    boolean multiply=false;
    boolean division=false;
    float numberOne=0;
    boolean newStringFlag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        input=findViewById(R.id.input);
    }
    public void button0Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s0", result.getText()));
    }

    public void button1Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s1", result.getText()));
    }

    public void button2Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s2", result.getText()));
    }
    public void button3Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s3", result.getText()));
    }
    public void button4Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s4", result.getText()));
    }

    public void button5Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s5", result.getText()));
    }

    public void button6Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s6", result.getText()));
    }
    public void button7Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s7", result.getText()));
    }
    public void button8Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s8", result.getText()));
    }

    public void button9Clicked(View view) {
        if (!newStringFlag) {
            buttonCClicked(view);
            newStringFlag = true;
        }
        result.setText(String.format("%s9", result.getText()));
    }

    public void buttonCClicked(View view) {
        result.setText(null);
        input.setText(null);
    }

    public void buttonAddClicked(View view) {
        numberOne=Float.parseFloat(result.getText().toString());
        input.setText(String.format("%s+", numberOne));
        addition=true;
        newStringFlag=true;
        result.setText(null);
    }
    public void buttonSubClicked(View view) {
        numberOne=Float.parseFloat(result.getText().toString());
        input.setText(String.format("%s-", numberOne));
        subtraction =true;
        newStringFlag=true;
        result.setText(null);
    }
    public void buttonMultiClicked(View view) {
        numberOne=Float.parseFloat(result.getText().toString());
        input.setText(String.format("%s*", numberOne));
        multiply=true;
        newStringFlag=true;
        result.setText(null);
    }

    public void buttonDivideClicked(View view) {
        numberOne=Float.parseFloat(result.getText().toString());
        input.setText(String.format("%s/", numberOne));
        division=true;
        newStringFlag=true;
        result.setText(null);
    }

    public void buttonEquClicked(View view) {
        float numberTwo=Float.parseFloat(result.getText().toString());
        newStringFlag=false;
        if(addition){
            input.setText(String.format("%s%s", input.getText(), numberTwo));
            result.setText(String.valueOf(numberOne+numberTwo));
            addition=false;
        }
        if(subtraction){
            input.setText(String.format("%s%s", input.getText(), numberTwo));
            result.setText(String.valueOf(numberOne-numberTwo));
            subtraction =false;
        }
        if(multiply){
            input.setText(String.format("%s%s", input.getText(), numberTwo));
            result.setText(String.valueOf(numberOne*numberTwo));
            multiply=false;
        }
        if(division){
            input.setText(String.format("%s%s", input.getText(), numberTwo));
            result.setText(String.valueOf(numberOne/numberTwo));
            division=false;
        }
    }
}