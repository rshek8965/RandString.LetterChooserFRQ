package com.company;

import com.sun.deploy.util.SyncFileAccess;

public class Runner {

    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser aChooser = new RandomStringChooser(wordArray);
        System.out.println("Result of part a");
        for (int k = 0; k < 6; k++) {
            System.out.println(aChooser.getNext() + " ");
        }

        System.out.println("\nResult of part b");
        RandomletterChooser letterChoser = new RandomletterChooser("cat");
        for (int a = 0; a < 4; a++) {
            System.out.println(letterChoser.getNext());
        }
    }
}