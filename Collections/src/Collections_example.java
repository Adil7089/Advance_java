//Integer ke liye
import java.util.ArrayList;
import java.util.Collections;

public class Collections_example {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
         al.add(10);
          al.add(52);
           al.add(42);
            al.add(23);
            System.err.println(al);
            Collections.sort(al);//yah value ko sorting me arrenge karta h
            System.err.println(al);
    }
}
