package com.example.android.ennis.barrett;

import java.util.Random;

public class Joker {
    private static final CharSequence[] jokes = {
            "Did you try using the duck?",
            "Compiling",
            "If its not broken we better get ready to update it",
            "Best way to sort,\nwhile not isInOrder(desk)\n{shuffle(deck)}",
            "Watch out for velociraptor\n after goto statements",
            "There are many right solutions...\nMost of them are garbage",
            "There is no cloud.\nJust someone else's computer",
            "This phone has a virus!",
            "Programming is the simplest thing in the world...\nif you know what you're doing",
            "while(hasCoffee==true)\n{programming=true}"
    };
    private static final int Range = jokes.length - 1;
    private static final Random random = new Random();

    public CharSequence getJoke(){
        return jokes[random.nextInt(Range)];
    }
}
