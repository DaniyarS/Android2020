/*package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /* private CalculatorModel calculator;

    TextView text;
    */
/*
    String operation;
    String num1;
    String num2;
    String dot;
    double number1;
    double number2;
    double output;
    String out;
    CharSequence dooot;
    String state;
    private int mCount;

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


        TextView tv = findViewById(R.id.text);

        if (savedInstanceState!=null){
            mCount = savedInstanceState.getInt("count");
            tv.setText(String.valueOf(mCount));
        }
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
                if (tv.getText() == "На 0 делить нельзя") {
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
                if (tv.getText() == "На 0 делить нельзя") {
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
                if (tv.getText() == "На 0 делить нельзя") {
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

            if (operation.equals("%")) {
                if (tv.getText() == "На 0 делить нельзя") {
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

            if (operation.equals("^")) {
                if (tv.getText() == "На 0 делить нельзя") {
                    tv.setText("");
                } else {
                    tv.setTextColor(Color.rgb(255, 255, 255));
                    num2 = tv.getText().toString();
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    output = Math.pow(number1, number2);
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
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "/";
            }
        }
    }

    public void pressExp(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "^";
            }
        }
    }

    public void pressSqrt(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
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
            if (tv.getText() == "На 0 делить нельзя") {
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
        if (infoTextView.getText() == "На 0 делить нельзя"){
            infoTextView.setText("");
            ((TextView) view).setText("");
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

            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else if
            (!s.contains(dooot))
            tv.append(".");
        }

    public void pressZero(View view) {
        TextView infoTextView = findViewById(R.id.text);
        String text = infoTextView.getText().toString();
        if (!text.equals("0")) {
            if (infoTextView.getText() == "На 0 делить нельзя") {
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
            if (tv.getText() == "На 0 делить нельзя") {
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
            if (tv.getText() == "На 0 делить нельзя") {
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
            if (tv.getText() == "На 0 делить нельзя") {
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
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "*";
            }
        }
    }

    public void pressPercent(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else{
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = number1 / 100;
                tv.setText("");
                out = String.valueOf(output);
                operation = "%";
                tv.append(out);
            }

        }
    }



    public void pressSin(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.sin(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }
    public void pressCos(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.cos(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }
    public void pressTan(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.tan(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }
    public void pressLn(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.log(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }
    public void pressLog(View view) {
        TextView tv = findViewById(R.id.text);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                num1 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                output = Math.log(number1);
                tv.setText("");
                out = String.valueOf(output);
                tv.append(out);
            }
        }
    }

    public void pressPi(View view) {
        TextView tv = findViewById(R.id.text);

            if (tv.getText() == "На 0 делить нельзя") {
                tv.setText("");
            } else {
                tv.setTextColor(Color.rgb(255, 255, 255));
                tv.setText(String.valueOf(Math.PI));
            }
    }

    public void pressE(View view) {
        TextView tv = findViewById(R.id.text);

        if (tv.getText() == "На 0 делить нельзя") {
            tv.setText("");
        } else {
            tv.setTextColor(Color.rgb(255, 255, 255));
            tv.setText(String.valueOf(Math.E));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", mCount);
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
 /*       */
//}



