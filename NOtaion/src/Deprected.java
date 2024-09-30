class Foo
{
    @Deprecated
    void m()
    {
        System.out.println("Hello Foo");
    }
}
public class Deprected {
    public static void main(String arg[])
    {
        Foo f=new Foo();
        f.m();
    }
}
