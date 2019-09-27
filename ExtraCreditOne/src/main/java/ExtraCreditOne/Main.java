package ExtraCreditOne;

import java.util.Stack;
import java.util.Random;

/**
 *
 * @author cooperstrahan
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Using the stack class from Java write a program that will push 20 
         random integers (between 1 and 100) onto the stack */
//        Stack<Integer> rStack = new Stack();
//        Random random = new Random();
//        
//        for(int i = 0; i < 20; i++){
//            rStack.push(random.nextInt(100) + 1);
//        }
//        
//        // Print the stack
//        System.out.println("The Stack at this instance in time: " + rStack);
//        System.out.println();
//        
//        //Pop the top integer and print that integer
//        System.out.println("The top element of the Stack at this "
//                + "instance in time: " + rStack.pop());
//        System.out.println();
//        
//        //Print the stack again
//        System.out.println("The Stack at this instance in time: " + rStack);
//        System.out.println();
//        
//        //Print the result of checking if 50 is in the stack
//        System.out.println("Is 50 in the stack? " + rStack.search(50));
//        System.out.println();
//        
//        //Print the result of checking if the stack is empty
//        System.out.println("Is the Stack Empty? " + rStack.isEmpty());
//        System.out.println();
//        
//        
//        //After popping all the numbers off of the stack print the average
//        //of the numbers
//        int sum = 0;
//        int count = 0;
//        while(!rStack.isEmpty()){
//            sum += rStack.pop();
//            count++;
//        }
//        
//        System.out.println("The average of all the elements in the stack"
//                + " is " + sum/count);
        String[] a = {"to", "be", "or", "not", "to", "be", "that", "-", "is",
            "-", "-", "the", "question", "-", "whether", "tis", 
            "nobler", "-", "-", "-"};
        
        StackOfStrings stack = new StackOfStrings(20);
        
        String item;
        for(int i = 0; i < a.length; i++){
           item = a[i];
        
            if (!item.equals("-")) stack.push(item); 
            else if (stack.isEmpty())  System.out.println("BAD INPUT"); 
            else                       System.out.print(stack.pop() + " ");
        }

        // print what's left on the stack
        System.out.print("\nLeft on stack: ");
        for (String s : stack) {
        // for (Object s : stack) {
            System.out.print(s + " ");
        }
        System.out.println();
        
    }
    
}
