/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cooperstrahan
 */
public class FourSum {
    
 
    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param  a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     *         such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for(int l = k+1; l < n; l++){
                        if (a[i] + a[j] + a[k] + a[l] == 0) {
                        count++;
                    }
                    
                    }
                }
            }
        }
        return count;
    } 

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  { 
        
        int[] randInts = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            Random rand = new Random();
            int randomInteger = rand.nextInt(8000);
            randInts[i] = randomInteger;
            
        }

        //StopWatch timer = new StopWatch();
        StopWatchCPU timerCPU = new StopWatchCPU();
        int count = count(randInts);
        //System.out.println("Elapsed time = " + timer.elapsedTime());
        System.out.println("Elapsed time = " + timerCPU.elapsedTime());
        System.out.println(count);
    }
    
}
