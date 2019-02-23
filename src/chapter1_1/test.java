package chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 **/
public class test {

    public static void main(String[] args){

        // 负数取余
        StdOut.println("取余运算: " + (-5%3));

        // 四舍五入
        StdOut.println("四舍五入: " + BigDecimal.valueOf(-1.2).setScale(0, RoundingMode.HALF_UP));

        // 字符串格式化输出
        String result = String.format("%14.5s", "hello, world");
        StdOut.println("字符串格式输出: " + result);

        // 整数溢出
        StdOut.println("整数溢出: " + Math.abs(-2147483648));
    }
}
