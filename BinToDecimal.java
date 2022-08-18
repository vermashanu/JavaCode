class BinToDecimal{
    public static void binToDec(int binNum){
        int number = binNum;
        int power = 0;
        int decNum = 0;
        

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println("the conversion of "+ number +" in decimal is "+ decNum);
    }

    
    public static void main(String args[]){
    binToDec(1011);
    }
}