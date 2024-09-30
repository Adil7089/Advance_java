import java.util.ArrayList;
public  class Collection_iteration
{
public static void main(String arg[])
{
	ArrayList<Integer> al=new ArrayList<>();
	al.add(12);
	al.add(11);
	al.add(32);
	al.add(24);
	al.add(17);
	
	for (Integer i:al)
	{
		System.out.println(i);
	}
}
}
	