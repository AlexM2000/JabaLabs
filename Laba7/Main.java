package by.bntu.fitr.alex.javalabs.lab07.control;

import by.bntu.fitr.alex.javalabs.lab07.view.Printer;
import by.bntu.fitr.alex.javalabs.lab07.model.Tasks;
import by.bntu.fitr.alex.javalabs.lab07.input.Input;

public class Main
{
    public static void main(final String[] array) {
        int input = Input.input();
        int input2 = Input.input();
        int input3 = Input.input();
        Printer.print(String.valueOf(Tasks.task1(input)));
        double res = Tasks.task2(input, input2, input3);
        Printer.print(String.valueOf(Double.isNaN(res) ? "equal" : res));
        Printer.print(String.valueOf(Tasks.task3()));
        Printer.print(String.valueOf(Tasks.task4()));
        Printer.print(String.valueOf(Tasks.task5(0, 'a')));
    }
}