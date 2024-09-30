
// Ex  throws IOException with Override- jise hum parent mathod me hi kevaL use kar sakte h child method nhi likh sakte h .
import java.io.IOException;
 class Soo {
    void m()throws IOException
    {
        System.out.print("Hello");
    }
}
class Doo extends Soo
{
    void m()//yha per hum throw IOEception ko override nhi kar sakte h
    {
        System.out.println("bye");
    }
}
public class Foo
{
    public static void main(String arg[]){
        Doo d=new Doo();
        d.m();
    }
}