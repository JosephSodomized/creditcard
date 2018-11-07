package pl.krutkowska.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }
    

    @Test
     public void canBlockCard () {
         
         CreditCard card = new CreditCard();
         card.block();
         
         Assert.assertTrue(card.isBlocked());
     }

    @Test(expected = WithdrawWhenOverTheLimit.class)
    public void cantWithdrawWhenOverTheLimit() throws Exception {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        card.withdraw(500);
        
        Assert.assertTrue(card.getBalance() == 1500);
        
    }

 
}