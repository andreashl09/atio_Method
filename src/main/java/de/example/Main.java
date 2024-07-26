package de.example;

public class Main {
    public static void main(String[] args) {
        String s = "    -6234445cde79";

        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s.isEmpty()) return 0;

        int output = 0;
        int signum = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) return output * signum;
            signum = (c == 45) ? -1 : signum;
            if (Character.isDigit(c)) {
                int digit = c - '0';
                output = output * 10 + digit;
            }
        }
        return output * signum;
    }
}