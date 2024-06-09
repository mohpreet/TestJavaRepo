
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

    public static void createEmployee(){
        Employee employee = new Employee(1001,"MSD",1001,234567.0);
        employee.printDetails();
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        generateMessages();
        createEmployee();

        System.out.println("Main completed");
    }
}
