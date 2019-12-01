public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.task1(100));
        System.out.println(Tasks.task3(7, 7, 7));
    }
}

class Tasks {
    static int task1(int N) {
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

    static int task3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        return max;
    }
}