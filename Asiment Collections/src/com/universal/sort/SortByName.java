
package com.universal.sort;

import com.universal.student.Student;
import java.util.Comparator;

    public class SortByName implements Comparator<Student> 
    {
      @Override
      public int compare(Student s1,Student s2)
      {
         return s1.Name.compareTo(s2.Name);
      }
    }


