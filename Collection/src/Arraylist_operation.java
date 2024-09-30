import java.util.ArrayList;
public class Arraylist_operation {
    public static void main(String arg[])
    {
        ArrayList<String> hs1=new ArrayList<>();
       hs1.add("Ramlal");
       hs1.add("Shamlal");
       hs1.add("babulal");
       hs1.add("shantilal");
       hs1.add("Ashantilal");
       
       System.out.println(hs1);
       
        ArrayList<String> hs2=new ArrayList<>();
       hs2.add("amit");
       hs2.add("Suresh");
       hs2.add("rahul");
       hs2.add("shantilal");
       hs2.add("Ashantilal");
       
       System.out.println(hs2);
       
       hs1.addAll(hs2); // yah hs2 ki sari value add karega hs1 me
       
       System.out.println(hs1);
       System.out.println(hs2);
        
    }
}
