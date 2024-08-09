package maths;

import java.util.Scanner;

public class Solution {
    public void checkKeyword(String word) {
        boolean isKeyword = false;
        String[] keywords = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};

        for (String keyword : keywords) {
            if (word.equals(keyword)) {
                isKeyword = true;
                break;
            }
        }

        if (isKeyword) {
            System.out.println("\n\t " + word + " is a keyword");
        } else {
            System.out.println("\n\t " + word + " is not a keyword");
        }
    }
}
