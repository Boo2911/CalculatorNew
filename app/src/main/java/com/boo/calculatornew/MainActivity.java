package com.boo.calculatornew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstVal, secondVal;
    TextView outputVal;
    Button add, sub, mul, div, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstVal = findViewById(R.id.firstVal);
        secondVal = findViewById(R.id.secondVal);

        outputVal = findViewById(R.id.output);

        add = findViewById(R.id.btnPlus);
        sub = findViewById(R.id.btnMinus);
        mul = findViewById(R.id.btnMultiply);
        div = findViewById(R.id.btnDivide);

        reset = findViewById(R.id.btnReset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstVal.getText()!=null || secondVal.getText()!=null) {
                    try {
                double first, second, output;
                String firstStr = firstVal.getText().toString();
                String secondStr = secondVal.getText().toString();
                if(firstStr=="" || secondStr==""){
                    Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                }
                first = Double.parseDouble(firstStr);
                second = Double.parseDouble(secondStr);
                output = first + second;
                outputVal.setText("Addition is: "+output+" ");
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstVal.getText()!=null || secondVal.getText()!=null) {
                    try {
                double first, second, output;
                String firstStr = firstVal.getText().toString();
                String secondStr = secondVal.getText().toString();
                if(firstStr=="" || secondStr==""){
                    Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                }
                first = Double.parseDouble(firstStr);
                second = Double.parseDouble(secondStr);
                output = first - second;
                outputVal.setText("Subtraction is: "+output+" ");
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
            }
        }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstVal.getText()!=null || secondVal.getText()!=null) {
                    try {
                        double first, second, output;
                        String firstStr = firstVal.getText().toString();
                        String secondStr = secondVal.getText().toString();
                        first = Double.parseDouble(firstStr);
                        second = Double.parseDouble(secondStr);
                        output = first * second;
                        outputVal.setText("Multiplication is: " + output + " ");
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstVal.getText()!=null || secondVal.getText()!=null) {
                    try {
                double first, second, output;
                String firstStr = firstVal.getText().toString();
                String secondStr = secondVal.getText().toString();
                if(firstStr==null || secondStr==null){
                    Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                }
                first = Double.parseDouble(firstStr);
                second = Double.parseDouble(secondStr);
                output = first / second;
                outputVal.setText("Division is: "+output+" ");
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Enter a Digit First..", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondVal.setText("");
                firstVal.setText("");
                outputVal.setText("Output");
            }
        });
    }
}