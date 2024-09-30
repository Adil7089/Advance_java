//example of DPA(Dynamic Polimorphic Asiment)
class Foo
{
    void m()
    {
        System.out.println("Hello");
    }
}
class Doo extends Foo
{
    
}
public class Test {
    public static void main(String arg[])
    {
        Foo f=new Doo(); // DPA
        f.m();
    }
    
}
