//third way of ittrate-
import java.util.ArrayList;
import java.util.ListIterator;

public class Third_way_iteration
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();
al.add(23);
al.add(24);
al.add(25);
al.add(56);
al.add(12);

ListIterator itr=al.listIterator();
while(itr.hasNext( ))
{
	System.out.println(itr.next());
	
}
}
}

