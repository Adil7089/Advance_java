class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Hii");
            }
        }
    }
}
public class A {
    public static void main(String []arg)
    {
        MyThread mt=new MyThread();
        mt.start();
        
        for(int i=1;i<=5;i++)
        {
            System.out.println("Aslamualikum");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("bye");
        }
    }
    
}
