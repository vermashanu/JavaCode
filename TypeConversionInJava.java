import java.util.*;

class TypeConvertionInJava{
    public static void main(String args[]){
    /*
    Type conversion in Java is also called Widening conversion or Implicit conersion.
    It only happens when
    a. Type is compatible 
       int -> double 
       int -> long
       int -> String : Not possible

    b. Destination type size > Source type size

       int -> long
       float -> long
       float -> double
       double -> float (not possible)
       short -> byte (not possible)
       float -> int (not possible)
       long -> int (Java doesn't do it implicitly and it is called lossy conversion because there is always a chance of loss of data as long occupies 8 Bytes 
       but int ocuupies 4 Bytes.
    */
    Scanner sc = new Scanner(System.in);
    float num = sc.nextInt();
    System.out.println(num);

    /* 
    Example of lossy conversion
    
    int number = sc.nextFloat();
    System.out.println(number);
    */
     
    }
}