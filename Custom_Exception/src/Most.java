import java.io.IOException;
import java.io.FileNotFoundException;
class Foo
{
    void m()throws IOException
    {
        System.out.print("Hii");
    }
}
class Doo extends Foo
{
    void m()//throws FileNotFoundException( aisa karege to errer dega 
    {
        System.out.print("Aslamualikum");
    }
    
}
public class Most {
    public static void main(String arg[])
    {
        Doo d=new Doo();
        d.m();
    }
    
}
