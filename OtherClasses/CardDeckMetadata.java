/*package com.interview.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CardDeckMetadata {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "card_deck_gen")
	@SequenceGenerator(name = "card_deck_gen", sequenceName = "X_CARD_DECK_ID_SEQ", initialValue = 1000)
	@Column(name = "MAP_ID")
	private Long id;
	
	
	private Long cardId;

	*//**
	 * The foreign key that refers to id of Fixture
	 *//*
	private Long deckId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
}
*/