public class Main {
    public static void main(String[] args) {
        double weight = 1000000;
        weight = Tasks.task1(weight, 2);
        Tasks x = new Tasks(10, 20);
        Tasks y = new Tasks(30, 40);
        Tasks.task4(x, y);
        System.out.println(x.a);
        System.out.println(y.b);
    }
}

class Tasks {
    int a;
    int b;

    Tasks(int i, int j) {
        a = i;
        b = j;
    }

    static double task1(double grams, int format) {
        switch (format) {
            case 0:
                grams /= 1000;
                break;
            case 1:
                grams /= 100000;
                break;
            case 2:
                grams /= 1000000;
                break;
            default:
                grams = -1;
                break;
        }
        return grams;
    }

    static void task4(Tasks a, Tasks b) {
        a.a += b.b;
        b.b = a.a - b.b;
        a.a = a.a - b.b;
    }
}