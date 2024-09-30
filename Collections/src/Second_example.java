// yah string ke liye

import java.util.ArrayList;
import java.util.Collections;

public class Second_example {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("sameer");
         al.add("ravi");
          al.add("teena");
           al.add("yes");
            al.add("adil");
            System.err.println(al);
            Collections.sort(al);//yah value ko alfabatic sorting me arrenge karta h
            System.err.println(al);
    }
}
