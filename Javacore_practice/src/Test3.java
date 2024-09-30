//ex - of DPA
//isme abstract class nhi bna sakte h
abstract class Foo
{
    void t()
    {
        System.out.println("Hello");
    }
}
class Doo extends Foo
{
    
}
public class Test3 {
    public static void main(String arg[])
    {
        Foo a=new Doo();
        a.t();
    }
}
