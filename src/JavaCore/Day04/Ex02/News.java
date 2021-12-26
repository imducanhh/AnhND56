package JavaCore.Day04.Ex02;

import java.util.Scanner;

public class News implements InterfaceNews {
    String title, publishDate, author, content;
    float averageRate;
    int[] rateList = new int[3];
    Scanner scanner = new Scanner(System.in);

    public News(String title, String publishDate, String author, String content, float averageRate) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public News() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Pubish date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average rate: " + getAverageRate());
    }

    public float calculate() {
        return (float) ((rateList[0] + rateList[1] + rateList[2]) / 3.0);
    }

    public void input() {
        System.out.print("Title: ");
        title = scanner.nextLine();
        System.out.print("Publish date: ");
        publishDate = scanner.nextLine();
        System.out.print("Author: ");
        author = scanner.nextLine();
        System.out.print("Content: ");
        content = scanner.nextLine();
    }
}
