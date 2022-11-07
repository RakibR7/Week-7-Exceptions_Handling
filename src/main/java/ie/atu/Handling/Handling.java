package ie.atu.Handling;
import java.util.Scanner;


public class Handling {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0-9");
        Scanner myscan = new Scanner(System.in);
        int mynum = myscan.nextInt();

        if (mynum <= 9 || mynum > 0){
            System.out.println("You entered" + mynum);

        }else
        {
            System.out.println("Not a valid number");
        }


    }
}
