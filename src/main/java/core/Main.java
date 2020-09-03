package core;

import tasks.TaskOne;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.1: " + TaskOne.remainder(3,4));
        System.out.println("1.2: " + TaskOne.triArea(7,4));
        System.out.println("1.3: " + TaskOne.animals(2,3,5));
        System.out.println("1.4: " + TaskOne.profitableGamble(0.2, 50, 9));
        System.out.println("1.5: " + TaskOne.operation(2,2,4));
        System.out.println("1.6: " + TaskOne.itoa('['));
        System.out.println("1.7: " + TaskOne.addUpTo(10));
    }
}
