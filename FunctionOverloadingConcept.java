class FunctionOverloadingConcept{
// a. function overloading using different number of parameters
public static int sum(int a, int b){
    int sum = a + b;
    return sum;
}
public static int sum(int a, int b, int c){
    int sum = a+b+c;
    return sum;
}

// b. function overloading using different datatypes
public static int multiply(int a, int b){
    int multiply = a * b;
    return multiply;
}
public static float multiply(float a, float b){
    float multiply = a * b;
    return multiply;
}

public static void main(String args[]){
System.out.println(sum(4,8));
System.out.println(sum(2,5,5));
System.out.println(multiply(5,8));
System.out.println(multiply(5.0f, 8.0f));
}
}