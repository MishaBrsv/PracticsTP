package labs.lab1;

import java.util.Random;

public class Lab1 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        SecondThread secondThread = new SecondThread();
        FirstThread firstThread = new FirstThread();

        secondThread.start();
        firstThread.start();

        while (true)
        {
            int n = rand.nextInt(100);
            System.out.println("1: " + n);
            if (n % 2 == 0)
            {
                firstThread.printSquare(n);
            }
            else
            {
                secondThread.printCube(n);
            }
            System.out.println("----------");

            Thread.sleep(1000);
        }
    }
}
