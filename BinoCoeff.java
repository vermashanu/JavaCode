class BinoCoeff{

public static int binoCoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact (n-r);
        int nCr_binoCoeff = n_fact / (r_fact * nmr_fact);
        return nCr_binoCoeff;
    }

    public static int fact(int n){
        int f = 1;
        for (int i=1; i<=n ; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]){
    int n = 7;
    int r =2;
    System.out.println(binoCoeff(n,r));
    
    


    }
}