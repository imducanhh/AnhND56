package JavaCore.Day04.Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsService {
    News news = null;
    Scanner scanner = new Scanner(System.in);
    List<News> listNews = new ArrayList<News>();

    public void insertNews() {
        int number;
        System.out.print("Amount of news: ");
        number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the " + (i + 1) + " information");
            news = new News();
            news.input();
            listNews.add(news);
        }
    }

    public void displayListNews() {
        for (News list : listNews) {
            list.display();
        }
    }

    public void averageRate() {
        for (News list : listNews) {
            list.averageRate = list.calculate(list.rateList);
            list.display();
        }
    }
}
