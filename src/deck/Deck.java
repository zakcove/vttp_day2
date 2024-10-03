package src.deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Deck {
    
    private List<Card> cards;

    // Initialize a deck of cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create 52 cards
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the deck 
    public void shuffleDeck() {
        System.out.printf("Shuffling the deck...%n");
        Collections.shuffle(cards);
    }

    // Draw a random card from the deck and remove it 
    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.printf("The deck is empty. No more cards to draw.%n");
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(cards.size()); // Get a random index from the deck
        return cards.remove(index); // Remove and return the card at that index
    }

    // Check if the deck is empty
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // Print the current state of the deck
    public void printDeck() {
        if (cards.isEmpty()) {
            System.out.printf("The deck is empty.%n");
        } else {
            System.out.printf("Remaining cards in the deck:%n");
            for (Card card : cards) {
                System.out.printf("%s%n", card);
            }
        }
    }
}



