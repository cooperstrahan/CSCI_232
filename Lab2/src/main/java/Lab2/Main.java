package Lab2;

import static Lab2.FourSum.count;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cooperstrahan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] randInts = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            Random rand = new Random();
            int randomInteger = rand.nextInt(8000);
            randInts[i] = randomInteger;
            
        }

        //StopWatch timer = new StopWatch();
        StopWatchCPU timerCPU = new StopWatchCPU();
        int count = count(randInts);
        //System.out.println("Elapsed time = " + timer.elapsedTime());
        System.out.println("Elapsed time = " + timerCPU.elapsedTime());
        System.out.println(count);
    }
    
}
