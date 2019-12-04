import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Enter ur data of birth " + 
            "in format day month year");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(
            Tasks.task1(date, LocalDate.of(2019, 10, 1))
        );
        Tasks.task2(1);
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