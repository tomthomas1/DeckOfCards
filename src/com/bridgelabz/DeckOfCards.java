package com.bridgelabz;

public class DeckOfCards {
	//Array for players for size 9 as 9 cards for each player 
	String player1[][] = new String[1][9];
	String player2[][] = new String[1][9];
	String player3[][] = new String[1][9];
	String player4[][] = new String[1][9];
	String[] deck = new String[52];
	
	public String[] shuffleCards() {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		int count = 0;
		// Initializing the deck
		for (int i = 0; i < suits.length; i++) {              

			for (int j = 0; j < ranks.length; j++) {

				deck[count] = suits[i] + "-" + ranks[j];
				count++;
			}
		}
		// to shuffle the cards
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < deck.length; j++) {

				int temp = (int) Math.floor(Math.random() * 52);      //there are 52 cards so taking random 52 numbers
				String temp1 = deck[i];                               //assigning the deck to temp1
				deck[i] = deck[temp];                                 // assigning the deck to deck of random index deck cards
				deck[temp] = temp1;                                   //assigning deck temp back to temp1
				System.out.println(deck[i]);
			}
		}
		return deck;
	}
	
	public void displayShuffleCards() {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);                          //printing the shuffled deck
		}              
	}

	public void distribute(String[] deck) {                       //method to distribute the shuffled cards

		//method to distribute cards to  players
		int j = 0, k = 0, l = 0, m = 0;
		for (int i = 0; i < deck.length; i++) {
			if (j < 9 || k < 9 || l < 9 || m < 9) {               //each player for 9 cards
				if (i % 4 == 0) {                                 // we have taken %4 as we want to distribute it to 4 players
					player1[0][j] = deck[i];                      // we are passing through the array till size 9 and assigning the shuffled decks to player
					j++;
				} else if (i % 4 == 1) {
					player2[0][k] = deck[i];
					k++;
				} else if (i % 4 == 2) {
					player3[0][l] = deck[i];
					l++;
				} else if (i % 4 == 3) {
					player4[0][m] = deck[i];
					m++;
				}
			}
		}
	}

		public void displayCards() { 
		//for printing the array for 4 players
		System.out.println("---------------------Player 1 Cards------------------------  ");
		for (int i = 0; i < player1[0].length; i++) {
			System.out.print(player1[0][i] + " ");
		}
		System.out.println();

		System.out.println("\n ---------------------Player 2 Cards------------------------ ");
		for (int i = 0; i < player2[0].length; i++) {
			System.out.print(player2[0][i] + " ");
		}
		System.out.println();

		System.out.println("\n ---------------------Player 3 Cards------------------------ ");
		for (int i = 0; i < player3[0].length; i++) {
			System.out.print(player3[0][i] + " ");
		}
		System.out.println();

		System.out.println("\n ---------------------Player 4 Cards------------------------ ");
		for (int i = 0; i < player4[0].length; i++) {
			System.out.print(player4[0][i] + " ");
		}
		System.out.println();
	}
}
	

