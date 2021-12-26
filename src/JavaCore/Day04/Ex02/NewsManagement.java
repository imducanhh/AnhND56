package JavaCore.Day04.Ex02;

import JavaCore.Day04.Ex01.OfficerService;

import java.util.Scanner;

public class NewsManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficerService officerService = new OfficerService();

        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Select the functions to perform: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.println("1. Insert news");
                    officerService.addOfficer();
                    break;
                case 2:
                    System.out.println("2. View list news");
                    officerService.findOfficerByName();
                    break;
                case 3:
                    System.out.println("3. Average rate");
                    officerService.findOfficerByTypeAndPlace();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
