package be.intecbrussel.Maps.FilmCollection;

public class MyCollection {
    public static void main(String[] args) {

        DvDCollection films = new DvDCollection();

        films.addDVD("Johhny English",2003,10.2);
        films.addDVD("Mr. Bean's Holiday",2007,8.9);
        films.addDVD("The Lion King", 1994, 20.8);

        System.out.println(films);

        DVD hugegrant = new DVD("Four Weddings and a Funeral", 1994,12.33);

        films.addDVD(hugegrant);

        System.out.println(films);




    }
}
