package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
class GiftCardTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getIssuingStore()
	{
	double balance;
	GiftCard card;
	int issuingStore;
	issuingStore = 1337;
	balance = 100.00;
	card = new GiftCard(issuingStore, balance);
	assertEquals("getIssuingStore()",
	issuingStore, card.getIssuingStore());
	}
}
