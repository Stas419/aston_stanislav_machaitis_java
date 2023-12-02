package aston;

import java.util.Scanner;

public class Task1 {

    public static final String GREETING = "Привет";
    public static final int NUMBER_LIMIT = 7;
    public static final String MENU = "Введите число";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(MENU);
        int number = scan.nextInt();
        greeting(number);
    }

    public static void greeting(int number) {
        if (number > NUMBER_LIMIT) {
            System.out.println(GREETING);
        }
    }


}
