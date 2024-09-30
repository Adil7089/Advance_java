
package com.universal.academic;

import com.universal.sstudent.SStudent;

public class Academic extends SStudent {
    protected int p,c,m;
    public void getStudent()
    {
        System.out.println(".............");
        System.out.println("Enter physics marks=");
        p=sc.nextInt();
        System.out.println(" Enter Chemistri marks=");
        c=sc.nextInt();
        System.out.println("Enter math marks=");
        m=sc.nextInt();
       
    }
    public void putAcademics()
    {
        System.out.println(".............");
        System.out.println("physics marks"+p);
        System.out.println("chemistri marks"+c);
        System.out.println("math marks"+m);
        
    }
}
