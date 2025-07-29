package com.qa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    private static class IntWrapper {
        public int value;
    }


    public int loadFile(String filename) throws IOException {
        List<String> lines  = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);

        IntWrapper result = new IntWrapper();

        lines.forEach(line -> {
            result.value += line.length();
        });

        return result.value;
    }
}
