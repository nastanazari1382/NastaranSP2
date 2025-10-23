package Library;

import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    //Jeg har initialiseret navn og har oprettet en liste af bøger som er tom.
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    //En beregning af den samlede royalty for alle bøgerne.
    public double calculateRoyalties() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        //vi gør så den kun har 2 decimaltaler
        return Math.round(total * 100.0) / 100.0;
    }

    public String getName() {
        return name;
    }
}