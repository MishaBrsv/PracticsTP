package labs.lab1;

public class SecondThread extends Thread {
    public void printCube(int n)
    {
        System.out.println("3: " + (int) Math.pow(n, 3));
    }
}
