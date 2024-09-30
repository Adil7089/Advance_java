import java.util.ArrayList;
public class Arraylist_example {
    public static void main(String arg[])
    {
        ArrayList<String> hs=new ArrayList<>();
        hs.add("Ramlal");
        hs.add("Shamlal");
        hs.add("Babulal");
        hs.add("Shantilal");
        hs.add("Ashantilal");
        
        System.out.println(hs);
        boolean b=hs.isEmpty();
        System.out.println(b);
        hs.clear();
        b=hs.isEmpty();
        System.out.println(b);
        System.out.println(hs);                                                                                                                                                                                                        
    }
}
