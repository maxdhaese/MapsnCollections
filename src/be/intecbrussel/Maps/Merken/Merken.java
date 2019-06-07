package be.intecbrussel.Maps.Merken;

import java.util.*;

public class Merken {

    private List<String> merken = new ArrayList<String>(Arrays.asList(Data.merken));


    public Merken() {
    }

    public void sorteer(){
        Collections.sort(merken);

    }

    public void keerOm(){
        Collections.reverse(merken);
    }


    @Override
    public String toString() {
        return "Merken{" +
                "merken=" + merken +
                '}';
    }
}
