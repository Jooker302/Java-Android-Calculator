package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button CBtn;
    Button Btn0;
    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
    Button Btn5;
    Button Btn6;
    Button Btn7;
    Button Btn8;
    Button Btn9;
    Button AddBtn;
    Button XBtn;
    Button MinusButton;
    Button DivBtn;

    Button EqualBtn;

    Editable num1;
    Editable num2;

    String operator;

    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn0 = findViewById(R.id.Btn0);
        Btn1 = findViewById(R.id.Btn1);
        Btn2 = findViewById(R.id.Btn2);
        Btn3 = findViewById(R.id.Btn3);
        Btn4 = findViewById(R.id.Btn4);
        Btn5 = findViewById(R.id.Btn5);
        Btn6 = findViewById(R.id.Btn6);
        Btn7 = findViewById(R.id.Btn7);
        Btn8 = findViewById(R.id.Btn8);
        Btn9 = findViewById(R.id.Btn9);
        AddBtn = findViewById(R.id.AddBtn);
        EqualBtn = findViewById(R.id.EqualBtn);
        XBtn = findViewById(R.id.XBtn);
        MinusButton = findViewById(R.id.MinusBtn);
        DivBtn = findViewById(R.id.DivBtn);
        CBtn = findViewById(R.id.CBtn);



        result = findViewById(R.id.result);

        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });

        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = result.getText();
                operator = "+";
                result.setText("");

            }
        });

        EqualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = result.getText();
                float display = 0;
                switch (operator){
                    case "+":
                        display = Float.parseFloat(num1.toString()) + Float.parseFloat(num2.toString());
                        break;
                    case "/":
                        display = Float.parseFloat(num1.toString()) / Float.parseFloat(num2.toString());
                        break;
                    case "-":
                        display = Float.parseFloat(num1.toString()) - Float.parseFloat(num2.toString());
                        break;
                    case "*":
                        display = Float.parseFloat(num1.toString()) * Float.parseFloat(num2.toString());
                        break;
                }

                result.setText(String.valueOf(display));

            }
        });

        DivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "/";
                num1 = result.getText();
                result.setText("");
            }
        });

        XBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "*";
                num1 = result.getText();
                result.setText("");
            }
        });

        MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "-";
                num1 = result.getText();
                result.setText("");
            }
        });

        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = null;
                num2 = null;
                result.setText("");
            }
        });





    }


}