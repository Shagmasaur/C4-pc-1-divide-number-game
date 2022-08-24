package com.jap;


import java.util.Scanner;

public class GameDemo
{

    public String divideByNumber(int firstNumber, int secondNumber)
    {
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
                 finalNumber = firstNumber / secondNumber;
            //Handle specific exception
        }
        catch (ArithmeticException exception)
        {

          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

    public static void main(String[] args) {
        GameDemo gameDemo = new GameDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers :");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(gameDemo.divideByNumber(firstNumber, secondNumber));
    }


}
