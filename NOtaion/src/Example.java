//ex of Annotion(@Override)
class Foo
{
    void method()
    {
        System.out.println("Hello");
    }
}
class Doo extends Foo
{
    @Override
    void method()
    {
        System.out.println("bye");
    }
}
public class Example {
    public static void main(String[] arg)
    {
        Doo d=new Doo();
        d.method();
    }
}
