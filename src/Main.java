import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //receives desired size and fill
        System.out.print("Enter size: ");
        int size = s.nextInt();

        while (size > 50 || size < 0) {
            //if size is above 50, reprompts user for a lower value
            System.out.print("Invalid size, must be 1-50. Re-enter size: ");
            size = s.nextInt();
        }

        System.out.print("Enter fill: ");
        char fill = s.next().charAt(0);
        System.out.println();

        //loop for size, print spaces to give triangle shape then fill an opposite amount of spaces and characters
        //could method this loop for more shapes utilizing loops, like rectangles

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(fill + " ");
            }
            //new line for restarting loop
            System.out.println();
        }
    }
}