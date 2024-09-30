//Ex-of LinkedHashSet 
//yah multiple same value ko ayk hi baar print karta h
//or multiple null value ko bhi ayk baar.
import java.util.LinkedHashSet;
public class Linked_hashset {
    public static void main(String arg[])
    {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(11);
        hs.add(11);
        hs.add(14);
        hs.add(16);
        hs.add(23);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}
