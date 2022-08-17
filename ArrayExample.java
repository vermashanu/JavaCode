import java.util.*;

public class ArrayExample{
   
    public static void main(String args[]){
    // creation of an array
    int marks[] = new int [100];
    // int numbers[] ={1,4,7,2};
    //String fruits[] = {"apple", "banana", "orange"};



    // length of an array

    System.out.println("the length of an array is "+marks.length);
    // taking an input
    Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();
    marks[0]= sc.nextInt();   // physics
    marks[1]= sc.nextInt();    // chemistry
    marks[2]= sc.nextInt();    // maths

    // printing an output
    System.out.println("Physics marks = "+ marks[0]);
    System.out.println("Chemistry marks = "+ marks[1]);
    System.out.println("Maths marks = "+ marks[2]);

    // update
    marks[2] = 100;
    marks[1] = marks[1] +2;
    System.out.println("Maths marks = "+ marks[2]);
    System.out.println("Chemistry marks = "+ marks[1]);

    // calculating %
    int percentage = (marks[0]+marks[1]+marks[2])/3;
    System.out.println("the percentage is "+ percentage +"%");

}
}
    
