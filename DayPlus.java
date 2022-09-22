package hw4;
import java.util.Scanner;

/**
 * Задача 1
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */


public class DayPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        dayNext(day, month, year);
    }

    public static void dayNext(int day, int month, int year) {
        if (isHighYear(year) && month == 2 && day == 28)
            System.out.println(formatDate(day + 1, month, year));
        else if (!(isHighYear(year)) && month == 2 && day == 29)
            System.out.println(formatDate(01, month + 1, year));
        else if (day == 31 && month == 1 || day == 31 && month == 3 || day == 31 && month == 5 || day == 31 && month == 7 || day == 31 && month == 8 || day == 31 && month == 10)
            System.out.println(formatDate(01, month + 1, year));
        else if (day == 30 && month == 4 || day == 30 && month == 6 || day == 30 && month == 9 || day == 30 && month == 11)
            System.out.println(formatDate(01, month + 1, year));
        else if (day == 31 && month == 12) {
            System.out.println(formatDate(01, 01, year + 1));
        }
        System.out.println(formatDate(day + 1, month, year));
    }

    public static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    public static boolean isHighYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
