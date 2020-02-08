package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /* private CalculatorModel calculator;

    TextView text;
    */

    String operation;
    String num1;
    String num2;
    String dot;
    double number1;
    double number2;
    double output;
    String out;
    CharSequence dooot;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation = "";
        num2 = "";
        dot = "";
        number1 = 0;
        number2 = 0;
        output = 0;
        out = "";
        dooot = ".";
    }

    public void pressEquals(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (operation.equals("/")) {
                tv.setTextColor(Color.rgb(255,255,255));
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                if (number2 == 0 || number1 == 0){
                    tv.setTextColor(Color.rgb(249, 174, 171));
                    tv.setText("На 0 делить нельзя");
                }
                else {
                    tv.setTextColor(Color.rgb(255,255,255));
                    output = number1 / number2;
                    out = String.valueOf(output);
                    tv.setText(out);
                    operation = "";
                }
            }

            if (operation.equals("+")) {
                if (tv.equals("На 0 делить нельзя")) {
                    tv.setText("");
                } else {
                    tv.setTextColor(Color.rgb(255, 255, 255));
                    num2 = tv.getText().toString();
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    output = number1 + number2;
                    out = String.valueOf(output);
                    tv.setText(out);
                    operation = "";
                }
            }
            if (operation.equals("-")) {
                if (tv.equals("На 0 делить нельзя")) {
                    tv.setText("");
                } else {
                    tv.setTextColor(Color.rgb(255, 255, 255));
                    num2 = tv.getText().toString();
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    output = number1 - number2;
                    out = String.valueOf(output);
                    tv.setText(out);
                    operation = "";
                }
            }
            if (operation.equals("*")) {
                if (tv.equals("На 0 делить нельзя")) {
                    tv.setText("");
                } else {
                    tv.setTextColor(Color.rgb(255, 255, 255));
                    num2 = tv.getText().toString();
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    output = number1 * number2;
                    out = String.valueOf(output);
                    tv.setText(out);
                    operation = "";
                }
            }
        }
    }

    public void pressDiv(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "/";
            }
        }
    }

    public void pressSqrt(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.sqrt(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }

    public void pressDouble(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = number1 * number1;
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }

    public void onClick(View view) {
        TextView tv = (TextView) view;
        TextView infoTextView = findViewById(R.id.text);
        if (tv.equals("На 0 делить нельзя")){
            tv.setText("");
            infoTextView.setText("");
        }
        else{
            String text = infoTextView.getText().toString();
            String s = tv.getText().toString();
            tv.setTextColor(Color.rgb(255,255,255));
            if (text.equals("0")) infoTextView.setText(s);
            else infoTextView.append(s);
        }
    }




















    public void pressDot (View view){
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();

            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else if
            (!s.contains(dooot))
            tv.append(".");
        }





















    public void pressZero(View view) {
        TextView infoTextView = findViewById(R.id.text);
        String text = infoTextView.getText().toString();
        if (!text.equals("0")) {
            if (infoTextView.equals("На 0 делить нельзя")) {
                infoTextView.setText("");
            } else {
                infoTextView.setTextColor(Color.rgb(255, 255, 255));
                infoTextView.append("0");
            }
        }
    }

    public void clearAll(View view) {
        TextView tv = findViewById(R.id.text);
        tv.setTextColor(Color.rgb(255,255,255));
        tv.setText("");
    }

    public void delete(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                s = s.substring(0, s.length() - 1);
                tv.setText(s);
            }
        }
    }

    public void pressPlus(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            }
            else
            {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "+";
            }
        }
    }

    public void pressMinus(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "-";
            }
        }
    }

    public void pressMulti(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.equals("На 0 делить нельзя")) {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "*";
            }
        }
    }
}
/*
    private boolean isOpPressed = false;

    private double firstNumber;
    private double secondNumber;

    private int secondNumberIndex;

    private char currentOp;
    private boolean opState;
    private boolean buttonState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        */

        /*

        final TextView calculatorScreen = findViewById(R.id.text);
        final Button zero = findViewById(R.id.zero);
        final Button one = findViewById(R.id.one);
        final Button two = findViewById(R.id.two);
        final Button three = findViewById(R.id.three);
        final Button four = findViewById(R.id.four);
        final Button five = findViewById(R.id.five);
        final Button six = findViewById(R.id.six);
        final Button seven = findViewById(R.id.seven);
        final Button eight = findViewById(R.id.eight);
        final Button nine = findViewById(R.id.nine);
        final Button dot = findViewById(R.id.dot);
        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button division = findViewById(R.id.division);
        final Button equal = findViewById(R.id.equal);
        final Button root = findViewById(R.id.root);
        final Button percent = findViewById(R.id.percent);
        final Button exp = findViewById(R.id.exp);
        final Button del = findViewById(R.id.del);
        final Button delAll = findViewById(R.id.delAll);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id= v.getId();
                switch (id){
                    case R.id.zero:
                        calculatorScreen.append("0");
                        break;
                    case R.id.one:
                        calculatorScreen.append("1");
                        break;
                    case R.id.two:
                        calculatorScreen.append("2");
                        break;
                    case R.id.three:
                        calculatorScreen.append("3");
                        break;
                    case R.id.four:
                        calculatorScreen.append("4");
                        break;
                    case R.id.five:
                        calculatorScreen.append("5");
                        break;
                    case R.id.six:
                        calculatorScreen.append("6");
                        break;
                    case R.id.seven:
                        calculatorScreen.append("7");
                        break;
                    case R.id.eight:
                        calculatorScreen.append("8");
                        break;
                    case R.id.nine:
                        calculatorScreen.append("9");
                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");



                        break;
                    case R.id.plus:
                        String screenContent0 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent0.length()+1;
                        firstNumber = Double.parseDouble(screenContent0);
                        calculatorScreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;
                    case R.id.minus:
                        String screenContent1 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent1.length()+1;
                        firstNumber = Double.parseDouble(screenContent1);
                        if (!calculatorScreen.toString().contains("-")){
                            calculatorScreen.append("");
                        }
                        else
                            calculatorScreen.append("-");
                        isOpPressed = true;
                        currentOp = '-';
                        break;
                    case R.id.multiplication:
                        String screenContent2 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent2.length()+1;
                        firstNumber = Double.parseDouble(screenContent2);
                        if (!calculatorScreen.toString().contains("×")){
                            calculatorScreen.append("");
                        }
                        else
                            calculatorScreen.append("×");
                        isOpPressed = true;
                        currentOp = '×';
                        break;
                    case R.id.division:
                        String screenContent3 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent3.length()+1;
                        firstNumber = Double.parseDouble(screenContent3);
                        if (!calculatorScreen.toString().contains("÷")){
                            calculatorScreen.append("");
                        }
                        else
                        calculatorScreen.append("÷");
                        isOpPressed = true;
                        currentOp = '÷';
                        break;

                    case R.id.root:
                        String screenContent4 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent4.length()+1;
                        firstNumber = Double.parseDouble(screenContent4);
                        if (!calculatorScreen.toString().contains("√")){
                            calculatorScreen.append("√");
                            isOpPressed = true;
                            currentOp = '√';
                            break;
                        }
                        else
                        calculatorScreen.append("");
                        break;
                    case R.id.percent:
                        String screenContent5 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent5.length()+1;
                        firstNumber = Double.parseDouble(screenContent5);
                        calculatorScreen.append("%");
                        isOpPressed = true;
                        currentOp = '%';
                        break;
                    case R.id.exp:
                        String screenContent6 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent6.length()+1;
                        firstNumber = Double.parseDouble(screenContent6);
                        if (!calculatorScreen.toString().contains("^")){
                            calculatorScreen.append("");
                        }
                        else
                        calculatorScreen.append("^");
                        isOpPressed = true;
                        currentOp = '^';
                        break;

                    case R.id.equal:
                        if (isOpPressed){
                            if (currentOp == '+'){
                                String screenNextContent = calculatorScreen.getText().toString();
                                secondNumber = Double.parseDouble(screenNextContent.substring(secondNumberIndex, screenNextContent.length()));
                                secondNumber += firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }

                        }
                        if (isOpPressed){
                            if (currentOp == '-'){
                                String screenNextContent = calculatorScreen.getText().toString();
                                secondNumber = Double.parseDouble(screenNextContent.substring(secondNumberIndex, screenNextContent.length()));
                                double result = firstNumber - secondNumber;
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }
                        if (isOpPressed){
                            if (currentOp == '×'){
                                String screenNextContent = calculatorScreen.getText().toString();
                                secondNumber = Double.parseDouble(screenNextContent.substring(secondNumberIndex, screenNextContent.length()));
                                double result = firstNumber * secondNumber;
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }
                        if (isOpPressed){
                            if (currentOp == '÷'){
                                String screenNextContent = calculatorScreen.getText().toString();
                                secondNumber = Double.parseDouble(screenNextContent.substring(secondNumberIndex, screenNextContent.length()));
                                double result = firstNumber / secondNumber;
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }

                        if (isOpPressed){
                            if (currentOp == '√'){
                                double result = Math.sqrt(firstNumber);
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }

                        if (isOpPressed){
                            if (currentOp == '%'){
                                double result = Math.sqrt(firstNumber);
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }

                        if (isOpPressed){
                            if (currentOp == '^'){
                                String screenNextContent = calculatorScreen.getText().toString();
                                secondNumber = Double.parseDouble(screenNextContent.substring(secondNumberIndex, screenNextContent.length()));
                                double result = 1;
                                for (int i = 0; i < secondNumber; i++) {
                                    result *= firstNumber;
                                }
                                calculatorScreen.setText(String.valueOf(result));
                            }
                        }

                        break;
                }
            }
        };

        zero.setOnClickListener(calculatorListener);
        one.setOnClickListener(calculatorListener);
        two.setOnClickListener(calculatorListener);
        three.setOnClickListener(calculatorListener);
        four.setOnClickListener(calculatorListener);
        five.setOnClickListener(calculatorListener);
        six.setOnClickListener(calculatorListener);
        seven.setOnClickListener(calculatorListener);
        eight.setOnClickListener(calculatorListener);
        nine.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        equal.setOnClickListener(calculatorListener);
        root.setOnClickListener(calculatorListener);
        percent.setOnClickListener(calculatorListener);
        exp.setOnClickListener(calculatorListener);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = calculatorScreen.getText().toString();
                int length = displayedElements.length();
                if(length>0){
                    displayedElements = displayedElements.substring(0, length-1);
                    calculatorScreen.setText(displayedElements);
                }
            }
        });

        delAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
            }
        });
        */


        /*int[] numbers = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine,
                R.id.dot
        };

        int[] operationButs = new int[]{
                R.id.plus,
                R.id.minus,
                R.id.division,
                R.id.multiplication,
                R.id.percent,
                R.id.root,
                R.id.exp,
                R.id.del,
                R.id.delAll,
                R.id.equal
        };

        text = findViewById(R.id.text);

        calculator = new CalculatorModel();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.onNumPressed(v.getId());
                text.setText(calculator.getText());
            }
        };

        View.OnClickListener actionButtonClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calculator.onActionPressed(v.getId());
            }
        };

        for (int i=0; i < numbers.length; i++){
            findViewById(numbers[i]).setOnClickListener(numberButtonClickListener);
        }

        for (int i = 0; i < operationButs.length; i++) {
            findViewById(operationButs[i]).setOnClickListener((actionButtonClickListener));
        }*/
