package core;

import tasks.TaskFour;

import java.util.ArrayList;
import java.util.Scanner;

public class FourBlockMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи");

        int task = in.nextInt();

        switch (task) {
            case 41: {
                System.out.println("Введите количество слов и размер строки:");
                int n = in.nextInt();
                int k = in.nextInt();
                ArrayList<String> strArr = new ArrayList<String>(n);
                System.out.println("Введите текст:");
                for (int i = 0; i < n; i++)
                {
                    strArr.add(in.next());
                }

                in.close();

                System.out.println(TaskFour.essay(k, strArr));
                break;
            }
            case 42: {
                System.out.println("Введите строку:");
                String str = in.next();

                in.close();

                System.out.println(TaskFour.split(str));
                break;
            }
            case 43: {
                System.out.println("Введите строку:");
                String str = in.next();

                in.close();

                if (str.indexOf('_') != -1)
                {
                    System.out.println(TaskFour.toCamelCase(str));
                }
                else
                {
                    System.out.println(TaskFour.toSnakeCase(str));
                }
                break;
            }
            case 44: {
                System.out.println("Введите 4 значения:");
                double start = in.nextDouble();
                double finish = in.nextDouble();
                double rate = in.nextDouble();
                double mult = in.nextDouble();

                in.close();

                System.out.println(TaskFour.overTime(start, finish, rate, mult));
            }
            default:
                System.out.println("Неправильный формат ввода");
        }
    }
}
