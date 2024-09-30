//this is Example of Generics. it was achive type safty and avoid type casting problem in collection
//double can not convert to integer in ArrayList

import java.util.ArrayList;
public class Generics {
public static void main(String arg[])
{
    ArrayList<Integer>al=new ArrayList<Integer>();
    
    al.add(12);
    al.add(43);
    al.add(34);
 // al.add(23.4);
    System.out.println(al);
}
}
