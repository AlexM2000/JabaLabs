package by.bntu.fitr.alex.javalabs.lab04.control;

import by.bntu.fitr.alex.javalabs.lab04.input.Input;
import by.bntu.fitr.alex.javalabs.lab04.view.Printer;
import by.bntu.fitr.alex.javalabs.lab04.tasks.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter ur date of birth");
        int day = Input.input("day: ");
        int month = Input.input("month: ");
        int year = Input.input("year: ");
        Task1.init(day, month, year);
        Printer.print(" " + Task1.task1(2019, 12, 11));
        Task2.task2(1);
    }
}