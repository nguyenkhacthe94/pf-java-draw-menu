import java.util.Scanner;

public class MenuNew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = -1;
        int i, j;
        main:
        while (choice != 0) {

            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the isosceles triangle");
            System.out.println("3. Draw the square triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (i = 1; i <= 3; i++) {
                        for (j = 1; j <= 8; j++) System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the isosceles triangle");
                    for (i = 1; i <=5; i++) {
                        for (j = 1; j<= 5-i; j++) System.out.print(" ");
                        for (int k = 1; k <= i; k++) System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the square triangle:");
                    System.out.println("1. Top-left corner");
                    System.out.println("2. Bottom-left corner");
                    System.out.println("3. Top-right corner");
                    System.out.println("4. Bottom-right corner");
                    System.out.println("5. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1:
                            for (i = 5; i >= 1; i--) {
                                for (j = 1; j <= i; j++) System.out.print("* ");
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (i = 1; i <= 5; i++) {
                                for (j = 1; j <= i; j++) System.out.print("*");
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (i = 1; i <=5; i++) {
                                for (j = 1; j <= 5; j++) {
                                    if (j >= i) System.out.print("* ");
                                    else System.out.print("  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (i = 5; i >=1; i--) {
                                for (j = 1; j <= 5; j++) {
                                    if (j >= i) System.out.print("* ");
                                    else System.out.print("  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 6:
                            continue main;
                    }
                    break;
            }
        }
    }
}