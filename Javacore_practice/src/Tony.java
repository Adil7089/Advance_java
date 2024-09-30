interface I
{
    void m();
}
class Doo implements I
{
    public void m()
    {
        System.out.println("hello all");
    }
}
public class Tony {
    public static void main(String arg[])
    {
        I i=new Doo();
        i.m();
            }    
}
