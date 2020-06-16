package exercises;

import java.util.ArrayList;
import java.util.List;

public class BabyShark {

    static String doodoo = ", doo doo doo doo doo doo";

    public static void main(String[] args) {
        List<String> verses = new ArrayList<>();
        verses.add("Baby shark");
        verses.add("Mommy shark");
        verses.add("Daddy shark");
        verses.add("Grandma shark");
        verses.add("Grandpa shark");
        verses.add("Let's go hunt");
        verses.add("Run away");
        verses.add("Safe at last");
        verses.add("It's the end");

        for (String verse : verses) {
            System.out.println(verse + doodoo);
            System.out.println(verse + doodoo);
            System.out.println(verse + doodoo);
            System.out.println(verse + "!\n");
        }
    }

}
