 
 //ex of parent Exception our child Exception dekhege.
//child Exception-yah vah kahlati h jo kewal ayk Exception ko slove karta h
//parent Exception-yah vah h jo all type ki Exception ko solve karta h
import java.util.Scanner;
public class Test2
{
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
        catch(Exception e){
           System.out.println(e.getMessage());
        }
        //catch(ArithmeticException e)
        {
             System.out.println("Arithmetic exception some where user divide any value to zero");

        }
        System.out.println("Rest code");
    
    }
}

