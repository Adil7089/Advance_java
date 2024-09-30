
class LowSugar extends Exception
{
  void n(){
        System.out.println("you have low Sugar");
     }
}
class HighSugar extends Exception
{
 void m(){
        System.out.println("you have low Sugar");
     }  
}
class CheckSugar 
{
    static void check(int l)throws HighSugar,LowSugar
    {
        if(l>120)
        {
            HighSugar hs=new HighSugar();
            throw hs;
        }
        else if(l<70)
                {
                    LowSugar ls=new LowSugar();
                    throw ls;
                }
        else
        {
            System.out.println("you have normal Sugar level");
        }
    }
}
        class Test
        {
            public static void main(String arg[])
            {
                java.util.Scanner sc=new java.util.Scanner(System.in);
                System.out.println("enter sugar level=");
                int level=sc.nextInt();
            
            try
            {
                CheckSugar.check(level);
                
            }
            catch(HighSugar Hs)
            {
                HighSugar hs=new HighSugar();
                hs.m();
            }
            catch(LowSugar s)
            {
                
                s.n();
            }
            finally
            {
                System.out.println("thanks for coming");
            }
    }
}
    
    

    
            
