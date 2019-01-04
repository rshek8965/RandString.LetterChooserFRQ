package com.company;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> words;

    public RandomStringChooser(String[] arr) {
        words = new ArrayList<String>();
        for (String a : arr) {
            words.add(a);
        }
    }

    public String getNext() {
        if (words.size() > 0)
            return words.remove((int)Math.random()*words.size());
        else
            return "NONE";
    }
}