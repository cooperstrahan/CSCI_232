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
public class RadixSort {
    static void countSort(Integer arr[], int exp){
        int[] output = new int[arr.length];
        int[] count = new int[10];
        int[] aux = new int[arr.length];
        
        for(int i = 0; i < aux.length; i++){
            aux[i] = (arr[i]/exp)%10;
        }
//        System.out.println("Original " + Arrays.toString(arr));
//        System.out.println("Aux " + Arrays.toString(aux));
        
        for(int i = 0; i < aux.length; i++){
            count[aux[i]]++;
        }
//        System.out.println("index [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
//        System.out.println("counts " + Arrays.toString(count));
        
        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i-1];
        }
//        System.out.println("summed " + Arrays.toString(count));
        
        for(int i = aux.length-1; i >= 0; i--){
            int toPut = aux[i];
            count[toPut]--;
            output[count[toPut]] = arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
//        System.out.println("output " + Arrays.toString(output));
           
//        System.out.println(Arrays.toString(arr));
    } 
    
    static int getMaxNum(Integer arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    static void sort(Integer arr[]){
        int m = getMaxNum(arr);
        
        for(int x = 1; m/x > 0; x*=10){
            countSort(arr, x);
        }
    }
}
