package tasks;

public class TaskThree {

    public static int solutions(int a, int b, int c)
    {
        double d = b*b - 4*a*c;
        if (d < 0)
        {
            return 0;
        }
        else if (d == 0)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static int findZip(String str)
    {
        return str.indexOf("zip", str.indexOf("zip")+3);
    }

    public static boolean checkPerfect(int num)
    {
        int sum = 1;
        int n = (int)Math.ceil(Math.sqrt(num));

        for (int i = 2; i < n; i++)
        {
            if (num % i == 0)
            {
                n = num / i;
                sum += i;
                sum += n;

                if (sum > num)
                {
                    return false;
                }
            }
        }

        if (sum != num)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static String flipEndChars(String str)
    {
        if (str.length() < 2)
        {
            return "Incompatible.";
        }

        char cBegin = str.charAt(0);
        char cEnd = str.charAt(str.length()-1);
        if (cBegin == cEnd)
        {
            return "Two's a pair.";
        }

        return cEnd + str.substring(1, str.length()-1) + cBegin;
    }

    public static boolean isValidHexCode(String str)
    {
        if (str.length() != 7 || str.charAt(0) != '#')
        {
            return false;
        }

        for (int i = 1; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f'))
            {
                return false;
            }
        }

        return true;
    }
}
