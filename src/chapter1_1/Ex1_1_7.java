package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 计算平方根
 **/
public class Ex1_1_7 {
    public static void main(String[] args)
    {
        double result = sqrt(16);
        StdOut.printf("%.5f\n", result);
    }

    public static double sqrt(double t){
        double temp = t;
        while (Math.abs(t - temp/t) > .00001)
        {
            t = (temp/t + t) / 2.0;  // 不断让两个因子逼近相等
            StdOut.printf("%.5f\n", t);
        }
        return t;
    }
}
