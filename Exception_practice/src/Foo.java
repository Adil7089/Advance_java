/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
public class Foo {
    void m()throws Exception
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value=");
        int x=sc.nextInt();
        System.out.println("Enter 2nd value=");
        int y=sc.nextInt();
        
        int z=x/y;
        System.out.println("value="+z);
    }
}

class Doo
{
    void n()throws Exception
    {
        Foo f=new Foo();
        f.m();
    }
}

class Top
{
 public static void main(String[] args)
 {
  try
  {
      Doo d=new Doo();
      d.n();
  }
  catch(Exception e)
  {
      System.out.println(e.getMessage());
  }
  System.out.println("rest code");
 }
}
