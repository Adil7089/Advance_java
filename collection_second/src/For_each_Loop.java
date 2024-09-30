import java.util.ArrayList;
 public class For_each_Loop
{
public static void main(String arg[])
{
	ArrayList<Integer> al=new ArrayList<>();
	al.add(12);
	al.add(11);
	al.add(32);
	al.add(24);
	al.add(17);
	
	for (int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
}
}
	