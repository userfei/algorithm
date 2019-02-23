package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 **/
public class Ex1_1_9 {

    public static void main(String[] args){
        StdOut.println(Integer.toBinaryString(10));
        StdOut.println(toBinaryString(10));
    }

    public static String toBinaryString(int num){
        StringBuilder result = new StringBuilder("");
        while(num >= 1){
            result.insert(0, num % 2);
            num = num >>> 1;
        }
        return result.toString();
    }
}
