package com.example.calculator;

public class CalculatorModel {
    private int firstArg;
    private int secondArg;

    StringBuilder inputStr = new StringBuilder();

    private int actionSelected;

    private State state;

    private enum State{
        firstArgInput,
        secondArgInput,
        resultShow,
        operationSelected
    }

    public CalculatorModel(){
        state = State.firstArgInput;
    }

    public void onNumPressed(int buttonId){

        if (state == State.resultShow){
            state = State.firstArgInput;
            inputStr.setLength(0);
        }

        if (state == State.operationSelected){
            state = State.secondArgInput;
            inputStr.setLength(0);
        }

        if (inputStr.length() < 10){
            switch (buttonId){
                case R.id.zero:
                    if(inputStr.length() != 0){
                        inputStr.append("0");
                    }
                    break;
                case R.id.one:
                    inputStr.append("1");
                    break;
                case R.id.two:
                    inputStr.append("2");
                    break;
                case R.id.three:
                    inputStr.append("3");
                    break;
                case R.id.four:
                    inputStr.append("4");
                    break;
                case R.id.five:
                    inputStr.append("5");
                    break;
                case R.id.six:
                    inputStr.append("6");
                    break;
                case R.id.seven:
                    inputStr.append("7");
                    break;
                case R.id.eight:
                    inputStr.append("8");
                    break;
                case R.id.nine:
                    inputStr.append("9");
                    break;
                case R.id.dot:
                    inputStr.append(",");
                    break;
            }
        }
    }


    public void onActionPressed(int actionId){
        if (actionId == R.id.equal && state == State.secondArgInput && inputStr.length()>0){
            secondArg = Integer.parseInt(inputStr.toString());
            state = State.resultShow;
            inputStr.setLength(0);
            switch (actionSelected){
                case R.id.plus:
                    inputStr.append(firstArg + secondArg);
                    break;
                case R.id.minus:
                    inputStr.append(firstArg - secondArg);
                    break;
                case R.id.division:
                    inputStr.append(firstArg / secondArg);
                    break;
                case R.id.multiplication:
                    inputStr.append(firstArg * secondArg);
                    break;
                case R.id.percent:
                    break;
                case R.id.root:
                    inputStr.append(Math.sqrt(firstArg));
                    break;
                case R.id.exp:
                    inputStr.append(Math.pow(firstArg, secondArg));
                    break;
                case R.id.del:

                    break;
                case R.id.delAll:
                    break;
            }
        }
        else if (inputStr.length() > 0 && state == State.firstArgInput){
            firstArg = Integer.parseInt(inputStr.toString());
            state = State.operationSelected;
            actionSelected = actionId;
        }
    }

    public String getText(){
        StringBuilder str = new StringBuilder();
        switch (state) {
            default:
                return inputStr.toString();
            case operationSelected:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .toString();
            case secondArgInput:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(inputStr)
                        .toString();
            case resultShow:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(secondArg)
                        .append(" = ")
                        .append(inputStr.toString())
                        .toString();
        }
    }

    private char getOperationChar() {
        switch (actionSelected) {
            case R.id.plus:
                return '+';
            case R.id.minus:
                return '-';
            case R.id.multiply:
                return '*';
            case R.id.division:

                return '/';

        }
        return 0;
    }

    public void reset() {
        state = State.firstArgInput;
        inputStr.setLength(0);
    }
}