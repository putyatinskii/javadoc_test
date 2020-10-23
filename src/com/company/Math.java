package com.company;

/**
 * Class with mathematical operations <b>factorial</b>, <b>module</b> and <b>pow</b>.
 * @author Putyatinskiy Dmitry
 * @version 1.0
 */

public class Math {

    /**
     * my_fact - calculates the factorial of a given number
     * @param n - int
     * @return int
     * */
    public static int my_fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else return n * my_fact(n-1);
    }

    /**
     * my_abs - calculates the modulus of a given number
     * @param n - double
     * @return double
     * */
    public static double my_abs(double n) {
        if(n >= 0) return n;
        else return -n;
    }

    /**
     * my_pow - raises a given number to a power
     * @param n - double
     * @param d - int
     * @return double
     * */
    public static double my_pow(double n, int d) {
        double n0=n;
        for(int i = 1; i <= d; i++) {
            n *= n0;
        }
        return n;
    }

}