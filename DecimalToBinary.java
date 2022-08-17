class DecimalToBinary{


    public static void decimalToBinary(int dec){
        int myNum = dec;
        int power = 0;
        int binNum = 0;
        while(dec > 0){
            int remainder = dec % 2;
            binNum = binNum + (remainder * (int)Math.pow(10,power));
            power++;
            dec = dec /2;  // quotient
 

        }
        System.out.println("the decimal form of "+ myNum +" in binary is "+ binNum);
    }

 public static void main(String args[]){
    decimalToBinary(7);
    }
}