

import java.util.Scanner;

public class Menu {
    public boolean showMenu(ClearConsole c) {
        c.clearConsole();
        System.out.println("=== Главное меню ===");
        System.out.println("1. Начать игру");
        System.out.println("2. Выйти");
        System.out.print("Выберите действие: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                System.out.println("Правила игры");
                default:
                System.out.println("Некорректный выбор. Попробуйте снова.");
                return false;
        }
    }
}
