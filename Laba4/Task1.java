package by.bntu.fitr.alex.javalabs.lab04.tasks;
import java.time.LocalDate;
import java.time.Period;

public class Task1 {
    static LocalDate birthDate;

    public static void init(int day, int month, int year) {
        birthDate = LocalDate.of(year, month, day);
    }

    public static int task1(int day, int month, int year) {
        LocalDate currentDate = LocalDate.of(day, month, year);
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}