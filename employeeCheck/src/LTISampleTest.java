import java.io.*;
import java.util.*;

public class LTISampleTest {
    public static void main(String[] args) throws IOException {
        int counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String input1 = input.next();
        Scanner input2 = new Scanner(new File(input1));
        Scanner inputEmployee = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String inputedEmployee = inputEmployee.next();
        while(input2.hasNextLine()){
            String line = input2.nextLine();
            if(line.matches("[A-Z][A-Z][A-Z][0-9][0-9][:][A-Z]+[:][1-9][0-9]+")) {
                String[] steve = line.split(":");
                String employeeName = steve[1];
                Integer numberOfHours = Integer.parseInt(steve[2]);
                if (employeeName.equals(inputedEmployee)) {
                    System.out.println(employeeName + " has worked " + numberOfHours + " hours total.");
                    counter++;
                }
            }
        }
        if(counter==0){
            System.out.println("Employee "+inputedEmployee+" was not found.");
        }
    }
}
