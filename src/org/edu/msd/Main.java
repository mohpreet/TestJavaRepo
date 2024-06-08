
package org.edu.msd;

/**
 * Description:
 * Author: mohpreetsingh
 * Date: 08-06-2024 05:59 pm
 */
public class Main {

    public static void generateMessages(){
        System.out.printf("Hello and welcome!");

        for (int itr = 1; itr <= 110; itr++) {
            System.out.println("This is itr = " + itr);
        }
        System.out.println("This is done/...");
    }
    public static void main(String[] args) {
        generateMessages();
    }
}
