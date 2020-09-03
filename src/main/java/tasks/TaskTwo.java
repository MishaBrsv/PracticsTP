package tasks;

public class TaskTwo {

    public static String repeat(String text, int k) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <text.length();i++) {
            for (int j = 1; j <= k; j++) {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    public static Integer differenceMaxMin(int[] mas) {
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if(max < mas[i]) max = mas[i];
            if(min > mas[i]) min = mas[i];
        }
        return max - min;
    }

    public static Boolean isAvgWhole(int[] mas) {
        boolean result = false;
        int sum = 0;
        for (int i : mas) {
            sum += i;
        };
        if(sum%mas.length == 0) result = true;
        return result;
    }
}
