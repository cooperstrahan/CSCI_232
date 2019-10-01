/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

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
        Integer[] a = new Integer[100000];
        Integer[] b = new Integer[100000];
        Integer[] c = new Integer[100000];
        
        for(int i = 0; i < a.length; i++){
            int rand = r.nextInt(500000) + 1;
            a[i] = rand;
            b[i] = rand;
            c[i] = rand;
        }
        
        StopWatch bsort = new StopWatch();
        BubbleSort.sort(a);
        System.out.println("BubbleSort time: " + bsort.elapsedTime());
        
        StopWatch rsort = new StopWatch();
        RadixSort.sort(b);
        System.out.println("RadixSort time: " + rsort.elapsedTime());
        
        StopWatch csort = new StopWatch();
        CocktailSort.sort(c);
        System.out.println("CocktailSort time: " + csort.elapsedTime());
        
        

        System.out.println("Does a equal b? " + Arrays.equals(a, b));
        System.out.println("Does a equal c? " + Arrays.equals(a, c));
        System.out.println("Does b equal c? " + Arrays.equals(b, c));
        
    }
    
}
