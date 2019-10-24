/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cooperstrahan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BinarySearchTree<String, String> st = new BinarySearchTree<String, String>();

        File f = new File("/Users/cooperstrahan/NetBeansProjects/Program2/classes.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String input;
        String[] row;
        String[] top = null;
        String[] bottom = null;
        int totalSeats = 0;
        String k = "";
        String currentCourse = "";
//        boolean hasLecture = false;

        int i = 0;
        while ((input = br.readLine()) != null) {
            row = input.split(",");
            if(row.length == 10){
                top = row.clone();
            }
            else if(row.length == 9){
                bottom = row.clone();

            }
            if(top != null && bottom != null){
                k = bottom[2]+"-"+bottom[3].replaceAll("\\s","");
                if (!currentCourse.equalsIgnoreCase(k)){
                    totalSeats = 0;
                } 
                totalSeats += Integer.parseInt(top[4]);
                if(st.get(k) != null){
                    System.out.println(i + " " +totalSeats);
                } else if(st.get(k) == null){
                    currentCourse = k;
                }
 
                st.put(k, (top[1]+"-"+top[2]+"-"+totalSeats));              
                top = null;
                bottom = null;
            }

            ++i;
        }


        for (String s : st.levelOrder())
            System.out.println(s + " " + st.get(s));

        System.out.println();

        for (String s : st.keys())
            System.out.println(s + " " + st.get(s));

    }

}
