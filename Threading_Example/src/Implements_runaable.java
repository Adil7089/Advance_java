

class MThread1 implements Runnable
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("Rama");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
             System.out.println("Hello");
            }
            
        }
    }
}

class MThread2 implements Runnable
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("sita");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
             System.out.println("Hello");
            }
            
        }
    }
}
public class Implements_runaable {
    public static void main(String arg[])
    {
        MThread1 mt1=new MThread1();
       MThread2 mt2=new MThread2();
       
       Thread t1=new Thread(mt1);
       Thread t2=new Thread(mt2);
       t1.start();
       t2.start();
    }
}
