import java.util.*;

class FunctionExampleUsingReturnType{

    public static int calculateSum(int first, int second){
        int sum = first + second;
        return(sum);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int a = sc.nextInt();
    System.out.println("Enter your second number: ");
    int b = sc.nextInt();
    int sum = calculateSum(a,b);
    System.out.println("the sum is "+ sum);

}
}