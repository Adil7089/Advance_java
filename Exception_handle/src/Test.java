/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Test {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter 1st value=");
       int x=sc.nextInt();
       System.out.println("Enter 2nd value=");
       int y=sc.nextInt();
       try
       {
           System.out.println("try will execute until exception not come");
           int z=x/y;
           System.out.println("value="+z);
           
       }
       catch(RuntimeException e)
       {
           System.out.println("You have divided by zero");
       }
       System.out.println("Rest coe");
       
        }
    }
    

