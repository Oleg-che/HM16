package com.cherednik;

import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(JsonParser.parseReader(new FileReader("fill.txt")));

    }
}
