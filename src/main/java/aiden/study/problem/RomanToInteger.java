package aiden.study.problem;

/**
 * Leetcode 13
 * Given a roman numeral, convert it to an integer.
 * 1 <= result <= 3900
 * ('I', 'V', 'X', 'L', 'C', 'D', 'M')
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int ind = 0, len = s.length(), res = 0;

        while (ind < len) {
            char c = s.charAt(ind);
            if ('M' == c) {
                res += 1000;
                ind++;
            } else if ('D' == c) {
                res += 500;
                ind++;
            } else if ('C' == c) {
                if (ind + 1 < len) {
                    char nextC = s.charAt(ind + 1);
                    if ('M' == nextC) {
                        res += 900;
                        ind += 2;
                    } else if ('D' == nextC) {
                        res += 400;
                        ind += 2;
                    } else {
                        res += 100;
                        ind++;
                    }
                } else {
                    res += 100;
                    ind++;
                }
            } else if ('L' == c) {
                res += 50;
                ind++;
            } else if ('X' == c) {
                if (ind + 1 < len) {
                    char nextC = s.charAt(ind + 1);
                    if ('C' == nextC) {
                        res += 90;
                        ind += 2;
                    } else if ('L' == nextC) {
                        res += 40;
                        ind += 2;
                    } else {
                        res += 10;
                        ind++;
                    }
                } else {
                    res += 10;
                    ind++;
                }
            } else if ('V' == c) {
                res += 5;
                ind++;
            } else if ('I' == c) {
                if (ind + 1 < len) {
                    char nextC = s.charAt(ind + 1);
                    if ('X' == nextC) {
                        res += 9;
                        ind += 2;
                    } else if ('V' == nextC) {
                        res += 4;
                        ind += 2;
                    } else {
                        res += 1;
                        ind++;
                    }
                } else {
                    res += 1;
                    ind++;
                }
            } else {
                throw new IllegalStateException("Input character is invalid.");
            }
        }

        return res;
    }

    public static void main(String[] args) {
        RomanToInteger rI = new RomanToInteger();
        System.out.println(rI.romanToInt("III"));
        System.out.println(rI.romanToInt("LVIII"));
        System.out.println(rI.romanToInt("MCMXCIV"));
    }
}