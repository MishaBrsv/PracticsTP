package core.blockSix;

import java.util.*;

public class PR6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = in.nextInt();

        in.close();

        System.out.println(ulam(n));
    }

    public static int ulam(int n)
    {
        List<Integer> mas = new ArrayList<>(n);
        Queue<Integer> sumArr = new PriorityQueue<>();
        Set<Integer> ban = new HashSet<>();
        mas.add(1);
        mas.add(2);
        sumArr.add(mas.get(0) + mas.get(1));

        while (mas.size() < n)
        {
            int sum = sumArr.poll();
            for (int val : mas)
            {
                val += sum;
                if (!ban.contains(val))
                {
                    if (!sumArr.contains(val))
                    {
                        sumArr.add(val);
                    }
                    else
                    {
                        sumArr.remove(val);
                        ban.add(val);
                    }
                }
            }
            mas.add(sum);
        }

        return mas.get(n-1);
    }
}
