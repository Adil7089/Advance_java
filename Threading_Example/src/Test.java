import java.util.Scanner;

class Foo
{
    void m()
    {
        for(int i=1;i<=8;i++)
        {
             System.out.println("value="+i);
             try{
                 Thread.sleep(1000);
             }
             catch(Exception e)
             {
                 System.out.println(".......");
             }
        }
    }
}
class HThread extends Thread
{
public void run()
{
    Foo f=new Foo();
    f.m();
}
}
public class Test {
    public static void main(String arg[])
    {
        HThread mt1=new HThread();
        HThread mt2=new HThread();
        mt1.start();
        mt2.start();
    }
}
