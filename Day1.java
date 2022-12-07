//Advent of Code 2019 Day 1

import java.util.ArrayList;

public class Day1 {
  public static void main(String[] args) {
    int[] mass = {126360, 61158, 149929, 88406, 87526,
    51688,
    75356,
    116265,
    134986,
    111581,
    135675,
    69679,
    74035,
    144951,
    86157,
    68946,
    76761,
    114768,
    70694,
    84768,
    147379,
    78755,
    109688,
    118595,
    54608,
    77033,
    54654,
    61473,
    69644,
    81744,
    97148,
    106473,
    61541,
    98898,
    70394,
    117635,
    128388,
    140622,
    108691,
    126962,
    137756,
    125904,
    75675,
    127051,
    126388,
    85591,
    51583,
    101392,
    62959,
    135077,
    90916,
    127119,
    112427,
    79703,
    54739,
    50092,
    92505,
    53719,
    60887,
    62642,
    76382,
    85763,
    125799,
    67285,
    147992,
    80713,
    133619,
    131433,
    141765,
    109553,
    122534,
    88734,
    115622,
    82195,
    130771,
    121649,
    89355,
    121364,
    71664,
    130412,
    88936,
    63234,
    80274,
    108251,
    136663,
    139149,
    85052,
    67973,
    116461,
    75070,
    144261,
    106539,
    79712,
    116112,
    55755,
    121428,
    79362,
    103489,
    103157,
    64403};
    //System.out.println(mass);
    int z = 0;
    for (int i : mass) {
        int x = 0;
        //System.out.println((i/3)-2);
        x = x + (i/3)-2;
        //System.out.println(x);
        for (int y=x; y>=0; y=y/3-2) {
            z = z + y;
            //System.out.println(z);
        }
    }
    System.out.println(z);
  }
}
