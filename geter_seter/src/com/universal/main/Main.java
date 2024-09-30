
package com.universal.main;

import com.universal.sort.SortByPercentage;
import com.universal.sort.SortByRollNumber;
import com.universal.student.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.setRoll(102);
        s1.setName("Amil");
        s1.setPercentage(23.45);
        
        Student s2=new Student();
        s2.setRoll(101);
        s2.setName("Ubaid");
        s2.setPercentage(12.3);
        
        Student s3=new Student();
        s3.setRoll(103);
        s3.setName("Sameer");
        s3.setPercentage(15.6);
        
    ArrayList<Student> al=new ArrayList<>();
    al.add(s1);
    al.add(s2);
    al.add(s3);
    
    Iterator<Student> itr=al.iterator();
    while(itr.hasNext())
    {
        Student s=itr.next();
        System.out.println(s.getRoll()+":"+s.getName()+":"+s.getPercentage());
    }
    
     
    Collections.sort(al, new SortByRollNumber());
    
    System.out.println("After sorting Rollno=");
    Iterator<Student> itr2=al.iterator();
    while(itr2.hasNext())
    {
        Student s=itr2.next();
        System.out.println(s.getRoll()+":"+s.getName()+":"+s.getPercentage());
    }
    
    Collections.sort(al, new SortByPercentage());
    
    
     System.out.println("After sorting Percentage=");
    Iterator<Student> itr3=al.iterator();
    while(itr3.hasNext())
    {
        Student s=itr3.next();
        System.out.println(s.getRoll()+":"+s.getName()+":"+s.getPercentage());
    }
    
    
    }
  
}
