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
    static void countSort(int arr[], int exp){
        int[] output = new int[arr.length];
        int[] count = new int[10];
        int[] aux = new int[arr.length];
        
        for(int i = 0; i < aux.length; i++){
            aux[i] = arr[i]%exp;
        }
        
        for(int i = 0; i < aux.length; i++){
            count[aux[i]]++;
        }
        
        for(int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i-1];
        }
        
        for(int i = 0; i < arr.length; i++){
            int toPut = aux[i];
            count[toPut]--;
            output[count[toPut]] = arr[i];
            
        }
        System.out.println(51%10);
        System.out.println(Arrays.toString(arr));
        System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(output));
    } 
    
    static int getMaxNum(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    static void sort(int arr[]){
        int m = getMaxNum(arr);
        
        for(int x = 1; m/x > 0; x*=10){
            countSort(arr, x);
        }
    }
}
