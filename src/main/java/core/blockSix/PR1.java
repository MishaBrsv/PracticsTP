package core.blockSix;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        in.close();

        System.out.println(bell(n));
    }

    public static BigInteger bell(int val)
    {
        List<BigInteger> listBell = new ArrayList<>();
        listBell.add(BigInteger.ONE);
        for (int n = 0; n < val; n++)
        {
            BigInteger sum = BigInteger.ZERO;
            for (int k = 0; k <= n; k++)
            {
                BigInteger coef = fact(n).divide(fact(k).multiply(fact(n-k)));
                sum = sum.add(coef.multiply(listBell.get(k)));
            }
            listBell.add(sum);
        }

        return listBell.get(listBell.size()-1);
    }

    public static BigInteger fact(int n)
    {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
        {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
}
