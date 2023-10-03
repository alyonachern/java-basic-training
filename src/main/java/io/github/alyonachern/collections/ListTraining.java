package io.github.alyonachern.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListTraining {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sims");
        arrayList.add("Atomic Heart");
        arrayList.add("Uncharted 4");
        arrayList.add("Gray matter");
        arrayList.add("Mortal Kombat");
        System.out.println(arrayList);
        System.out.println("Third element is " + arrayList.get(3));

        arrayList.remove("Uncharted 4");
        arrayList.set(3, "Resident Evil");
        arrayList.add("GTA");
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " 2");
        }
    }
}
