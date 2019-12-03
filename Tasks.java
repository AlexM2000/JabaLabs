package by.bntu.fitr.alex.javalabs.lab07.model;

public class Tasks {
    public static int task1(int N) {
        int count = 3;
        if (N <= 0) {
            return 0;
        }
        if (N > 300) {
            count += 1000+(N-300);
        } else if (N > 200) {
            count += 600+(N-200)*2;
        } else {
            count += N*3;
        }
        return count;
    }

    public static int task2(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        return max;
    }
}