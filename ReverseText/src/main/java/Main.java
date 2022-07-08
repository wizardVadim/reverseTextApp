import java.util.Scanner;

public class Main {

    private static final long REPETITIONS = 1_000_000;
    private static long workTime;

    public static void main(String[] args) {

        String str = input();

        String newStr = reverse(str);

        System.out.println("Start string: " + str + "\n" +
                "New string: " + newStr + "\n" +
                "Work time: " + workTime);

    }

    private static String input() {
        System.out.println("Enter string: ");
        return new Scanner(System.in).nextLine();
    }

    // testMethod
    private static String reverse(String str) {
        long currentTime = System.currentTimeMillis();
        int i = 0;
        String newStr = "";
        while (i != REPETITIONS) {
            newStr = "";

            int start = str.length() - 1;

            for (int j = start; j >= 0; j--) {
                newStr += str.charAt(j);
            }

            i++;
        }

        workTime = System.currentTimeMillis() - currentTime;

        return newStr;
    }
}
