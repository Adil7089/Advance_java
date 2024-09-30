//Ex- of DPA
class Foo
{
    void m()
    {
        System.out.println("Hello");
    }
}
class Doo extends Foo
{
    void n()
    {
        System.out.println("Bye");
    }
}
 class monty {
    public static void main(String []arg)
    {
    Foo c=new Doo(); //DPA
           //c.n();
            
    }
    
}
