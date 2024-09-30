
package com.universal.main;
import com.universal.sort.SortByName;
import com.universal.sort.SortByPercentage;
import com.universal.sort.SortByRollNumber;
import com.universal.student.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Test {
    public static void main(String[] args)
    {
     
    
    {
        Student s1=new Student(102,"raj",56.8);
        Student s2=new Student(101,"ram",45.0);
        Student s3=new Student(103,"syam",23.5);
        
        ArrayList<Student>al=new ArrayList<>();
        al.add(s1);
         al.add(s2);
          al.add(s3);
          
          Iterator itr=al.iterator();
          while(itr.hasNext())
          {
              System.out.println(itr.next());
          }
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter 1 for sorting name");
            
             System.out.println("Enter 2 for sorting Rollnumber");
              System.out.println("Enter 3 for sorting Percentage");
              int i=sc.nextInt();
        
          if(i==1)
                  {
          Collections.sort(al,new SortByName());
          System.out.println("After sortimg Name=");
          Iterator itr1=al.iterator();
          while(itr1.hasNext())
          {
              System.out.println(itr1.next());
          }
          }
          else if(i==2)
          {
          Collections.sort(al,new SortByRollNumber());
          System.out.println("After sortimg RollNo=");
          Iterator itr2=al.iterator();
          while(itr2.hasNext())
          {
              System.out.println(itr2.next());
          }
          }
          else if(1==3)
                  {
         Collections.sort(al,new SortByPercentage());
          System.out.println("After sortimg Percentage=");
          Iterator itr3=al.iterator();
          while(itr3.hasNext())
          {
              System.out.println(itr3.next());
          }
          }
          else{
              System.out.println("plese follow the instraction");
          }
          
          
    }
    }
}

