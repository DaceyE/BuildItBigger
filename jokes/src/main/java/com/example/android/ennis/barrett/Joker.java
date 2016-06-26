package com.example.android.ennis.barrett;

import java.util.Random;

public class Joker {
    private static final CharSequence[] jokes = {
            "Did you try using the duck?",
            "Compiling",
            "If its not broken we better get ready to update it",
            "This is the best way to sort:\n\twhile not isInOrder(deck)\n\t{shuffle(deck)}",
            "Watch out for velociraptors\n after goto statements",
            "There are many right solutions in programming.\nMost of them are bad practices",
            "There is no cloud...\nIts just someone else's computer )':",
            "This phone has a virus!",
            "Programming is simple...\nas long as you know what you're doing",
            "while(hasCoffee==true) {\n\tprogramming=true;\n}"
    };
    private static final int Range = jokes.length - 1;
    private static final Random random = new Random();

    public CharSequence getJoke(){
        return jokes[random.nextInt(Range)];
    }
}
