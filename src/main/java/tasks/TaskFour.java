package tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskFour {

    public static String essay(int k, ArrayList<String> strArr)
    {
        String res = "";
        int count = k;
        Iterator<String> it = strArr.iterator();

        String val = it.next();
        res += val + " ";
        count -= val.length();
        while (it.hasNext())
        {
            val = it.next();
            if (count < val.length())
            {
                res += '\n';
                count = k;
            }
            res += val + " ";
            count -= val.length();
        }

        return res;
    }

    public static String split(String str)
    {
        String res = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            res += ch;

            if (ch == '(')
            {
                count++;
            }
            else
            {
                count--;
            }

            if (count == 0)
            {
                res += ' ';
            }
        }

        return res;
    }

    public static String toCamelCase(String str)
    {
        String res = "";
        boolean newWord = false;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '_')
            {
                newWord = true;
            }
            else if (newWord)
            {
                newWord = false;
                res += (char)(ch-32);
            }
            else
            {
                res += ch;
            }
        }

        return res;
    }

    public static String toSnakeCase(String str)
    {
        String res = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                res += '_';
                res += (char)(ch+32);
            }
            else
            {
                res += ch;
            }
        }

        return res;
    }

    public static String overTime(double start, double finish, double rate, double mult)
    {
        double reg = 0;
        double over = 0;

        if (start < 9 && finish < 9)
        {
            over = finish - start;
        }
        else if (start < 9 && finish >= 9 && finish <= 17)
        {
            over = 9 - start;
            reg = finish - 9;
        }
        else if (start < 9 && finish > 17)
        {
            over = 9 - start + finish - 9;
            reg = 9 + 17;
        }
        else if (start >= 9 && start <= 17 && finish >= 9 && finish <= 17)
        {
            reg = finish - start;
        }
        else if (start >= 9 && start <= 17 && finish > 17)
        {
            reg = 17 - start;
            over = finish - 17;
        }
        else
        {
            over = finish - start;
        }

        return "$" + String.format("%.2f", reg*rate + over*rate*mult);
    }
}
