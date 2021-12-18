package JavaCore.Day02;

import java.util.Scanner;

public class enterFromKeyboard {
    public static int intNumber() {
        Scanner input = new Scanner(System.in);
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
        return (number);
    }
}
