package com.s2s.palindrome;

 public class Palindrome
 {
         public boolean isPalindrome(String inputString)
 {
        boolean result = false;

         if (inputString.length() == 0)
         {
         result = true;
         }
         else
         {
         char firstChar = inputString.charAt(0);
 char lastChar = inputString.charAt(inputString.length() - 1);
 String mid = inputString.substring(1, inputString.length() - 1);
 
