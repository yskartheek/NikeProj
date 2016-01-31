package com.interview.serviceTest;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.interview.configuration.Main;
import com.interview.constants.Constants;
import com.interview.domain.Deck;
import com.interview.repository.DeckRepository;
import com.interview.service.NikeCodeInterviewService;
import com.interview.strategy.SimpleShuffler;

/**
 * Test class to test the logic in simple shuffling 
 * @author KARTHEEK YS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
@WebAppConfiguration
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DbUnitTestExecutionListener.class})
public class SimpleShufflerStrategyTest {
	
	@Autowired
	private DeckRepository theDeckRepository;
	
	@Autowired
	private NikeCodeInterviewService theNikeInterviewService;
	
	@Autowired 
	private SimpleShuffler simpleShuffler;
	
	/**
	 * Tests simple shuffling 
	 */
	@Test
	public void simpleShufflerTest(){
		theDeckRepository.deleteAll();
		Deck aNonShuffledDeck = theNikeInterviewService.CreateDecks("TestDeck");
        Assert.assertEquals(aNonShuffledDeck.getCards(), Constants.CARDS);
        List<String> shuffledOrder = simpleShuffler.shuffleCards(Arrays.asList(aNonShuffledDeck.getCards().split(",")));
        Assert.assertNotEquals(aNonShuffledDeck.getCards(), shuffledOrder.toString());
	}

}
