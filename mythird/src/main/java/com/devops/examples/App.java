package com.devops.examples;
import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {1,2,3,4,5};
        for(int n : arr){
            System.out.print(n+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
    }
}
