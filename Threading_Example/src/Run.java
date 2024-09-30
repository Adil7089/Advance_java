

class MyThread1 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Adil");
            try
            {
                Thread.sleep(1000);// 1 second ka time le rha h  
            }
            catch(Exception e)
            {
                System.out.println("yah code 1 second ke time leke print kar rha h");
            }
            finally
            {
                System.out.println("yah code 1 second ke time leke print kar rha h");
            }
        }
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Arham");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Hello");
            }
            finally{
                System.out.println("..................................");
            }
        }
    }
}
public class Run {
    public static void main(String[] arg)
    {
        MyThread1 mt1=new MyThread1();
         MyThread2 mt2=new MyThread2();
         
         mt1.start();
         mt2.start();
         
        
    }
    
}
