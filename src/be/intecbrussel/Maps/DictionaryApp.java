package be.intecbrussel.Maps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryApp {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary(new HashMap<>());
        dictionary.addWords("boek","verzameling woorden");
        dictionary.addWords("stylo","schrijfgerief");

        System.out.println(dictionary.dictionarySize());


    }
}
