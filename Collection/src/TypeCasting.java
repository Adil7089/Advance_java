import java.util.ArrayList;
public class TypeCasting {
    public static void main(String arg[])
    {
        ArrayList al=new ArrayList();
        al.add("Ramlal");
        al.add("Shamlal");
        al.add("babulal");
        
        String s=(String)al.get(1);//typecasting
        
        System.out.println(s);
    }
}
