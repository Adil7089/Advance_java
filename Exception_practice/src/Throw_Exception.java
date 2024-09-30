/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// throw Excepton ka use jub karte h jub hame Exception lana hota h apne code me tab use krte h
//throw Exception our throws Exception dono hi alag h yah throw Exception ka ex- h.
 //import java.util.Scanner;
 class Doo{
    void m()
    {
        throw new ArithmeticException("Hello all");//throw Exceptiom
    }
}

public class Throw_Exception
{

    public static void main(String arg[])
    {
        Doo d=new Doo();
        d.m();
    }
}