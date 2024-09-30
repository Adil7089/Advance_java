// ex of synchronijed MultiThreading
import java.util.Scanner;
class Hello
{
    synchronized void wish(String name)throws Exception
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println("Aslamualikum");
            
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(".........");
            }
            System.out.println(name);
        }
        
    }
}
class MyThread extends Thread
{
    player p;
    String name;
    MyThread(player p,String name)
    {
        this.p=p;
        this.name=name;
    }
    public void run()
    {
        p.wish(name);
    }
}
public class player {
    public static void main(String arg[])
    {
        player p=new player();
         MyThread mt1=new MyThread(p,"Adil");
        MyThread mt2=new MyThread(p,"Arham");
        MyThread mt3=new MyThread(p,"Aman");
        mt1.start();
       mt2.start();
       mt3.start();
    }
}
