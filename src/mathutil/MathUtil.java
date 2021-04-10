package mathutil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class MathUtil {
    //ham tinh n! = 1,2,3...,n
    //0! = 1! = 1
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument this must be between 0..20");
        if(n == 0 || n == 1)
     return 1;
        return n *getFactorial(n = 1);
    }
}
