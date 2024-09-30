class Foo
{
public String ToString()
{
return "hello";
}
}

public class To_string
{
public static void main(String arg[])
{
Foo f=new Foo();
//System.out.println(f.toString());
System.out.println(f);
}
}