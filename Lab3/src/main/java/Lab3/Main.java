/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

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
        Random r = new Random();
        Integer[] a = new Integer[5000];
        Integer[] b = new Integer[5000];
        Integer[] c = new Integer[5000];
        
        for(int i = 0; i < a.length; i++)
        {
            int random = r.nextInt(1000);
            a[i] = random;
            b[i] = random;
            c[i] = random;
        }
        
//        System.out.println(Arrays.toString(a));
        
        StopWatch insertionTimer = new StopWatch();
        InsertionSort.sort(a);
        System.out.println("Elapsed time for Insertion Sort: " + insertionTimer.elapsedTime());
        
        StopWatch selectionTimer = new StopWatch();
        SelectionSort.sort(b);
        System.out.println("Elapsed time for Selection Sort: " + selectionTimer.elapsedTime());
        
        StopWatch shellTimer = new StopWatch();
        ShellSort.sort(c);
        System.out.println("Elapsed time for Shell Sort: " + shellTimer.elapsedTime());
               
        System.out.println("Does a equal b? " + Arrays.equals(a, b));
        System.out.println("Does b equal c? " + Arrays.equals(b, c));
        System.out.println("Does a equal c? " + Arrays.equals(a, c));

    }
    
}
