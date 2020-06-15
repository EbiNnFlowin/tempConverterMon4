package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        char = a single character surrounded by single quotes 'a'
        string = a bunch of characters surrounded by quotation mark "Hello World"
        int = a integer or whole number 5
        float = a floating point variable like decimal and accurate to 7 points 7.9999
        double = same as float but more accurate up to 15 points ex 8.9999999
        bool = boolean, true or false statement, only two options

        */
	// write your code here
        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Press 1 if you want to convert from Celsius to Fahrenheit ");
            System.out.println("Press 2 if you want to convert from Celsius to Kelvin");
            System.out.println("Press 3 if you want to convert from Fahrenheit to Celsius");
            System.out.println("Press 4 if you want to convert from Fahrenheit to Kelvin");
            System.out.println("Press 5 if you want to convert from Kelvin to Celsius");
            System.out.println("Press 6 if you want to convert from Kelvin to Fahrenheit");
            System.out.println("Press 0 to exit");
            choice = scan.nextInt();
            switch (choice){
                //sadasd
                case 1:
                    System.out.println("Please enter the degrees in celsius that you want to convert");
                    celsius = scan.nextDouble();
                    fahrenheit = ((celsius *(9.0/5.0))+32);
                    System.out.println(celsius + " degrees is equal to "+ fahrenheit+" degrees fahrenheit");
                    break;
                case 2:
                    System.out.println("Please enter the degrees in celsius that you want to convert");
                    celsius = scan.nextDouble();
                    kelvin = celsius + 273.15;
                    System.out.println(celsius + " degrees is equal to "+ kelvin+" degrees kelvin");
                    break;
                case 3:
                    System.out.println("Please enter the degrees in Fahrenheit");
                    fahrenheit = scan.nextDouble();
                    celsius = ((fahrenheit - 32) * (5.0/9.0));
                    System.out.println(fahrenheit+ " fahrenheit is "+ celsius + " degrees celsius");
                    break;
                case 4:
                    System.out.println("Please enter the degrees in Fahrenheit");
                    fahrenheit = scan.nextDouble();
                    kelvin = (((fahrenheit - 32) * (5.0/9.0))+273.15);
                    System.out.println(fahrenheit+ " fahrenheit is "+ kelvin + " degrees kelvin");
                    break;
                case 5:
                    System.out.println("Please enter the degrees in Kelvin");
                    kelvin = scan.nextDouble();
                    celsius = kelvin - 273.15;
                    System.out.println(kelvin+ " kelvin is "+ celsius + " degrees celsius");
                    break;
                case 6:
                    System.out.println("Please enter the degrees in Kelvin");
                    kelvin = scan.nextDouble();
                    fahrenheit = (((kelvin - 273.15)*(9.0/5))+32);
                    System.out.println(kelvin+ " kelvin is "+ fahrenheit + " degrees fahrenheit");
                    break;

                case 0:
                    System.out.println("Thank you, see you later");
                    break;
                default:
                    System.out.println("ERROR! INVALID INPUT");



            }

        }
        while (choice !=0);

    }
}
