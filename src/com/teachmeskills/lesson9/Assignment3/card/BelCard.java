package com.teachmeskills.lesson9.Assignment3.card;

public class BelCard extends BaseCard{
    public static int limit = 266;
    public  static double commission = 10;
    public static String currency = "BYN";

    public BelCard(long cardNumber,
                   int cvv,
                   double balance,
                   long idCart,
                   int limit,
                   double commission,
                   String currency) {
        super(cardNumber, cvv, balance, idCart, limit, commission, currency);
    }
}
