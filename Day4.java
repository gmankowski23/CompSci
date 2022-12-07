//Advent of Code 2019 Day 4

import java.util.ArrayList;

public class Day4 {
    public static char a;
    public static char b;
    public static char c;
    public static char e;
    public static char f;
    public static char g;
    public static int total;

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 264360; i <= 746325; i++) {
            result.add(i);
        }

        for (int x : result) {
            //System.out.println(x);
            String split = String.valueOf(x);
            //System.out.println(d);
            char[] d = split.toCharArray();
            if (d[0] <= d[1] && d[1] <= d[2] && d[2] <= d[3] && d[3] <= d[4] && d[4] <= d[5]) {
                if (d[0] == d[1] || d[1] == d[2] || d[2] == d[3] || d[3] == d[4] || d[4] == d[5]) {
                    //System.out.println(d);
                    a = d[0];
                    b = d[1];
                    c = d[2];
                    e = d[3];
                    f = d[4];
                    g = d[5];
                    //total += 1;
                    //System.out.println(a+""+b+""+c+""+e+""+f+""+g);
                    if (g == f && f != e || f == e && f != g && e != c || c == e && e != f && c != b || b == c && c != e && b != a || a == b && b != c) {
                        System.out.println(d);
                        total += 1;
                    }

                }
            }
        }
        System.out.println(total);
    }
}
