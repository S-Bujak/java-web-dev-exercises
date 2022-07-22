package org.launchcode.java.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void CountChars(String input) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] characters = input.toLowerCase().toCharArray();
        HashMap<Character, Integer> scores = new HashMap<>();
        for (char letter : characters) {
            if (Character.isLetter(letter)) {
                if (!scores.containsKey(letter)) {
                    scores.put(letter, 1);
                } else {
                    scores.put(letter, (scores.get(letter) + 1));
                }
            }


        }
        for (Map.Entry<Character, Integer> score : scores.entrySet()) {
            System.out.println(String.format("%s: %s", score.getKey(), score.getValue()));
        }
    }
}
