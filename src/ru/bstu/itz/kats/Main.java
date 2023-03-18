package ru.bstu.itz.kats;

import LabFunctions.lab1.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Проверить числа");
            System.out.println("2. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите первое число: ");
                    int a = scanner.nextInt();

                    System.out.print("Введите второе число: ");
                    int b = scanner.nextInt();

                    System.out.print("Введите третье число: ");
                    int c = scanner.nextInt();

                    checkNumbers(a, b, c);

                    break;

                case 2:
                    System.out.println("Выход.");
                    return;

                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }

    private static void checkNumbers(int a, int b, int c) {
        ThreeNumbers tn = new ThreeNumbers(a, b, c);

        if (tn.hasPositiveSum()) {
            System.out.println("Сумма каких-либо двух чисел является положительной.");
        } else {
            System.out.println("Сумма каких-либо двух чисел не является положительной.");
        }
    }
}
