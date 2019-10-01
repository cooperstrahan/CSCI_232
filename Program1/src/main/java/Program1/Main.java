/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.util.Arrays;

/**
 *
 * @author cooperstrahan
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String[] arr = {"A", "C", "D", "E", "G"};
//        Integer[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {51, 42, 37, 12, 18, 11, 94 ,15};
        
//        BubbleSort.sort(arr);
//        CocktailSort.sort(arr1);
        
        RadixSort.sort(arr2);
        
//        System.out.print(Arrays.toString(arr));
        
        
    }
    
}
