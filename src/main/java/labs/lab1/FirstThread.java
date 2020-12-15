package labs.lab1;

public class FirstThread extends Thread {
    public void printSquare(int n)
    {
        System.out.println("2: " + (int) Math.pow(n, 2));
    }
}
