/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author cooperstrahan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] a = new Integer[100000];
        Integer[] b = new Integer[100000];        
        Random r = new Random();
        
        for(int i = 0; i < a.length; i++){
            int rand = r.nextInt(10000000);
            a[i] = rand;
            b[i] = rand;
        }
        
        StopWatch qswatch = new StopWatch();
        QuickSort.sort(a);
        System.out.println("QuickSort took " + qswatch.elapsedTime());
        
        StopWatch mswatch = new StopWatch();
        MergeSort.sort(b);
        System.out.println("MergeSort took " + mswatch.elapsedTime());
       
        System.out.println("Does a equal b? " + Arrays.equals(a, b));
    }
    
}
