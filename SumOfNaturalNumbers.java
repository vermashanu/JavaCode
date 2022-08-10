import java.util.*;

class SumOfNaturalNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;

        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("the sum value is "+ sum);


    }
}