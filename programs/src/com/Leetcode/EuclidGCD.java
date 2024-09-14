package com.Leetcode;
import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(findGCDrecurs(a,b));

    }
    static int findGCDrecurs(int a, int b) {
        if( b == 0) {
            return a;
        }
        int remainder = a%b;
        System.out.println(remainder);

        return findGCDrecurs(b, remainder);
       // return ;
    }
}
// lemma gcd(a,b) = gcd(b, ramainder) = gcd(remainder, b)
