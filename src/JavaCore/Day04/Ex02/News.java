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
        System.out.println("Title: " + getTitle() + ", Publish date: " + getPublishDate() + ", Author: " + getAuthor() + ", Content: " + getContent() + ", Average rate: " + getAverageRate());
    }

    public float calculate(int[] arr) {
        return (float) ((arr[0] + arr[1] + arr[2]) / 3.0);
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
        System.out.print("Rate 1: ");
        rateList[0] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Rate 2: ");
        rateList[1] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Rate 3: ");
        rateList[2] = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString() {
        return "Title: " + getTitle() + ", Publish date: " + getPublishDate() + ", Author: " + getAuthor() + ", Content: " + getContent() + ", Average rate: " + getAverageRate();
    }
}
