/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universal.academic;
import com.universal.student.Student;


public class Academic extends Student {
    protected int p,c,m;
    public void getAcademic()
    {
        System.out.println("..........");
        
        System.out.println("Enter physics marks=");
        p=sc.nextInt();
        System.out.println("Enter chemistri marks");
        c=sc.nextInt();
        System.out.println("Enter math marks");
        m=sc.nextInt();
   
    }
    
    public void putAcademic()
    {
        System.out.println(".........");
        System.out.println("physics marks="+p);
        System.out.println("chemistri marks"+c);
        System.out.println("math marks"+m);
   
    }
    
}
