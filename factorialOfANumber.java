import java.util.*;

class factorialOfANumber{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your number for which you want to find a factorial: ");
    int number = sc.nextInt();
    int factorial = 1;
    for(int i =1; i<=number; i++){
        factorial = factorial * i;
    }
    System.out.println("the factorial of "+ number +" is "+ factorial);
}
}