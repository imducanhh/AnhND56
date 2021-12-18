package JavaCore.Day02;

import java.util.Scanner;

public class Sort {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = enterFromKeyboard.intNumber();
        String text = null;
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("Nhập phần tử thứ %d: ", i + 1);
                text = scanner.nextLine();
            } while (scanner.hasNextInt());
//            try {
//                System.out.printf("Nhập phần tử thứ %d: ", i + 1);
//                text = scanner.nextLine();
//                Integer.parseInt(text);
//            } catch(Exception e){
//                System.out.println("Nhập số nguyên đê bạn ei ...");
//                scanner.nextLine();
//            }
//            assert text != null;
//            arr[i] = Integer.parseInt(text);
        }
        // sắp xếp dãy số theo thứ tự giảm dần
        sortByDesc(arr);
        System.out.println("Mảng được sắp xếp giảm dần: ");
        showArr(arr);

        // sắp xếp dãy số theo thứ tự tăng dần
        sortByAsc(arr);
        System.out.println("Mảng được sắp xếp tăng dần: ");
        showArr(arr);
    }

    public static void sortByDesc(int[] arr) {
        int temp;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void sortByAsc(int[] arr) {
        int temp;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void showArr(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }
}
