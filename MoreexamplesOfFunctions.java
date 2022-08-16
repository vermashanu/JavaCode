
class MoreexamplesOfFunctions{

public static int multiply(int a,int b){
 int product = a * b;
 return product;
}

public static int fact(int n){
    int f = 1;
    for (int i =1;i<=n;i++){
        f = f*i;
    }
    return f;
}



public static void main(String args[]){
int a = 5;
int b = 12;
int prod = multiply(a,b);
System.out.println(prod);

prod = multiply (15,6);
System.out.println(prod);

System.out.println(fact(6));
}
}