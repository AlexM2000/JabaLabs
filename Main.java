package by.bntu.fitr.alex.javalabs.lab07.control;

import by.bntu.fitr.alex.javalabs.lab07.model.Tasks;
import by.bntu.fitr.alex.javalabs.lab07.view.Printer;
import by.bntu.fitr.alex.javalabs.lab07.input.Input;

public class Main {
    public static void main(String[] args) {
        int a = Input.input();
        int b = Input.input();
        int c = Input.input();
        Printer.print(" " + Tasks.task1(a));
        Printer.print(" " + Tasks.task2(a, b, c));
    }
}

