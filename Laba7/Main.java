package by.bntu.fitr.alex.javalabs.lab07.control;

import by.bntu.fitr.alex.javalabs.lab07.view.Printer;
import by.bntu.fitr.alex.javalabs.lab07.model.Tasks;
import by.bntu.fitr.alex.javalabs.lab07.input.Input;

public class Main
{
    public static void main(final String[] array) {
        final int input = Input.input();
        final int input2 = Input.input();
        final int input3 = Input.input();
        Printer.print(" " + Tasks.task1(input));
        Printer.print(" " + Tasks.task2(input, input2, input3));
    }
}