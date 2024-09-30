//isme mathed override nhi hoga
//ex- of DPA
class Foo
{
    void m()
    {
        System.out.println("Hello");
    }
}
class Doo extends Foo
{
    void m()
    {
        System.out.println("Welcome");
    }
}
public class Sony {
    public static void main(String arg[])
    {
        Foo f=new Doo(); //DPA
            f.m();
    }
    
}
