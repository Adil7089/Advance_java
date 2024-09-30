/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universal.student;
import java.util.Scanner;
public class Student {
    private int roll;
    private String name;
    public Scanner sc=new Scanner(System.in);
    
    public void getStudent()
    {
    System.out.print("Enter roll number=");
    roll=sc.nextInt();
    System.out.println("Enter name=");
    name=sc.next();
    }
    
    public void putStudent()
    {
        System.out.println(".............");
        System.out.println("Roll number="+roll);
        System.out.println("Enter name="+name);
    }
}
