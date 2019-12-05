package by.bntu.fitr.alex.javalabs.lab07.model;
import java.util.Random;

public class Tasks
{
    public static int task1(final int years) {
        final int heads = 3;
        if (years <= 0) {
            return 0;
        }
        int head_count = 0;;
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
    
    public static double task2(final double a, final double b, final double c) {
        double max = a;
        max = b > max ? b : max;
        max = c > max ? c : max;
        return a == b && b == c ? Double.NaN : max;
    }

    public static int task3() {
        final int MIN_POINTS = 1;
	    final int MAX_POINTS = 6;
        Random random = new Random();
		int numberOfPointsOnFirst = random.nextInt(MAX_POINTS) + MIN_POINTS;
		int numberOfPointsOnSecond = random.nextInt((MAX_POINTS - MIN_POINTS) + 1) + MIN_POINTS;

		return numberOfPointsOnFirst + numberOfPointsOnSecond;
    }

    public static String task4() {
        Random random = new Random();
        String currentMood = "";
        final int MOOD_NUMBER = 4;
        final String DEFAULT_MOOD = ":|";
        final String GOOD_MOOD = ":)";
        final String BAD_MOOD = ":(";
		int value = random.nextInt(MOOD_NUMBER);
		switch(value) {
            default:
            currentMood = DEFAULT_MOOD;
            case 0:
            currentMood = GOOD_MOOD;
            break;
            case 1:
            currentMood = BAD_MOOD;
            break;
        }
		return currentMood;
    }

    public static boolean task5(final int funcNum, final char letter) {
        boolean val = false;
        switch(funcNum) {
            case 0:
            val = isVowel(letter);
            case 1:
            val = isVowel2(String.valueOf(letter));
            case 2:
            val = isVowel3(letter);
        }
        return val;
    }
    
    private static boolean isVowel(final char letter) {
		return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
	}

	private static boolean isVowel2(final String letter) {
		return "aeiou".contains(letter);
	}

	private static boolean isVowel3(final char letter) {
		switch (letter) {
		case 'a':			
		case 'e':			
		case 'i':			
		case 'o':
		case 'u':
			return true;
		}
		return false;
    }
    
}
