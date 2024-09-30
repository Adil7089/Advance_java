// Ex- of multithreading jo ayk hi time me diffrent object ayk hi mathed ko call kar rha h jo har bar kuch alag hi output dega 
class player
{
    void wish(String name)
    {
        for(int i=1;i<=7;i++)
        {
            System.out.println("Good morning"+name);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("...............");
        }
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
public class Foo {
    public static void main(String arg[])
    {
        player p=new player();
         MyThread mt1=new MyThread(p,"Dhoni");
        MyThread mt2=new MyThread(p,"Kohli");
        MyThread mt3=new MyThread(p,"Rohit");
        mt1.start();
       mt2.start();
       mt3.start();
        
    }
}
