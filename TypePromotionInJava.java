import java.util.*;

class TypePromotionInJava{
    public static void main(String args[])
    {
        /* 
        While evaluating experssions in Java 
        Rules: 1. Java automatically protoes each byte/short/char operand into int.
         */
        
        
        /* Example 1
        
        char a = 'a';
         char b ='b';
         char c = b-a;    // (b-a) has become int now and we are trying to convert int into char : lossy conversion 
         System.out.println((int)a);
         System.out.println((int)b);
         System.out.println(a);
         System.out.println(b-a);   // type promotion is always done while dealing with expressions
            
         */   



        /* Example 2
         short a =5;
         byte b = 28;
         char c ='c';
         byte bt = (byte) (a+b+c);
         // System.out.println(bt);
         System.out.println(bt);
         */

         // Rule 2: if one operand is long/float/double then the whole expression is promoted to long/float/double respectively.

        /* Example 2
         int a = 12;
         double b= 3.24;
         float c = 1.2f;
         long d= 37;
         double ans = a+b+c+d;
         System.out.println(ans);
         */

         byte b = 5;
        // byte a = b*4;  // this has become an integer now
        byte a = (byte)(b*4);  // type casting and type promotion
         System.out.println(a);
             }
}