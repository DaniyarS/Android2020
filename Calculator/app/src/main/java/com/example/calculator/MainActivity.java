package com.example.calculator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    protected void onSaveInstanceState(@NonNull final Bundle outState) {
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
    protected void onRestoreInstanceState(@NonNull final Bundle savedInstanceState) {
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
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "+";
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
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "%";
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
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "*";
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
                num1 = tv.getText().toString();
                tv.setText("");
                operation = "/";
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

    @SuppressLint("SetTextI18n")
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