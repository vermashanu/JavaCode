import java.util.*;

class OperatorsInJava
{
    public static void main(String args[])
    {
        // unary operators
        // ++a,a++,--a,a--
        // ++a / --a : first value will be changed then the new value will be used.

        int a=10;
        //int b=++a;
        //int c=--a;
        int d=a++;
        int e=a--;
        System.out.println(a);
        //System.out.println(b);
       // System.out.println(c);
        System.out.println(d);
        System.out.println(e);
            

       // relational operators
       int A =10;
       int B = 11;
       System.out.println(A==B);     
            
        // logical operators
        
        
        System.out.println( (1<4) && (5>2) );  //logical AND
        System.out.println( (6!=5) || (7<2));  // logical OR
        System.out.println (!(6>9));           // logical NOT   


        // Assignment opearators  (=, += , -= , *=, /=)
        int C = 10;
       // C = C+10;
          C +=10;         // faster execution
        System.out.println(C);
            }
}