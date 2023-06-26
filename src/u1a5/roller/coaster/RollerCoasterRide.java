
import java.util.Scanner;

    public class RollerCoasterRide {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your height in cm (between 122 and 188 cm): ");
            int height = input.nextInt();

            System.out.print("Do you have back trouble? (Y/N): ");
            String hasBackTrouble = input.next();

            System.out.print("Do you have heart trouble? (Y/N): ");
            String hasHeartTrouble = input.next();

            if (height >= 122 && height <= 188) {
                if (!hasBackTrouble.equalsIgnoreCase("Y") && !hasHeartTrouble.equalsIgnoreCase("Y")) {
                    System.out.println("It is safe for you to ride the roller coaster!");
                } else {
                    System.out.println("Sorry, you are not allowed to ride the roller coaster.");
                }
            } else {
                System.out.println("Sorry, you do not meet the height requirements for the roller coaster.");
            }
        }
    }
