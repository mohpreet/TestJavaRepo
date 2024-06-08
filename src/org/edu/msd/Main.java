//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package org.edu.msd;


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
