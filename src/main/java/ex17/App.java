/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex17;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double gender = 0;
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            gender = sc.nextDouble();
            if(gender>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }

        double ounces = 0;
        System.out.print("How many ounces of alcohol did you have? ");
        Scanner scc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            ounces = scc.nextDouble();
            if(ounces>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }

        double weight = 0;
        System.out.print("What is your weight, in pounds? ");
        Scanner sc3 = new Scanner(System.in);
        if(sc.hasNextInt()) {
            weight = sc3.nextDouble();
            if(weight>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }

        double hours = 0;
        System.out.print("How many hours has it been since your last drink? ");
        Scanner sc4 = new Scanner(System.in);
        if(sc.hasNextInt()) {
            hours = sc4.nextDouble();
            if(hours>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }

        float adr;

        if(gender == 1){
            adr = (float) 0.73;
        } else {
            adr = (float) 0.66;
        }

        double BAC1 = (ounces * 5.14 / weight * adr) - 0.015 * hours;

        System.out.format("Your BAC is %f\n", BAC1);

        if(BAC1 > 0.08){
            System.out.format("It is not legal for you to drive.\n");
        } else {
            System.out.format("It is legal for you to drive.");
        }


    }
}