package com.brainacad.oop.testenum1;

import java.util.Scanner;

/**
 * Created by Yuriy on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyDayOfWeek[] days = MyDayOfWeek.values();//прописуємо метод що повертає значення всех елементів
        for (MyDayOfWeek day : days) {//iter і виводиться код автоматично
            switch (day) {//виводимо на екран дні занять за допомогою switch. Alt+Enter і обираємо автоматичне генерування case
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: "+ day);
            }
        }
        Scanner addDay = new Scanner(System.in);
        String day = addDay.nextLine();
        System.out.print("The next day of week: ");
        System.out.println(MyDayOfWeek.valueOf(day).nextDay());

    }
}




