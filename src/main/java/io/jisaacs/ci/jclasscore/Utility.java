package io.jisaacs.ci.jclasscore;

import org.bukkit.event.Listener;

import java.util.Random;

// This class is used primary for utility methods that are called throughout the code.

class Utility implements Listener {

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}
