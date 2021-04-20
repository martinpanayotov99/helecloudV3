package com.example.helecloud2.controller;


public class Palindrome {

    private String sentence;

    public Palindrome(String sentence) {
        this.sentence = sentence;
    }

    public boolean isPalindrome() {
        int frontIndex = 0;
        int backIndex = sentence.length() - 1;

        while (frontIndex < backIndex) {

            char frontChar = Character.toLowerCase(sentence.charAt(frontIndex));
            while (frontChar < 'a' || frontChar > 'z') {
                frontIndex++;
                frontChar = Character.toLowerCase(sentence.charAt(frontIndex));
            }


            char backChar = Character.toLowerCase(sentence.charAt(backIndex));
            while (backChar < 'a' || backChar > 'z') {
                backIndex--;
                backChar = Character.toLowerCase(sentence.charAt(backIndex));
            }


            if (frontChar != backChar)
                return false;
            frontIndex++;
            backIndex--;
        }
        return true;
    }
}
