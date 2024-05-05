import java.util.Scanner;

public class Conditions {
    public static void main (String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter the gender (Male/Female/Transgender):");
        String gender = scan.nextLine();
        Conditions objectCondition = new Conditions();

        if (gender.equalsIgnoreCase("Male")) {
            objectCondition.printSeat("A1");
        } else if (gender.equalsIgnoreCase("female")) {
            objectCondition.printSeat("B1");
        } else if (gender.equalsIgnoreCase("transgender")) {
            objectCondition.printSeat("C1");
        } else {
            System.out.println("Sorry, not a valid input");
        }


    }

    void printSeat(String seatNo){
        System.out.println("Your assigned seat is : "+ seatNo);
    }

}
