package com.teachmeskills.lesson9.Assignment3.card;

public class VisaCard extends BaseCard{
    public static int limit = 6777;
    public static double commission = 0.5;
    public static String currency = "Euro";
    public VisaCard(long cardNumber,
                    int cvv,
                    double balance,
                    long idCart,
                    int limit,
                    double commission,
                    String currency) {
        super(cardNumber, cvv, balance, idCart, limit, commission, currency);
    }
}
