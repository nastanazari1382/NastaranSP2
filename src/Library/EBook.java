package Library;
//jeg havde det lidt svært med denne del så jeg har spurgte chat meget lidt for at forstår pointen med noget af deet.
//Og jeg har ikke lavet den Udvidet klassediagram da jeg kun fik lavet denne klasse udefra at jeg havde lidt ekstra tid

// E-bog: beregner point ud fra karakterer, udbredelse og anvendelse
public class EBook extends Title {
    private int characters;
    private boolean illustrated;
    private int availability;
    private int reach;
    private int use;

    public EBook(String title, String literatureType, int characters, int availability, int reach, int use, boolean illustrated) {
        super(title, literatureType);
        this.characters = characters;
        this.illustrated = illustrated;
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    //jeg beregner antal sider og ligger 10% hvis den er illustreret.
    public double calculatePoints() {
        double pages = (characters / 1800.0) + 20;
        if (illustrated) {
            pages *= 1.10;
        }

        //Jeg beregnere min faktor her hvor jeg bruger reach, availability og use.
        double factor = (reach * 5) + (availability * 0.5) + use;
        return pages * convertLiteratureType() * factor;
    }
}