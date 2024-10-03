import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Card class to represent a card in the deck
class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Deck class to manage the deck of cards
class Deck {
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

// Main class to demonstrate SHUFFLE and DRAW operations
public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        String input;

        System.out.println("Welcome to the Deck of Cards program.");
        System.out.println("You can type the following commands:");
        System.out.println("SHUFFLE - To shuffle the deck");
        System.out.println("DRAW - To draw a card from the deck");
        System.out.println("PRINT - To print the remaining cards in the deck");
        System.out.println("EXIT - To exit the program");
        
        while (true) {
            System.out.print("Enter your command: ");
            input = scanner.nextLine().trim().toUpperCase(); // Get user input and convert to uppercase

            switch (input) {
                case "SHUFFLE":
                    deck.shuffleDeck();
                    break;
                
                case "DRAW":
                    Card drawnCard = deck.drawCard();
                    if (drawnCard != null) {
                        System.out.printf("You drew: %s%n", drawnCard);
                    }
                    break;
                
                case "PRINT":
                    deck.printDeck();
                    break;

                case "EXIT":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid command. Please try again.");
            }

            // If the deck is empty, notify and exit
            if (deck.isEmpty()) {
                System.out.println("The deck is empty. No more cards to draw.");
                break;
            }
        }

        scanner.close();
    }
}
