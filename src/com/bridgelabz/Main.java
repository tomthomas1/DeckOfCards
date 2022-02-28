package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		DeckOfCards cards = new DeckOfCards();             //creating object and calling its methods 
		String[] card = cards.shuffleCards();
		cards.displayShuffleCards();
		cards.distribute(card);
		cards.displayCards();
	}

}
