package ru.bstu.itz.kats;

import LabFunctions.lab1.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лабораторные работы. Консоль.");

        int choice = 0;

        do {
            System.out.println("Меню:");
            System.out.println("1. ЛБ1: MenuCheckNumbers");
            System.out.println("2. ЛБ2: MenuValidatePassword");
            System.out.println("3. ЛБ3: MenuSomeFunction");
            System.out.println("4. ЛБ4: MenuAnotherFunction");
            System.out.println("5. ЛБ5: MenuYetAnotherFunction");
            System.out.println("0. Выход");

            System.out.print("Выберите пункт меню: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ThreeNumbers.MenuCheckNumbers();
                    break;
                case 2:
                   // PasswordValidator.MenuValidatePassword();
                    break;
                case 3:
                    // вызов соответствующего метода для ЛБ3
                    break;
                case 4:
                    // вызов соответствующего метода для ЛБ4
                    break;
                case 5:
                    // вызов соответствующего метода для ЛБ5
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неправильный выбор, попробуйте еще раз");
                    break;
            }

            System.out.println();
        } while (choice != 0);
    }

}
