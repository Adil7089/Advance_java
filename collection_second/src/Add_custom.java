//add custom class's object in arrayList
import java.util.ArrayList;
class  Student
{
	int roll;
	String name;
	double per;
	
	Student(int roll,String name,double per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	public String toString()
	{
		return roll+":"+name+":"+per;
	}
}
 public class Add_custom
{
	public static void main(String arg[])
	{
		Student s1=new Student(101,"Adil",86.0);
		Student s2=new Student(102,"Avi",89.0);
		Student s3=new Student(103,"Ashish",88.0);
		
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
	}
}