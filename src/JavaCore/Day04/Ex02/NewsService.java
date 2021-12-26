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
            System.out.printf("Nhập thông tin tin tức thứ %s\n", i + 1);
            news = new News();
            news.input();
            listNews.add(news);
        }
    }
}
