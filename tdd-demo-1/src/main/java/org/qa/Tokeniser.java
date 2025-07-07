package org.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tokeniser {

    public String[] tokenise(String input) {
        StringTokenizer st = new StringTokenizer(input, ",");
        List<String> list = new ArrayList<>();

        while (st.hasMoreTokens()) list.add(st.nextToken().trim());

        return list.toArray(new String[list.size()]);
    }
}
