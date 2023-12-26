package org.c_sliding_window.a_repeated_dna_sequences;

import java.util.Set;

public class Print {

    static String printSetString(Set<String> set) {
        return String.join(",", set);
    }

    static String repeat(String s, int times) {
        String output = "";
        for (int i = 0; i < times; i++) {
            output += s;
        }
        return output;
    }

}
