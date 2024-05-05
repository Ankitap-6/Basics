import java.util.Scanner;

public class GenderBasedSeatAssignmentSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender (Male/Female/Transgender):");
        String gender = scan.nextLine();
        String seat;

        switch (gender.toUpperCase()) {
            case "MALE":
                seat = "A1";
                break;
            case "FEMALE":
                seat = "B1";
                break;
            case "TRANSGENDER" :
                seat= "C1";
                break;
            default:
                throw new IllegalArgumentException("Not valid");


        }
        System.out.println("Your assigned seat is :" + seat);
    }
}
