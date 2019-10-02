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
public class HeapSort {
    
    static void heapify(int[] a, int i, int n)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if(l < n && a[l] > a[largest])
        {
            largest = l;
        }
        if(r < n && a[r] > a[largest])
        {
            largest = r;
        }
        if(largest != i)
        {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            
//            System.out.println(Arrays.toString(a));
            heapify(a, largest, n);
        }
    }
    
    static void maxHeap(int[] a, int n)
    {
        int startIndex = (n / 2) - 1;
        
        for(int i = startIndex; i >=0; i--){
            heapify(a, i, n);
        }
    }
    
    static void heapSort(int[] a, int n)
    {
        while( n > 1){
            maxHeap(a, n);
            swap(a, 0, n-1);
            n--;
        }
    }
    
    static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
