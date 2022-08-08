import java.util.*;

class AreaOfCircle{
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("Please enter the radius of a circle: " );
    Float rad = sc.nextFloat();
    Float area = 3.14f * rad * rad;    /* if we have writter 3.14 only then the complier takes it as a double(by default) which leads to an error: 
    as it's not pssible to covert double into float.*/
    System.out.println("The area of a circle is: " + area);
    

    }
    
}