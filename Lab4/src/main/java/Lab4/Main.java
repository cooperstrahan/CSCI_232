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
//        Integer[] a = new Integer[100000];
//        Integer[] b = new Integer[100000];        
//        Random r = new Random();
//        
//        for(int i = 0; i < a.length; i++){
//            int rand = r.nextInt(10000000);
//            a[i] = rand;
//            b[i] = rand;
//        }
//        
//        StopWatch qswatch = new StopWatch();
//        QuickSort.sort(a);
//        System.out.println("QuickSort took " + qswatch.elapsedTime());
//        
//        StopWatch mswatch = new StopWatch();
//        MergeSort.sort(b);
//        System.out.println("MergeSort took " + mswatch.elapsedTime());
//       
//        System.out.println("Does a equal b? " + Arrays.equals(a, b));

//        String[] qs = {"L" , "K", "C", "H", "B", "F", "A", "D", "G", "E"};
        String[] qs1 = {"D" , "W", "H", "E", "A", "C", "R", "Y", "S", "M"};
        QuickSort.sort(qs1);
        
//        System.out.println(Arrays.toString(qs));
        
    }
    
}
