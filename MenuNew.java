import java.util.Scanner;

public class MenuNew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = -1;
        int i, j;
        while (choice != 0) {

            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (i = 1; i <= 3; i++) {
                        for (j = 1; j <= 8; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (i = 1; i <= 6; i++) {
                        for (j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Draw the triangle");
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
            }
        }
    }
}