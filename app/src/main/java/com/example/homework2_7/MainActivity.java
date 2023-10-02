package com.example.homework2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String operation;
    private TextView textView;
    private Integer first, second, sum, result, umResult, dResult;
    private boolean isOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.btn_text_View);
    }

    public void showResult(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", toString());
        startActivity(intent);
    }


    public void onNumberClick(View view) {
        if (view.getId() == R.id.AC) {
            textView.setText("0");
            first = 0;
            second = 0;
        } else {
            String textButton = ((Button) view).getText().toString();
            if (textView.getText().toString().equals("0") || isOperation) {
                textView.setText(textButton);
            } else {
                textView.append(textButton);
            }
        }
        isOperation = false;

    }

    public void onOperationClick(View view) {
        if (view.getId() == R.id.plus) {
            if (!textView.getText().toString().isEmpty() && !textView.getText().toString().equals("0")) {
                first = Integer.valueOf(textView.getText().toString());
                operation = "+";
            } else {
                first = 0;
            }
        }

            if (view.getId() == R.id.minus) {
                if (!textView.getText().toString().isEmpty() && !textView.getText().toString().equals("0")) {
                    first = Integer.valueOf(textView.getText().toString());
                    operation = "-";
                } else {
                    first = 0;
                }
            }
            if (view.getId() == R.id.multiply) {
                if (!textView.getText().toString().isEmpty() && !textView.getText().toString().equals("0")) {
                    first = Integer.valueOf(textView.getText().toString());
                    operation = "*";
                } else {
                    first = 0;
                }
            }
            if (view.getId() == R.id.divide) {
                if (!textView.getText().toString().isEmpty() && !textView.getText().toString().equals("0")) {
                    first = Integer.valueOf(textView.getText().toString());
                    operation = "/";
                } else {
                    first = 0;
                }
            }
            if (view.getId() == R.id.equals) {
                second = Integer.valueOf(textView.getText().toString());
                switch (operation) {
                    case "+":
                        sum = first + second;
                        textView.setText(sum.toString());
                        break;
                    case "-":
                        result = first - second;
                        textView.setText(result.toString());
                        break;
                    case "*":
                        umResult = first * second;
                        textView.setText(umResult.toString());
                        break;
                    case "/":
                        dResult = first / second;
                        textView.setText(dResult.toString());
                        break;
                }
            }

            isOperation = true;



    }
}
