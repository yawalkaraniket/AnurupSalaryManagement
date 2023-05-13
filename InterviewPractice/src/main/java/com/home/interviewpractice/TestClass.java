package com.home.interviewpractice;

import static com.home.interviewpractice.InterviewProgramsKt.checkPalindrome;
import static com.home.interviewpractice.InterviewProgramsKt.printAllPermutationOfString;
import static com.home.interviewpractice.InterviewProgramsKt.removeCharactersFromString;
import static com.home.interviewpractice.InterviewProgramsKt.removeCharactersFromStringFromPredefined;
import static com.home.interviewpractice.InterviewProgramsKt.removeStringFromString;
import static com.home.interviewpractice.InterviewProgramsKt.reverseWithDefinedMethod;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] arg) {

        // https://javarevisited.blogspot.com/2011/06/top-programming-interview-questions.html#axzz81IzD0dcr

        // Reverse with pre-defied method.
        // System.out.println(reverseWithDefinedMethod("123"));

        /*
        - Palindrome number algorithm
            Get the number from user.
            Hold the number in temporary variable.
            Reverse the number.
            Compare the temporary number with reversed number.
            If both numbers are same, print palindrome number.
            Else print not palindrome number.
        */
        //System.out.println(checkPalindrome("121"));

        /*
            Program to remove the given character from string.
        */
        // System.out.println(removeCharactersFromString("qwerttyu", "q"));
        // System.out.println(removeCharactersFromStringFromPredefined("qwerttyu", "y"));

         /*
            Program to remove the given character from string.
         */
         //System.out.println(removeStringFromString("qwerttyuaniket aniket", "aniket"));

        /*
            Program to remove the given character from string.
        */
        // System.out.println(removeStringFromString("qwerttyuaniket aniket", "aniket"));

        /*
            * Print all permutation of String both iterative and Recursive way
        */
         printAllPermutationOfString("abc");

    }
}
