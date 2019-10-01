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
public class CocktailSort {
    
    private CocktailSort() { }
    
    public static void sort(Comparable[] a)
    {
        int iterations = 0;
        boolean isSorted = false;
        
        while(!isSorted)
        { 
            for(int j = 0; j < a.length - 1; j++)
            {
                if(a[j].compareTo(a[j+1]) > 0)
                {
                    swap(a, j, j+1);
//                    System.out.println("Swapping " + a[j] + " and " + a[j+1]);
//                    System.out.println(Arrays.toString(a));
                }
            }
            iterations++;
            sorted(a);
            for(int k = a.length - iterations - 2; k > 0; k --)
            {
//                System.out.println("Comparing " + a[k] + " and " + a[k-1]);
                if(a[k].compareTo(a[k-1]) < 0)
                {
//                    System.out.println("Swapping " + a[k] + " and " + a[k-1]);
                    swap(a, k, k-1);
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
