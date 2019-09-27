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
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] arr1 = {5, 4, 3, 2, 1};
//        Integer[] arr2 = {5, 4, 3, 2, 1};
        
        BubbleSort.sort(arr);
        CocktailSort.sort(arr1);
        
        System.out.print(Arrays.toString(arr));
        
        
    }
    
}
