package src.deck;

public class Card {

    // Members of class
    private String suit;
    private String rank; 

    // Constructors
    public Card (String suit, String rank) { 
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;

    }
    
    }


