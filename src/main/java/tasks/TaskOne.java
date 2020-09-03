package tasks;

public class TaskOne {

    public static Integer remainder(int a, int b) {
        return a%b;
    }

    public static Double triArea(int a, int b) {
        return 0.5*a*b;
    }

    public static Integer animals(int chickens, int cows, int pigs) {
        return chickens*2 + cows*4 + pigs*4;
    }

    public static Boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

    public static String operation(int a, int b, int n) {
        String result = "none";
        if(a + b == n) {
            result = "Сложить. ";
        }
        if(a - b == n || b - a == n) {
            if (result.equals("none")) result = "";
            result += "Вычитать. ";
        }
        if(a * b == n) {
            if (result.equals("none")) result = "";
            result += "Умножить. ";
        }
        if(a/b == n || b/a == n) {
            if (result.equals("none")) result = "";
            result += "Поделить. ";
        }
        return result;
    }

    public static Integer itoa(char symbol) {
        return (int) symbol;
    }

    public static String addUpTo(int a) {
        StringBuilder result = new StringBuilder();
        int k = 0;
        for(int i = 1; i <= a; i++) {
            result.append(i).append("+");
            k += i;
        }
        result.deleteCharAt(result.length()-1);
        result.append("=").append(k);
        return result.toString();
    }

    //public static Integer nextEdge(int a, int b) {
        
    //}
}
