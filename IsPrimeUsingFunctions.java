class IsPrimeUsingFunctions{


    public static boolean isPrime(int n){
        // corner cases
        // for n = 2
        if (n == 2){
        return true;
        }

       //only for n>= 2
        boolean isPrime = true;
        // optimised code
        for (int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
        /*
         for (int i=2; i<= n-1 ; i++){
            if ((n % i) == 0){
            //isPrime = false;
            //break;
            return false;
            }
        }
       //return isPrime
       return true;
    }  
    */
public static void main(String args[]){
System.out.println(isPrime(11));
}
}
