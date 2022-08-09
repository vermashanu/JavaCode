import java.util.*;

class SwitchStatement{
    public static void main(String args[]){
        int number =3;
        switch(number){
            case 3 : System.out.println("Pizza");
                     break;
            case 1 : System.out.println("Burger");
                     break;
            case 2 : System.out.println("Mango shake");
                     break;
            default: System.out.println("Wake up!");
        }
    }
}