import java.util.ArrayList;
import java.util.Iterator;
 public class Second_way_iteration
{
public static void main(String arg[])
{
	ArrayList<Integer> al=new ArrayList<>();
	al.add(12);
	al.add(11);
	al.add(32);
	al.add(24);
	al.add(17);
	Iterator itr=al.iterator();
	while(itr.hasNext())
	
	
	{
		System.out.println(itr.next());
	}
}
}
	