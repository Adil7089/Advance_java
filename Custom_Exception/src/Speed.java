//ex of custom Exception-
class HighSpeed extends Exception
{
    
}
class LowSpeed extends Exception
{
    
}
class CheckSpeed
{
    static void check(int s)throws HighSpeed,LowSpeed
    {
        if (s>100)
        {
            HighSpeed hs=new HighSpeed();
            throw hs;
        }
        else if (s<60)
        {
            LowSpeed ls=new LowSpeed();
            throw ls;
        }
        else 
        {
            System.out.println("Nice driving");
        }
    }
}
public class Speed {
    public static void main(String arg[])
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter speed of Bike");
        int level=sc.nextInt();
        try
        {
            CheckSpeed.check(level);
        }
        catch(HighSpeed hs)
        {
            System.out.println("Please apply break");
        }
        catch(LowSpeed ls)
        {
            System.out.println("plese Excellater");
        }
        finally
        {
            System.out.println("enjoy the ride");
        }
    }
    
}
