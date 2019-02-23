package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 *  打印斐波那契数列
 **/
public class Ex1_1_6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;  // 将上一个f 和 g 相加然后给 f
            g = f - g;  // 将上一个f 给了 g
        }
    }
}
