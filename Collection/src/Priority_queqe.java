//Ex-of PrioritQueue
//yah multiple same value store kar sakta h.
import java.util.PriorityQueue;
public class Priority_queqe {
    public static void main(String arg[])
    {
        PriorityQueue<Integer> hs=new PriorityQueue<>();
        
        hs.add(12);
        hs.add(11);
        hs.add(11);
        hs.add(17);
        hs.add(35);
        hs.add(56);
        hs.add(23); 
        //hs.add(null); 
        //hs.add(null);
        System.out.println(hs);
        System.out.println(hs.element());//yah top element ko print karega
        //hs.remove();
        System.out.println(hs);
        
    }
}
