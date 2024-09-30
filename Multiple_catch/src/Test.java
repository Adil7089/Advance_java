import java.util.Scanner;
public class Test {
    public static void main(String arg[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            //sc=null;
            System.out.println("Enter 1sr value=");
            int x=sc.nextInt();
            
            System.out.println("Enter 2nd value=");
            int y=sc.nextInt();
            
            int z=x/y;
            System.out.println("value="+z);
            
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer Exception, some where referance var store null value instead of object");
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithematic exception some where user divde any value to zero");
        }
        System.out.println("Rest code");
    }
    
}
