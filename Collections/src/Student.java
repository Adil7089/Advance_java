


public class Student implements Comparable<Object> 
{

 public int roll;
 public String name;
 public double per;

    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

   

    
    @Override
    public String toString() {
        return roll+":"+ name+":"+per;
    }

    @Override
    public int compareTo(Object o){
        Student s=(Student)o;
        if (this.roll>s.roll)
        {
            return 1;
        }
        else if(this.roll<s.roll)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    
    }
    
   

}
