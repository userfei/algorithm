package chapter1_3;

import java.util.Stack;

public class Calculator {

    public static void main(String[] args){
        String expression = "((10 + (2 + 3) * (4 * 5)))";
        Stack<String> operators = new Stack<>();
        Stack<Double> vals = new Stack<>();
        expression = expression.trim();
        Double d = 0.0;
        boolean flag = false; // 当前字符是否不是数字
        for(int i = 0; i< expression.length(); i++){
            char ch = expression.charAt(i);
            switch (ch){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    d = d * 10 + Double.parseDouble(ch + "");
                    flag = false;
                    break;
                case '(':
                    flag = false;
                    break;
                case ')':
                case '=':
                    if(!flag){
                        vals.push(d);
                        d = 0.0;
                    }
                    flag = true;
                    Double secondVal = vals.pop();
                    String op = operators.pop();
                    if(op.equals("+")){
                        vals.push(vals.pop() + secondVal);
                    }else if(op.equals("-")){
                        vals.push(vals.pop() -  secondVal);
                    }else if(op.equals("*")){
                        vals.push(vals.pop() * secondVal);
                    }else{
                        vals.push(vals.pop() / secondVal);
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    if(!flag){
                        vals.push(d);
                        d = 0.0;
                    }
                    flag = true;
                    operators.push(ch + "");
            }
        }
        System.out.println(vals.pop());
    }
}
