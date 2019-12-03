package by.bntu.fitr.alex.javalabs.lab07.input;

import java.util.Scanner;

public class Input {
    public static int input() {
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        scanner.close();
        return var;
    }
}

