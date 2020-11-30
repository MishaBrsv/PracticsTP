package core.blockFive;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Введите входную строку и ее итоговую версию:");
        String str = in.next();
        String fullStr = in.next();

        in.close();

        System.out.println(canComplete(str, fullStr));
    }

    public static boolean canComplete(String str, String fullStr) {
        return fullStr.contains(str);
    }
}
