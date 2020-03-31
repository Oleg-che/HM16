package com.cherednik;

import java.util.HashSet;

public class MorseCode {

    private static final String[] MORSE_ABC = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {
        String[] arr = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(arr));
    }

    private static int uniqueMorseRepresentations(String[] words) throws Exception {
        if (words == null) {
            throw new Exception("Cannot by null");
        }
        HashSet<Object> differ = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            char[] wordChar = word.toCharArray();
            for (char c : wordChar) {
                int index = alphabet.indexOf(c);
                str.append(MORSE_ABC[index]);
            }
            differ.add(str.toString());
            str.delete(0, str.length());
        }
        return differ.size();
    }
}
