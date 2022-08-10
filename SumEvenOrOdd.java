import java.util.*;

class SumEvenOrOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumEven =0;
        int sumOdd = 0;
        int choice;
        do{
            System.out.println("Please enter your number :");
            int number = sc.nextInt();

        if(number % 2 == 0)
        {
          sumEven = sumEven + number;
        } 
        else
        {
            sumOdd = sumOdd + number;
        }
         System.out.println("Do you want to add more number : Press 1 for yes or Press 0 for no");
         choice = sc.nextInt(); 

        }while(choice == 1);
        
           System.out.println("the sum of even numbers is" + sumEven );
           System.out.println("the sum of odd numbers is" + sumOdd ); 
        
        }
        

    }
