

class GThread extends Thread
{
    static Thread t;
    public void run()
    {
        try{
            t.join();
        }
        catch(Exception e)
        {
            System.out.println("Hii");
        }
        for(int i=1;i<=7;i++)
                {
                    System.out.println("Rama");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Hello");
                    }
                }
    }
}
public class Hello {
    public static void main(String arg[]){
        GThread.t=Thread.currentThread();
        
        GThread mt=new GThread();
        mt.start();
        
        for(int i=1;i<=7;i++){
            System.out.println("Seeta");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                {
                    System.out.println("Hello");
                }
                
            
            }
        }
    }
}
