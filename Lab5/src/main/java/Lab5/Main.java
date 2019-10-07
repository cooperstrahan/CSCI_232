/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cooperstrahan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File manifesto = new File("../../IdeaProjects/csci232/lab5/manifesto.txt");
        File reals = new File("../../IdeaProjects/csci232/lab5/reals.txt");
        int i = 0;

        Scanner mscan = new Scanner(manifesto);
        Scanner mscan2 = new Scanner(manifesto);
        Scanner rscan = new Scanner(reals);
        Scanner rscan2 = new Scanner(reals);

        int mcount = 0;

        while (mscan.hasNext()) {
            mcount++;
            mscan.next();
        }
        String[] manifestoArray = new String[mcount];

        while (mscan2.hasNext()) {
            manifestoArray[i] = mscan2.next();
            i++;
        }
        StopWatch manifestoSortTime = new StopWatch();
        CocktailSort.sort(manifestoArray);
        System.out.println(manifestoSortTime.elapsedTime() + " seconds to sort " 
                + manifestoArray.length + " String elements.");

        int rcount = 0;

        while (rscan.hasNext()) {
            rcount++;
            rscan.next();
        }

        Float[] realsArray = new Float[rcount];

        i = 0;

        DecimalFormat d = new DecimalFormat();

        while (rscan2.hasNext()) {
            float a = Float.parseFloat(rscan2.next());
            realsArray[i] = a;
            i++;
        }
        
        StopWatch realsSortTime = new StopWatch();
        CocktailSort.sort(realsArray);
        System.out.println(realsSortTime.elapsedTime() + " seconds to sort " 
                + realsArray.length + " Float elements.");

//        System.out.print(Arrays.toString(realsArray));
    }

}
