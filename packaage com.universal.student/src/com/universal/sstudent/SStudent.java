
package com.universal.sstudent;
import java.util.Scanner;
public class SStudent {
    private int roll;
    private String name;
    public Scanner sc=new Scanner(System.in);
    
    public void getStudent()
    {
        System.out.println("Enter roll no.=");
        roll=sc.nextInt();
        System.out.println("Enter name=");
        name=sc.next();
    }
    public void putStudent()
    {
        System.out.println(".............");
        System.out.println("roll number"+roll);
        System.out.println("name"+name);
        
    }
    
    
}   
  