package com.metanit;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        String str = "Jane hurried to the bargain sale intending to buy some cheap and nice garments: shirts, skirts, and breeches. ";
        Pattern pattern = Pattern.compile("[!.,;:?-]");
        Matcher matcher = pattern.matcher(str);
        int mark = 0;
        while (matcher.find()){
            mark++;
        }
        System.out.println(mark);
    }
    }

