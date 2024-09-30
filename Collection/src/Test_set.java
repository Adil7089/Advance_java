//Ex of TreeSet
//yah value ko sorting list me store karta h.
//yah null value ko bhi store nhi karta h.
import java.util.TreeSet;
public class Test_set {
    public static void main(String arg[])
    {
        TreeSet<Integer> hs=new TreeSet<>();
        hs.add(12);
        hs.add(14);
        hs.add(56);
        hs.add(23);
        hs.add(43);
      // hs.add(null);
        System.out.println(hs);
    }
}
