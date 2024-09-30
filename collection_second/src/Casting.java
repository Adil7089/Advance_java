
//class casting
class Amitabh
{
}

class Jaya extends Amitabh
{
}
class Rekha extends Amitabh
{
}

 public class Casting
{
public static void main(String arg[])
{
Amitabh a=new Jaya();

//Jaya j=(Jaya)a;
Rekha r=(Rekha)a;
}
}