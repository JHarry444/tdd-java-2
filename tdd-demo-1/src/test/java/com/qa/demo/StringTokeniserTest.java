package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.qa.Tokeniser;

import java.util.StringTokenizer;

class StringTokeniserTest {


    @Test
    void emptyResultEmptyArray() {
        // arrange
        String input = "";
//        Component Under Test
        Tokeniser cut = new Tokeniser();
        String[] expectedResult = {};
        // act
        String[] actualResult = cut.tokenise(input);
        // assert

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void stringOfOneResultArrayOfOne() {
        // arrange
        String input = "Java";
        Tokeniser cut = new Tokeniser();
        String[] expectedResult = {"Java"};
        // act
        String[] actualResult = cut.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void stringTwoItemsArrayTwoStrings() {
        // arrange
        String input = "csharp,python";
        Tokeniser cut = new Tokeniser();
        String[] expectedResult = {"csharp", "python"};
        // act
        String[] actualResult = cut.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void manyItemsNoSpacesArrayManyStrings() {
        // arrange
        String input = "java,C#,python";
        Tokeniser cut = new Tokeniser();
        String[] expectedResult = {"java", "C#", "python"};

        // act
        String[] actualResult = cut.tokenise(input);

        // act
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void stringOfONeResultArrayOfOneSpacesRemoved() {
        // arrange
        String input = " csharp ";
        Tokeniser cut = new Tokeniser();
        String[] expectedResult = {"csharp"};

        // act
        String[] actualResult = cut.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
