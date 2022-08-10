import java.util.*;

class UsingDoWhileWithBreak{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter your number: ");
            number = sc.nextInt();
            if( number % 10 == 0)
            {
            break;
            }
            System.out.println(number);
        }while(true);
    }
}