package com.example.calculator;

        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    String operation;
    String num1;
    String num2;
    String dot;
    double number1;
    double number2;
    double output;
    String out;
    CharSequence dooot;
    boolean sign;
    boolean rad;

    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        String o = tvO.getText().toString();

        delete(tv);

        outState.putString("operation", operation);
        outState.putString("number1", num1);
        outState.putString("text", s);
        outState.putString("out", o);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView infoTextView = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        infoTextView.append(savedInstanceState.getString("text"));
        tvO.append(savedInstanceState.getString("out"));
        operation = savedInstanceState.getString("operation");
        num1 = savedInstanceState.getString("number1");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign = false;
        operation = "";
        num2 = "";
        dot = "";
        number1 = 0;
        number2 = 0;
        output = 0;
        out = "";
        dooot = ".";
        rad = false;
    }

    public void onClick(View view) {
        TextView tv = (TextView) view;
        String s = tv.getText().toString();
        TextView infoTextView = findViewById(R.id.text);
        String text = infoTextView.getText().toString();
        if (text.equals("0")) infoTextView.setText(s);
        else infoTextView.append(s);

        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
    }

    public void pressDot(View view) {
        TextView infoTextView = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String text = infoTextView.getText().toString();

        if (!text.contains(dooot)) {
            infoTextView.append(".");
        }
    }

    public void pressZero(View view) {
        TextView infoTextView = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String text = infoTextView.getText().toString();
        if (!text.equals("0")) {
            infoTextView.append("0");
        }
    }

    public void clearAll(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        tv.setText("");
        rad = false;
    }


    public void delete(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();

        if (!s.equals("") ) {
            s = s.substring(0, s.length() - 1);
            tv.setText(s);
        }
    }


    public void pressPlus(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (!sign) {
                tvO.setText("");
                sign = true;
                if (!s.equals("")) {
                    num1 = tv.getText().toString();
                    tv.setText("");
                    operation = "+";
                }
            } else {
                operation = "+";
            }
        }
    }

    public void pressMinus(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (!sign) {
                tvO.setText("");
                sign = true;
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "-";
            }
            else {
                operation = "-";
            }
        }
    }

    public void pressPercent(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (!sign) {
                tvO.setText("");
                sign = true;
                if (!s.equals("")) {
                    num1 = tv.getText().toString();
                    tv.setText("");
                    operation = "%";
                }
            } else {
                operation = "%";
            }
        }
    }

    public void pressMulti(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (!sign) {
                tvO.setText("");
                sign = true;
                if (!s.equals("")) {
                    num1 = tv.getText().toString();
                    tv.setText("");
                    operation = "*";
                }
            } else {
                operation = "*";
            }
        }
    }

    public void pressDiv(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        if (!s.equals("")) {
            if (!sign) {
                tvO.setText("");
                sign = true;
                if (!s.equals("")) {
                    num1 = tv.getText().toString();
                    tv.setText("");
                    operation = "/";
                }
            } else {
                operation = "/";
            }
        }
    }


    public void pressSqrt(View view) {
        TextView tv = findViewById(R.id.text);
        String text = tv.getText().toString();
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        if (!text.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            output = Math.sqrt(number1);
            tv.setText("");
            out = String.valueOf(output);
            tvO.append(out);
        }

    }

    public void pressPi(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        double pi = Math.PI;
        tv.setText(Double.toString(pi));
    }


    public void pressLog(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            output = Math.log10(number1);
            tv.setText("");
            out = String.valueOf(output);
            tvO.append(out);
        }
    }

    public void pressLn(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            output = Math.log(number1);
            tv.setText("");
            out = String.valueOf(output);
            tvO.append(out);
        }
    }


    public void pressDouble(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            output = number1 * number1;
            tv.setText("");
            out = String.valueOf(output);
            tvO.append(out);
        }
    }

    public void pressExp(View view) {
        if (!sign) {
            TextView tv = findViewById(R.id.text);
            TextView tvO = findViewById(R.id.text1);
            tvO.setText("");
            String s = tv.getText().toString();
            sign = true;
            if (!s.equals("")) {
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "^";
            }
        } else {
            operation = "^";
        }
    }



    public void pressSin(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            if (!rad) {
                output = Math.sin(Math.toRadians(number1));
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            } else {
                output = Math.sin(number1);
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            }
        }
    }

    public void pressCos(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            if (!rad) {
                output = Math.cos(Math.toRadians(number1));
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            } else {
                output = Math.cos(number1);
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            }
        }
    }

    public void pressTan(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        tvO.setText("");
        String s = tv.getText().toString();
        if (!s.equals("")) {
            num1 = tv.getText().toString();
            number1 = Double.parseDouble(num1);
            if (!rad) {
                output = Math.tan(Math.toRadians(number1));
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            } else {
                output = Math.tan(number1);
                tv.setText("");
                out = String.valueOf(output);
                tvO.append(out);
            }
        }
    }


    public void pressEquals(View view) {
        TextView tv = findViewById(R.id.text);
        TextView tvO = findViewById(R.id.text1);
        String s = tv.getText().toString();
        tvO.setTextColor(Color.rgb(255, 255, 255));
        if (!s.equals("")) {

            if (operation.equals("+")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                output = number1 + number2;
                out = String.valueOf(output);
                tvO.setText(out);
                operation = "";
                sign = false;
            }
            if (operation.equals("-")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                output = number1 - number2;
                out = String.valueOf(output);
                tvO.setText(out);
                operation = "";
                sign = false;
            }
            if (operation.equals("*")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                output = number1 * number2;
                out = String.valueOf(output);
                tvO.setText(out);
                operation = "";
                sign = false;
            }
            if (operation.equals("/")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                if (number1 == 0 || number2 == 0) {
                    tvO.setTextColor(Color.rgb(249, 174, 171));
                    tvO.setText("На 0 делить нельзя");
                } else {
                    output = number1 / number2;
                    out = String.valueOf(output);
                    tvO.setText(out);
                    operation = "";
                }
                operation = "";
                sign = false;
            }
            if (operation.equals("%")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                double percent = number2 / 100;
                output = number1 * percent;
                out = String.valueOf(output);
                tvO.setText(out);
                operation = "";
                sign = false;
            }
            if (operation.equals("^")) {
                num2 = tv.getText().toString();
                number1 = Double.parseDouble(num1);
                number2 = Double.parseDouble(num2);
                output = Math.pow(number1, number2);
                out = String.valueOf(output);
                tvO.setText(out);
                operation = "";
                sign = false;
            }
        }
        tv.setText("");
        rad = false;
    }
}