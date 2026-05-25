package application;

import services.FileService;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        FileService fileService = new FileService();

        fileService.initializeSystem();

        int option;

        do {

            System.out.println("========== MENU ==========");
            System.out.println("1 - Register a new pet");
            System.out.println("2 - Change pet data");
            System.out.println("3 - Delete pet");
            System.out.println("4 - List pets");
            System.out.println("5 - Search pets");
            System.out.println("6 - Quit");

            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Registering pet...");
                    break;

                case 2:
                    System.out.println("Changing pet...");
                    break;

                case 3:
                    System.out.println("Deleting pet...");
                    break;

                case 4:
                    System.out.println("Listing pets...");
                    break;

                case 5:
                    System.out.println("Searching pets...");
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option!");

            }

        } while (option != 6);

        scanner.close();
    }
}

