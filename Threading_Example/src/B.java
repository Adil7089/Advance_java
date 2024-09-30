



class SThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=7;i++)
        {
            System.out.println("Avi is my friend");
            
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Ashish is my birthday");
        }
    }
}
public class B {
    public static void main(String arg[]){
        SThread mt=new SThread();
        mt.start();
        
        try
        {
            mt.join();
        }
        catch(Exception e)
        {
            System.out.println("Hello");
        }
        for(int i=1; i<=5; i++)
        {
            System.out.println("Hii");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception c){
                System.out.println("............");
               
            }
        }
        
    }
}
