import java.util.ArrayList;
import java.util.ListIterator;
public class Fourth_way_iteration
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();

al.add(78);
al.add(34);
al.add(75);
al.add(43);
al.add(23);

ListIterator itr=al.listIterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println();
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
}
}