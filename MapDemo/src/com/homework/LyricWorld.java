package com.homework;

import java.util.*;

public class LyricWorld {
    private static final String[] lyric = { "you", "say", "it", "best", "when", "you", "say", "nothing", "at", "all" };

    public static void main(String[] args) {
        // Create a list that's implemented by ArrayList 
        List<String> words = new ArrayList<>();
        // Add all String in string array to List
        for (String w : lyric)
            words.add(w);

        // Traverse the list
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");
        System.out.println("Contains [you]?: " + words.contains("you"));
        System.out.println("Contains [me]?: " + words.contains("me"));
        System.out.println("Where's [say]?: " + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " + words.lastIndexOf("say"));

        // Sort words in order A - Z
        Collections.sort(words);

        // show all after sorted
        for (Object o : words) {
            System.out.print(o + " ");
        }
    }
}
