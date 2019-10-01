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
public class BubbleSort { 
    
    private BubbleSort() { }
    
    /**
     *
     * @param a
     */
    public static void sort(Comparable[] a)
    {
        int k;
        boolean isSorted = false;
        
        while(!isSorted)
        {
            for(int j = 0; j < a.length - 1; j++)
            {
                k = j + 1;
                if(a[j].compareTo(a[k]) > 0)
                {
                    swap(a, j, k);
//                    System.out.println("Swapping " + a[j] + " and " + a[k]);
//                    System.out.println(Arrays.toString(a));
                }
            }
            isSorted = sorted(a);
        }
    }
    
    public static void swap(Object[] a, int x, int y)
    {
        Object temp = a[x];        
        a[x] = a[y];
        a[y] = temp;
    }
    
    public static boolean sorted(Comparable[] a)
    {
        for(int i = 0; i < a.length-1; i++)
        {
            if(a[i].compareTo(a[i+1]) > 0)
            {
                return false;
            } 
        }
        return true;
    }
}
