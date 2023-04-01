package ru.bstu.itz.kats;

import LabFunctions.lab1.*;
import LabFunctions.lab3.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лабораторные работы. Консоль.");

        int choice = 0;

        do {
            System.out.println("Меню:");
            System.out.println("1. ЛБ1: Тестирование лабораторной работы 1");
            System.out.println("2. ЛБ2: Тестирование лабораторной работы 2");
            System.out.println("3. ЛБ3: Тестирование лабораторной работы 3");
            System.out.println("4. ЛБ4: Тестирование лабораторной работы 4");
            System.out.println("5. ЛБ5: Тестирование лабораторной работы 5");
            System.out.println("0. Выход");

            System.out.print("Выберите пункт меню: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PasswordValidator.MenuValidatePassword();
                    ThreeNumbers.MenuCheckNumbers();
                    LengthConverter.MenuLengthConverter();
                    SequenceAnalyzer.MenuSequenceAnalyzer();
                    break;
                case 2:
                    break;
                case 3:
                    readTransport();
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


    /**
    * Считывает количество транспортных средств с консоли
    * Строка вида вап4явап, аа4а555
     * @return количество транспортных средств
     * */
    public static int readVehicleCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество транспортных средств: ");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.matches(".*?(\\d+).*")) {
                String numberString = line.replaceAll("[^\\d]+", "");
                int count = Integer.parseInt(numberString);
                if (count > 0) {
                    return count;
                }
            }
            System.out.println("Некорректное количество, попробуйте еще раз: ");
        }
        return 0;
    }

    /**
     * Создаем массив транспортных средств с количеством введенным в консоли
     *
     * @return Транспорт с наибольшей грузоподъемностью
     * */
    public static void readTransport() {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите количество транспортных средств: ");
        int n = readVehicleCount();

        Transport[] transports = new Transport[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите тип транспорта (1 - легковой автомобиль, 2 - мотоцикл, 3 - грузовой автомобиль): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            switch (type) {
                case 1:
                    transports[i] = new PassengerCar(4,"LADA_NIVA","A123BC888",120.0,3);
                    break;
                case 2:
                    transports[i] = new Motorcycle("Harley-Davidson", "A123BC777", 120.0, false);
                    break;
                case 3:
                    transports[i] = new Truck("КАМАЗ","A123BC888",120.0,3,true);
                    break;
                default:
                    System.out.println("Неверный тип транспорта!");
                    i--;
                    continue;
            }

            transports[i].init(scanner);
        }

        for (Transport transport : transports) {
            System.out.println(transport);
        }

        // Предполагается, что список транспортных средств хранится в списке transportList
        Transport maxLoadVehicle = null;
        int maxLoad = 0;

        for (Transport vehicle : transports) {
            if (vehicle.getLoadCapacity() > maxLoad) {
                maxLoadVehicle = vehicle;
                maxLoad = vehicle.getLoadCapacity();
            }
        }

        if (maxLoadVehicle != null) {
            System.out.println("Транспортное средство с максимальной грузоподъемностью:\n" + maxLoadVehicle.toString());
        } else {
            System.out.println("Нет транспортных средств в списке.");
        }
    }

}
