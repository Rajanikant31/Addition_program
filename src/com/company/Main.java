package com.company;
import java .util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner add=new Scanner(System.in);
        System.out.println("Enter first number= ");
        float a= add.nextFloat();
        System.out.println("Enter second number= ");
        float b = add.nextFloat();
        float sum= a+b;
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
    }
}
