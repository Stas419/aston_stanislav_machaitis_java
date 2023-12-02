package aston;

import java.util.Scanner;

public class Task2 {

    public static final String MENU = "Введите имя";
    public static final String VYACHESLAV = "Вячеслав";
    public static final String GREETING = "Привет, " + VYACHESLAV;
    public static final String INVALID_NAME = "Нет такого имени";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(MENU);
        String name = scan.nextLine();
        greeting(name);
    }

    public static void greeting(String name) {
        if (VYACHESLAV.equals(name)) {
            System.out.println(GREETING);
        } else {
            System.out.println(INVALID_NAME);
        }
    }
}
