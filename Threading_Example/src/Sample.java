class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Ashish");
        System.out.println("Avi");
        System.out.println("Adil");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("tamrakar");
        System.out.println("tamr");
        System.out.println("Mo.");
    }
}

public class Sample {
 public static void main(String arg[])
 {
     MyThread1 mt1=new MyThread1();
     MyThread2 mt2=new MyThread2();
     
     mt1.start();//start method output me baar baar run karne me chenges deta h 
     mt2.start();//like adil phale print hoga to kahi ashish aise idhar udhar print karga 
 }
}
