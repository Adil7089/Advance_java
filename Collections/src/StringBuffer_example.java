// yah stringBuffer ka example isme hum only we can use object String type

import java.util.ArrayList;
import java.util.Collections;

public class StringBuffer_example {
    public static void main(String[] args) {
        ArrayList<StringBuffer> al=new ArrayList<>();
        al.add(new StringBuffer("sameer"));// object string type
        al.add(new StringBuffer("ravi"));// object string type
        al.add(new StringBuffer("yes"));// object string type
        al.add(new StringBuffer("adil"));// object string type
        al.add(new StringBuffer("teena"));// object string type
        
         
            System.err.println(al);
            Collections.sort(al);//yah value ko alfabatic sorting me arrenge karta h
            System.err.println(al);
    }
}
