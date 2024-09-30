import java.util.Scanner;
public class Test1 {
    public static void main(String arg[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            //sc=null;
            System.out.println("Enter 1st value=");
            int x=sc.nextInt();
            System.out.println("Enter 1st value=");
            int y=sc.nextInt();
            
            int z=x/y;
            System.out.println("value="+z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithematic exception some where user divided any value to zero");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest code");
    }
}
