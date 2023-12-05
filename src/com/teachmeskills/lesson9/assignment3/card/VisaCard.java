package com.teachmeskills.lesson9.assignment3.card;

public class VisaCard extends BaseCard{
    public VisaCard(String cardNumber, int amount) {
        super(cardNumber, amount);
    }

    private static final int COMMISSION_VISACARD = 12;
    private static final int TRANSFER_LIMIT_VISACARD = 1200;

    @Override
    public int commission() {
        return COMMISSION_VISACARD;
    }

    @Override
    public boolean limitCheck(int amount) {
        if (getAmount() - amount < TRANSFER_LIMIT_VISACARD) {
            return false;
        }
        return true;
    }
}
