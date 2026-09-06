//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача № 1
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        // Задача № 2
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }

        // Задача № 3
        for (int x = 2; x < 17; x = x + 2) {
            System.out.println(x);
        }

        // Задача № 4
        for (int x = 10; x >= -10; x--) {
            System.out.println(x);
        }

        // Задача № 5
        for (int x = 1904; x <= 2096; x = x + 4) {
            System.out.println(x + " год является високосным");
        }

        // Задача № 6
        for (int x = 7; x <= 98; x = x + 7) {
            System.out.println(x);
        }

        // Задача № 7
        for (int x = 1; x <= 512; x = x * 2) {
            System.out.println(x);
        }

        // Задача № 8
        int salary = 29000;
        int total = 0;
        for (int x = 1; x <= 12; x++) {
            total += salary;
            System.out.println("Месяц " + x + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача № 9
        total = 0;
        for (int x = 1; x <= 12; x++) {
            total += salary;
            total += total / 100;
            System.out.println("Месяц " + x + ", сумма накоплений равна " + total + "рублей");
        }

        // Задача № 10
        int y = 1;
        for (int x = 1; x <= 10; x++) {
            System.out.println("2 * " + x + " = " + (2 * x));
        }

    }
}