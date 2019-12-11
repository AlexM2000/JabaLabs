import by.bntu.fitr.alex.javalabs.lab07.input.Input;
import by.bntu.fitr.alex.javalabs.lab07.view.Printer;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ur date of birth");
        int day = Input.input("day: ");
        int month = Input.input("month: ");
        int year = Input.input("year: ");
        LocalDate date = LocalDate.of(year, month, day);
        Printer.print(Tasks.task1(date, LocalDate.of(2019, 10, 1)));
        Printer.print(Tasks.task2(1));
    }
}

class Tasks {
    static int task1(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
    
    static void task2(int size) {
        switch(size) {
            case 0:
            System.out.println("Java");
            case 1:
            System.out.println(
            "─╔══╦══╦╗╔╦══╗" +
            "─╚╗╔╣╔╗║║║║╔╗║" +
            "──║║║╚╝║║║║╚╝║" +
            "╔╗║║║╔╗║╚╝║╔╗║" +
            "║╚╝╚╣║║╠╗╔╣║║║" +
            "╚═══╩╝╚╝╚╝╚╝╚╝"
            );
            case 2:
            System.out.println(
            "─╔══╦══╦╗╔╦══╗" +
            "─╚╗╔╣╔╗║║║║╔╗║" +
            "──║║║╚╝║║║║╚╝║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "──║║║  ║║║║  ║" +
            "╔╗║║║╔╗║╚╝║╔╗║" +
            "║╚╝╚╣║║╠╗╔╣║║║" +
            "╚═══╩╝╚╝╚╝╚╝╚╝"
            );
        }
    }
}