package io.github.alyonachern.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Futurama");
        set.add("Rick and Morty");
        set.add("Disenchantment");
        set.add("Arcane");
        System.out.println("The length of set is " + set.size());

        for (String setElement : set
             ) {
            if (setElement.equals("Rick and Morty")) {
                System.out.println("I do not want to watch " + setElement);
            } else {
                System.out.println("I love " + setElement);
            }
        }

        set.remove("Rick and Morty");
        System.out.println("Now the length is " + set.size());
        }
}
