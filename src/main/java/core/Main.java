package core;

import tasks.TaskOne;
import tasks.TaskTwo;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.1: " + TaskOne.remainder(3,4));
        System.out.println("1.2: " + TaskOne.triArea(7,4));
        System.out.println("1.3: " + TaskOne.animals(2,3,5));
        System.out.println("1.4: " + TaskOne.profitableGamble(0.2, 50, 9));
        System.out.println("1.5: " + TaskOne.operation(2,2,4));
        System.out.println("1.6: " + TaskOne.itoa('['));
        System.out.println("1.7: " + TaskOne.addUpTo(10));
        System.out.println("1.8: " + TaskOne.nextEdge(9,2));
        int[] nums = {3,4,5};
        System.out.println("1.9: " + TaskOne.sumOfCubes(nums));
        System.out.println("1.10: " + TaskOne.abcmath(42,5,10));
        System.out.println("1.10: " + TaskOne.abcmath(5,2,1));
        System.out.println("1.10: " + TaskOne.abcmath(3,2,4));
        System.out.println("2.1: " + TaskTwo.repeat("test",3));
        int[] mas = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println("2.2: " + TaskTwo.differenceMaxMin(mas));
        int[] mas1 = {1,5,6};
        System.out.println("2.3: " + TaskTwo.isAvgWhole(mas1));
    }
}
