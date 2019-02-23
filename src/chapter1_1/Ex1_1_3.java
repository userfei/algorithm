package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 **/
public class Ex1_1_3 {
    public static void main(String[] args){
        if(args[0] == args[1] && args[1] == args[2]){
            StdOut.println("equals");
        }else {
            StdOut.println("not equals");
        }
    }
}
