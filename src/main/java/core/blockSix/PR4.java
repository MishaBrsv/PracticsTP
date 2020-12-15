package core.blockSix;

import java.util.*;

public class PR4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите url:");
        String str = in.nextLine();

        in.close();

        String[] strs = str.split(" ", 2);
        if (strs.length == 1)
        {
            System.out.println(stripUrlParams(str));
        }
        else
        {
            System.out.println(stripUrlParams(strs[0], strs[1].split(" ")));
        }
    }

    public static String stripUrlParams(String str)
    {
        return stripUrlParams(str, new String[] {""});
    }

    public static String stripUrlParams(String str, String[] block)
    {
        Set<String> blockKeys = new HashSet<>(block.length);
        blockKeys.addAll(Arrays.asList(block));

        String[] urlParts = str.split("\\?", 2);
        if (urlParts.length > 1)
        {
            String[] params = urlParts[1].split("&");
            Map<String, String> map = new HashMap<>();
            for (String param : params)
            {
                String[] paramParts = param.split("=", 2);
                map.put(paramParts[0], paramParts[1]);
            }

            StringBuilder res = new StringBuilder(urlParts[0] + "?");

            Set<String> keys = map.keySet();
            for (String key : keys)
            {
                if (blockKeys.contains(key)) {
                    continue;
                }
                res.append(key).append("=").append(map.get(key)).append("&");
            }

            return res.substring(0, res.length()-1);
        }
        else
        {
            return str;
        }
    }
}
