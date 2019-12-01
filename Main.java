public class Main {
    public static void main(String[] args) {
        System.out.println(Tasks.task3(5, 3, 5));
        System.out.println(Tasks.task7(5, 3, 5));
        System.out.println(Tasks.task10(5, 3, 5));
    }

    
} 

class Tasks {
    static boolean task3(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    static boolean task7(int a, int b, int c) {
        return a%2==0 && b%2==0 && c%2==0;
    }

    static boolean task10(int a, int b, int c) {
        return a%2==0 && b%2==0 && c%2==0 || 
            a%2!=0 && b%2!=0 && c%2!=0;
    }
}