/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex17;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner gender = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String genderS = gender.nextLine();
        int genderI = Integer.parseInt(genderS);

        Scanner ounces = new Scanner(System.in);
        System.out.print("How many ounces of alcohol did you have? ");
        String ouncesS = gender.nextLine();
        int ouncesI = Integer.parseInt(ouncesS);

        Scanner weight = new Scanner(System.in);
        System.out.print("What is your weight, in pounds? ");
        String weightS = weight.nextLine();
        int weightI = Integer.parseInt(weightS);

        Scanner hours = new Scanner(System.in);
        System.out.print("How many hours has it been since your last drink? ");
        String hoursS = hours.nextLine();
        int hoursI = Integer.parseInt(hoursS);

        float adr;

        if(genderI == 1){
            adr = (float) 0.73;
        } else {
            adr = (float) 0.66;
        }

        double BAC1 = (ouncesI * 5.14 / weightI * adr) - 0.015 * hoursI;

        System.out.format("Your BAC is %f", BAC1);

        if(BAC1 > 0.08){
            System.out.format("It is not legal for you to drive.\n");
        } else {
            System.out.format("It is legal for you to drive.");
        }


    }
}