package com.labs.zemoso;

import java.util.Scanner;

public class Assign8 {

    public static void main(String args[])
    {
        try{
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            a = sc.nextInt();

            Demo obj = new Demo();
            obj.throwExceptions(a);

            a= 1/a;

        }catch (MyException1 | MyException2 | MyException3 excp){
            System.out.println("In catch clause: " + excp.getMessage());
        }finally{
            System.out.println("I am in finally!!");
        }

    }
}
