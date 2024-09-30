
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test
{
	public static void main(String arg[])
	{
		Student s1=new Student(102,"rehan",51.0);
		Student s2=new Student(103,"sahil",56.0);
		Student s3=new Student(101,"rahul",53.0);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collections.sort(al);
		System.out.println("After sorting roll no=");
		Iterator itr2=al.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}