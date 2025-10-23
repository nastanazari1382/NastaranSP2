import Library.*;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //Jeg opratter en forfatter.
        Author author1 = new Author("Ana Huang");
        Author author2 = new Author("H.C Andersen");
        Author author3 = new Author("test"); // Test E-Book

        author1.addTitle(new AudioBook("Twisted Love", "SKØN", 230, 641));
        author1.addTitle(new AudioBook("Twisted Games", "SKØN", 230, 794));
        author1.addTitle(new AudioBook("Twisted Hate", "SKØN", 230, 900));
        author1.addTitle(new AudioBook("Twisted Lies", "SKØN", 230, 983));
        author1.addTitle(new PrintedBook("The Striker", "SKØN", 200, 592));
        author1.addTitle(new PrintedBook("The Defender", "SKØN", 200, 464));

        author2.addTitle(new PrintedBook("Den grimme ælling", "BI", 100, 140));
        author2.addTitle(new AudioBook("Den lille havfrue", "BI", 50, 240));

        //3. forfatter (test for min EBook
        author3.addTitle(new EBook("test", "FAG", 800000, 97, 50, 190, false));
        author3.addTitle(new EBook("test2", "BI", 360000, 97, 25, 80, true));


        //Jeg beregner det samlet Royalty og udskriver det.
        double royalty = author1.calculateRoyalties();
        System.out.println("Forfatteren " + author1.getName() + " modtager: " + royalty + "kr, i bibliotekspenge for at have sine bøger (titler)  stående på de danske biblioteker om året.");
        royalty = author2.calculateRoyalties();
        System.out.println("Forfatteren " + author2.getName() + " modtager: " + royalty + "kr, i bibliotekspenge for at have sine bøger (titler) stående på de danske biblioteker om året.");
        royalty = author3.calculateRoyalties();
        System.out.println("Forfatteren " + author3.getName() + " modtager: " + royalty + "kr, i bibliotekspenge for at have sine bøger (titler) stående på de danske biblioteker om året.");
        }
        }
