
package org.edu.msd;

/**
 * Description:
 * Author: mohpreetsingh
 * Date: 08-06-2024 05:59 pm
 */
public class Main {

    public static void generateMessages(){
        System.out.print("Hello and welcome!, Iterations Started");
        System.out.print("--------------------------------------");
        for (int itr = 1; itr <= 110; itr++) {
            System.out.println("This is itr = " + itr);
        }
        System.out.println("This is done, Iterations Ended");
        System.out.print("--------------------------------------");
    }
    public static void main(String[] args) {
        generateMessages();
    }
}
