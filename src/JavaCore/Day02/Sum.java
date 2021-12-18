package JavaCore.Day02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 3: ");
        System.out.print("Nhập một số bất kỳ: ");
        boolean check= false;
        int number = 0;
        while(!check){
            try{
                number= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Nhập số đê bạn ei ...");
                input.nextLine();
            }
        }

        int sumFor = 0, sumWhile = 0, sumDoWhile = 0;
        for (int i = 1; i <= number; i++) {
            sumFor += i;
        }
        System.out.println("Tổng từ 1 đến " + number + " sử dụng for: " + sumFor);

        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= number);
        System.out.println("Tổng từ 1 đến " + number + " sử dụng do while: " + sumDoWhile);

        int z = 1;
        while (z <= number) {
            sumWhile += z;
            z++;
        }
        System.out.println("Tổng từ 1 đến " + number + " sử dụng while: " + sumWhile);
    }
}
