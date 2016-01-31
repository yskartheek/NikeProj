/*package com.interview.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "card_gen")
	@SequenceGenerator(name = "card_gen", sequenceName = "CARD_ID_SEQ")
	@Column(name = "CARD_ID")
	private Long id;
	
	@Column
	private String cardName;
	
	@Column
	private Long order;
	
	@OneToMany(mappedBy = "card")
	private List<CardDeckMetadata> cardlist ;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public List<CardDeckMetadata> getCardDeckMetadataList() {
		return cardlist;
	}

	public void setCardDeckMetadataList(List<CardDeckMetadata> cardDeckMetadataList) {
		this.cardlist = cardDeckMetadataList;
	}
}
*/