package Library;

//Superklasse
public abstract class Title {
    protected String title;
    protected String literatureType;
    protected static final double RATE = 0.067574;

    //Her initialiserer jeg titeler og litteraturtyperne.
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    //jeg beregner jeg royalty ved at gange point med rate
    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    //Jeg implementere abstrakt metoden i subklasser
    public abstract double calculatePoints();

    //Min litteraturtype til deres talværdi.
    //toUpperCase så selv hvis man skriver med småt bliver den ændret og det giver den samme værdi
    public double convertLiteratureType() {
        switch (literatureType.toUpperCase()) {
            case "BI":
                return 3.0;
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 1.0;
        }
    }
}