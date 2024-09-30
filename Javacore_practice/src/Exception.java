//ex- of Exception handling
import java.util.Scanner;

public class Exception {
public static void main(String arg[])
{
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 st value=");
        int x=sc.nextInt();
        System.out.println("Enter 2 nd value=");
        int y=sc.nextInt();
        
        int z=x/y;
        
        System.out.println("value="+z);
    }
            
    catch(Throwable e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println("Rest code");
}
}

