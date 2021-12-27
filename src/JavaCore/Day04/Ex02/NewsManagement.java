package JavaCore.Day04.Ex02;

import java.util.Scanner;

public class NewsManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsService newsService = new NewsService();

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
                    newsService.insertNews();
                    break;
                case 2:
                    System.out.println("2. View list news");
                    newsService.displayListNews();
                    break;
                case 3:
                    System.out.println("3. Average rate");
                    newsService.averageRate();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
