package Library;

//Subklasse
//Klasse over printet bog
public class PrintedBook extends Title {
    private int pages;
    private int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    //Her beregner jeg point for printet bog
    public double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}