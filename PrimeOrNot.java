import java.util.*;

class PrimeOrNot{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number == 2)
        {
          System.out.println("the entered number is a prime number.");  
        }
        else
        {
        for(int i= 2; i<= (number-1) ;i++){
            if (number % i == 0) 
            {   
                isPrime = false;
               
            } 
        }
        if (isPrime == true){
            System.out.println("the entered number is a prime number.");
        }
        else 
        {
            System.out.println("the entered number is not a prime number.");
        }
    }
    }
}