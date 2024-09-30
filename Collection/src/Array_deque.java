import java.util.ArrayDeque;
public class Array_deque {
    public static void main(String arg[])
    {
        ArrayDeque<String> hs=new ArrayDeque<>();
        hs.add("ramlal");
        hs.add("Shamlal");
        hs.add("Babulal");
        hs.add("Santilal");
        hs.add("Asantilal");
        hs.add("babulal");
        hs.add("Shantilal");
        hs.add("Shamlal");
        hs.add("Ramlal");
        hs.add("Ashantilal");
        hs.add("Ramlal");
        
        System.out.println(hs);
        System.out.println(hs.element());
        hs.remove();
        System.out.println(hs);
    }
}
