//is program me hame Exception dega  

//throws Exception ki help se hum Exception ko hide kar sakte h but solve nhi kar sakte solve karne ke liye try catch lagana hi padega.
import java.util.Scanner;
public class App{
    void m()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value=");
        int x=sc.nextInt();
        System.out.println("Enter 2nd value=");
        int y=sc.nextInt();
        
        int z=x/y;
        System.out.println("value="+z);
        
    }
}

class Doo
{
    void n()throws Exception
    {
        App a=new App();
        a.m();
    }
}

class Test
{
    public static void main(String arg[])throws Exception
    {
        Doo d=new Doo();
        d.n();
        System.out.println("Rest code");
    }
}