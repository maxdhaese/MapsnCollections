package be.intecbrussel.Maps.FilmCollection;

public class DVD {

    private String title;
    private int year;
    private double score;

    public DVD(String title, int year, double score) {
        this.title = title;
        this.year = year;
        this.score = score;
    }


    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", score=" + score +
                '}';
    }
}
