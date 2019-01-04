package com.company;

public class RandomletterChooser extends RandomStringChooser {

    public RandomletterChooser(String str) {
        super (getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        String[] arr = new String[str.length()];
        for (int k = 0; k < str.length(); k++) {
            arr[k] = str.substring(k, k+1);
        }
        return arr;
    }
}