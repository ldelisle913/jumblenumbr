package com.example.laurendelisle.jumblenumbr;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.laurendelisle.jumblenumbr.R.*;

public class MainActivity extends AppCompatActivity {

    //Add = 1. Subtract = 2, multiply = 3, divide = 4
    int operation = -1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //Find a refernce a add/subtract buttons from the XML view
        final View add = findViewById(id.plus);
        final View subtract = findViewById(id.minus);
        final View divide = findViewById(id.divide);
        final View multiply = findViewById(id.multiply);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 1) {
                    operation = -1;
                    add.setBackgroundColor(0);
                } else {
                    operation = 1;
                    add.setBackgroundColor(Color.YELLOW);
                    multiply.setBackgroundColor(0);
                    subtract.setBackgroundColor(0);
                    divide.setBackgroundColor(0);
                }


            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 1) {
                    operation = -1;
                    add.setBackgroundColor(0);
                } else {
                    operation = 1;
                    add.setBackgroundColor(0);
                    multiply.setBackgroundColor(0);
                    subtract.setBackgroundColor(Color.YELLOW);
                    divide.setBackgroundColor(0);
                }


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 1) {
                    operation = -1;
                    add.setBackgroundColor(0);
                } else {
                    operation = 1;
                    add.setBackgroundColor(0);
                    multiply.setBackgroundColor(Color.YELLOW);
                    subtract.setBackgroundColor(0);
                    divide.setBackgroundColor(0);
                }


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 1) {
                    operation = -1;
                    add.setBackgroundColor(0);
                } else {
                    operation = 1;
                    add.setBackgroundColor(0);
                    multiply.setBackgroundColor(0);
                    subtract.setBackgroundColor(0);
                    divide.setBackgroundColor(Color.YELLOW);
                }


            }
        });


        TextView value = (TextView) findViewById(id.value);


        final EditText left = (EditText) findViewById(id.left);
        final EditText right = (EditText) findViewById(id.right);

        View calculate = findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (left.getText().length() == 0) {
                    Toast.makeText(getBaseContext(), "Please Enter A Number On The Left", Toast.LENGTH_LONG);
                    return;
                }

                if (right.getText().length() == 0)
                {
                    Toast.makeText(getBaseContext(), "Please Enter A Number On The Right", Toast.LENGTH_LONG);
                    return;

                }
                if (operation == -1) {
                    Toast.makeText(getBaseContext(), "What Operation Would You Like To Perform", Toast.LENGTH_LONG);
                    return;
                }


                calculate();
            }
        });
    }

    public void calculate() {
        TextView result = (TextView) findViewById(id.value);
        final EditText left = (EditText) findViewById(id.left);
        final EditText right = (EditText) findViewById(id.right);
        float val = 0;
        int leftvalue = Integer.parseInt(left.getText().toString());
        int rightvalue = Integer.parseInt(right.getText().toString());

        if (operation == 1)

        {
            val = add(leftvalue, rightvalue);
        } else if (operation == 2) {
            val = subtract(leftvalue, rightvalue);
        } else if (operation == 3)

        {
            val = multiply(leftvalue, rightvalue);

        } else if (operation == 4)

        {
            val = divide(leftvalue, rightvalue);

        }

    }

    public int add(int a, int b) {
        return a + b;
    }

    public float divide(int a, int b) {
        return a / b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public float multiply(int a, int b) {
        return a * b;
    }


}