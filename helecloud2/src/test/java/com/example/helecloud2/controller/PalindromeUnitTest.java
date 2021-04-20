package com.example.helecloud2.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeUnitTest {

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome("A Santa Lived As a Devil At NASA");
        assertTrue(palindrome.isPalindrome());
    }

    @Test
    void isNotPalindrome() {
        Palindrome palindrome = new Palindrome("was it a car orr a cat I saw");
        assertFalse(palindrome.isPalindrome());
    }
}