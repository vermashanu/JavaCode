import java.util.*;

class TypecastingInJava
{
    public static void main(String args[]){

        /*
        If we want to convert datatypes expilicitly in Java then we use TypeCasting: also called narrowing conversion or explicit conversion
        example:

        float a = 3.4;
        int b = a     // loss of data will be there and it's called lossy conversion 

        even if we want to convert it explicitly float into int then we use 
        int b =(int)a;
        */


        

        float a = 35.25f;
        // int b = a;             :this will give an error of lossy conversion
        int b = (int)a;
        System.out.println(b);

       /* char ch = 'a';
        int number = ch;
        System.out.println(number);
        */

    }
}