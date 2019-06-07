package be.intecbrussel.Maps.FilmCollection;

import java.util.ArrayList;
import java.util.List;

public class DvDCollection {

   private List<DVD> films = new ArrayList<>();

    public DvDCollection() {
    }

    public void addDVD(DVD dvd){
        films.add(dvd);

    }

    public void addDVD(String title, int year, double score){
        films.add(new DVD(title,year,score));
    }

    @Override
    public String toString() {
        return "DvDCollection{" +
                "films=" + films +
                '}';
    }
}
