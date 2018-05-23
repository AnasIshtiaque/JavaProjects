//this program checks to see if the format of the postal code entered is correct

import java.util.*;

public class PostalCodeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter postal code (no spaces allowed): ");
        String input1 = input.next();
        if(input1.matches("[A-Z][0-9][A-Z][0-9][A-Z][0-9]")){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
