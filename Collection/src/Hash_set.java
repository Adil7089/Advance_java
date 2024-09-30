//Ex-of HashSet 
//yah multiple same value ko ayk hi baar print karta h
//or multiple null value ko bhi ayk baar.
import java.util.HashSet;
public class Hash_set {
    public static void main(String arg[])
    {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(null);
        hs.add(12);
        hs.add(15);
        hs.add(10);
        hs.add(16);
        hs.add(12);
        hs.add(null);
        System.out.println(hs);
    }
}
