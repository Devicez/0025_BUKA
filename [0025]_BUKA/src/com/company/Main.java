package com.company;

import java.math.BigInteger;
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        String op = input.next();
        BigInteger b = input.nextBigInteger();

        switch (op)
        {
            case "+" :
                System.out.println(a.add(b));
                break;
            case "*" :
                System.out.println(a.multiply(b));
                break;
            default:
                System.out.println("No Operator");
                break;
        }
    }
}
