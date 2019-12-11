package by.bntu.fitr.alex.javalabs.lab04.input;

import java.util.Scanner;

public class Input
{
    final static Scanner scanner = new Scanner(System.in);
    public static int input(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
}