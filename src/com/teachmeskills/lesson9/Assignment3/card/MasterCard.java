package com.teachmeskills.lesson9.Assignment3.card;

public class MasterCard extends BaseCard{
    public static int limit = 700;
    public static double commission = 1;
    public static String currency = "USD";

    public MasterCard(long cardNumber,
                      int cvv,
                      double balance,
                      long idCart,
                      int limit,
                      double commission,
                      String currency) {
        super(cardNumber, cvv, balance, idCart, limit, commission, currency);
    }
}
