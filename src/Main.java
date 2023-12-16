import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество панелей для обработки: ");
        int panels = scanner.nextInt();

        System.out.print("Введдите первую сторону: ");
        int a = scanner.nextInt();

        System.out.print("Введите вторую сторону: ");
        int b = scanner.nextInt();

        int numberOfSides = 2;

        int requiredAmountOfSulfide;

        requiredAmountOfSulfide = panels * a * b * numberOfSides;
        System.out.println("нужное количество вещества: " + requiredAmountOfSulfide + " едениц");
    }
}