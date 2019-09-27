/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FibonacciCode;

/**
 *
 * @author cooperstrahan
 */
public class Fibonacci {
    int count = 0;
    public int Fib(int n){
        if(n==1){
            count += 2;
            return 1;
        } else if(n==2){
            count += 3;
            return 1;
        }
        count += 6;
        return Fib(n-1) + Fib(n-2);
    }
    
}
