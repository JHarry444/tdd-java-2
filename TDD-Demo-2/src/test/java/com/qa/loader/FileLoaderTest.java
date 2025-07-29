package com.qa.loader;

import com.qa.FileLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileLoaderTest {


    @Test
    void testLoadFileUsingInbuiltFileType() throws IOException {

        // arrange
        String fileToLoad ="c:/tmp/KeyBoardHandler.java.txt";
        FileLoader cut = new FileLoader();
        int expectedSize = 10;

        List<String> pretendFileContent = List.of("Hello", "world");
        MockedStatic<Files> ff = Mockito.mockStatic(Files.class);
        ff
                .when(() -> Files.readAllLines(Paths.get(fileToLoad), StandardCharsets.UTF_8))
                .thenReturn(pretendFileContent);

        // act
        int actualSize = cut.loadFile(fileToLoad);

        // assert
        Assertions.assertEquals(expectedSize, actualSize);
    }

}
