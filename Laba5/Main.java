import java.util.Calendar;
import testpack.Car;
import test2.Myclass;

public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.task1());
        System.out.println(Tasks.task2(345));
        System.out.println(Tasks.task4(345));
        System.out.println(Tasks.task5(145));
        Car.output();
        Myclass.out();
    }
}

class Tasks {
    
    /**
     * Returns current time in hours, min
     */
    static int task1 () {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 
     * @param num
     * @return sum
     */
    static int task2 (int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // miss task 3 since it's similar to task2
    /**
     * Rearranges digits in num in reversed order
     */
    static int task4 (int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = 10 * reversed + num % 10;
            num /= 10;
        }
        return reversed;
    }
    
    /**
     * Given a number of a day
     * Returns number of current day of week
     */
    static int task5 (int day) {
        return day % 7;
    }
}