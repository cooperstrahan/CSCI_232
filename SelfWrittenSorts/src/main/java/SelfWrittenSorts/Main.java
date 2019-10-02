/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelfWrittenSorts;

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
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n = arr.length;
//        System.out.println(Arrays.toString(arr));
        HeapSort.maxHeap(arr, n);
        System.out.println(Arrays.toString(arr));
        
        int[] a = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};

        HeapSort.heapSort(a, n);
        
        System.out.println(Arrays.toString(a));
    }
    
}
