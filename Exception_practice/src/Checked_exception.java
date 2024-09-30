//Exception Handling 
public class Checked_exception {
    public static void main(String[] arg)
    {
        System.out.println("Hello");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bye");
    }
}
