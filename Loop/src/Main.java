import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        loopWhile();
    }

    private static void loopWhile() {
        Scanner scanner = new Scanner(System.in);
        String name = "EA";

        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
    }

    private static void loopDoWhile() {
        Scanner scanner = new Scanner(System.in);
        String name = "EA";

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

        System.out.println("Hello " + name);
    }
}