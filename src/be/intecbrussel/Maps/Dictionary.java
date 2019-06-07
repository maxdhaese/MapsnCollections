package be.intecbrussel.Maps;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String,String> dictionary = new HashMap<>();

    public Dictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void addWords(String word, String value){
        dictionary.put(word,value);
    }

    public int dictionarySize(){
        return dictionary.size();
    }





    @Override
    public String toString() {
        return "Woordenboek{" +
                "dictionary=" + dictionary +
                '}';
    }
}


