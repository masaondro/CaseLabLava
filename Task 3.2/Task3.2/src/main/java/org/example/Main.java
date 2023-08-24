package org.example;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String palindrome = "А роза упала на лапу Азора";
        String Notpalindrome = "Не паоиндром";
        Palindrome testPalindrome = new Palindrome();

        System.out.println(testPalindrome.isPalindromeUsingStringBuffer(palindrome) + " " + testPalindrome.isPalindromeUsingStringBuffer(Notpalindrome));
        System.out.println(testPalindrome.isPalindromeSymbols(palindrome) + " " + testPalindrome.isPalindromeSymbols(Notpalindrome));
        System.out.println(testPalindrome.isPalindromeUsingIntStream(palindrome) + " " + testPalindrome.isPalindromeUsingIntStream(Notpalindrome));
        System.out.println(testPalindrome.isPalindromeRecursive(palindrome) + " " + testPalindrome.isPalindromeRecursive(Notpalindrome));
    }
}
 class Palindrome
{
    public boolean isPalindromeUsingStringBuffer(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public boolean isPalindromeSymbols(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public boolean isPalindromeUsingIntStream(String str) {
        String temp  = str.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    public boolean isPalindromeRecursive(String str){
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean,0,clean.length()-1);
    }

    private boolean recursivePalindrome(String str, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((str.charAt(forward)) != (str.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(str, forward + 1, backward - 1);
        }
        return true;
    }
}