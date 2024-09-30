
class AThread extends Thread
{
    static Thread t;
    public void run()
    {
        try{
            t.join();
        }
        catch(Exception e)
        {
            System.out.println("...........");
        }
        for(int i=1;i<=5;i++)
        {
            System.out.println("How Are you");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
                    {
                   System.out.println("I am fine");
                    }
        }
        
    }
}
public class Hii {
    public  static void main(String arg[])
    {
        AThread.t=Thread.currentThread();
        
        AThread mt=new AThread();
        mt.start();
        try{
            mt.join();
        }
        catch(Exception e){
            System.out.println("..........");
        }
        
    }
}
