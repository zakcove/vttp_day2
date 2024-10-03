package src.deck;

import java.util.Scanner;

public class Main {
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
