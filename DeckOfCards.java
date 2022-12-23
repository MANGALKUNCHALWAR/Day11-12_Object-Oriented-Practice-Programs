package assignment11and12.ObjectOrientedPracticePrograms;

import java.util.Random;

//4. Write a Program DeckOfCards.java, to initialize deck of cards having suit
//("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
//"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
//method and then distribute 9 Cards to 4 Players and Print the Cards received by
//the 4 Players using 2D Array...
public class DeckOfCards {
    String[] deck = new String[52];  //total 52 cards
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] playCards = new String[4][9];   //4 player, 9 cards each

    Random random = new Random();

//getting card according to their rank and suits

    public void getCards() {

        int deckIndex = 0;  //initialize with 0
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                //aligning ranks and suits together
                deck[deckIndex] = rank[j] + " " + suit[i];
                deckIndex++; // incrementing deck index
            }
        }
    }

    // suffling of cards
    public String[] suffleCards() {
        int j = 0;

        for (int i = 0; i < deck.length; i++) {
            j = random.nextInt(52);
            //swapping existing data with random data
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }

    //displaying cards
    public void displayCards(String[] deck) {
        int deckIndex = 0;

        for (int i = 0; i < playCards.length; i++) {          //for suit
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < playCards[i].length; j++) {    //for rank
                playCards[i][j] = deck[deckIndex];
                System.out.println(playCards[i][j]);
                deckIndex++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DeckOfCards player = new DeckOfCards();
        player.getCards();
        String[] deck = player.suffleCards();
        player.displayCards(deck);
    }

}
