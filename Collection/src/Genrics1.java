//this is Example of Generics. it was achive type safty and avoid type casting problem in collection
//double can not convert to String in ArrayList
import java.util.ArrayList;
public class Genrics1 {
    public static void main(String arg[])
    {
        //ArrayList<String>al=new ArrayList<String>();
       ArrayList<String>al=new ArrayList<>();
        al.add("ali");
        al.add("raj");
        al.add("rohan");
      //al.add(24.4);
        System.out.println(al);
    }   
    
}
