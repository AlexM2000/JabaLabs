package by.bntu.fitr.alex.javalabs.lab07.model;

public class Tasks
{
    public static int task1(final int years) {
        final int heads = 3;
        if (years <= 0) {
            return 0;
        }
        int head_count;
        if (years > 300) {
            head_count = heads + (1000 + (years - 300));
        }
        else if (years > 200) {
            head_count = heads + (600 + (years - 200) * 2);
        }
        else {
            head_count = heads + years * 3;
        }
        return head_count;
    }
    
    public static int task2(final int a, final int b, final int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        else if (c > max) {
            max = c;
        }
        return max;
    }
}