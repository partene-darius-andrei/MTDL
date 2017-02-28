package devoir2.persons;

import java.util.Date;

/**
 * Created by Darius on 2/28/2017.
 */
public class CreditCard {
    private String IBAN, amount;

    public CreditCard(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
