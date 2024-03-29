package assignment3.service;

import assignment3.card.BaseCard;

public class TransferBetweenCards {
    public static void doTransfer(BaseCard cardFrom, BaseCard cardTo, int amountToTransfer){

        System.out.println("Card From: "  + cardFrom.getCardNumber() + ". Before transfer: " + cardFrom.getAmount());
        System.out.println("Card To: "  + cardTo.getCardNumber() + ". Before transfer: " + cardTo.getAmount());

        int commissionPercent = (amountToTransfer * cardFrom.commission())/100;
        int balanceCardFrom = (int) cardFrom.getAmount();
        int balanceCardTo = (int) cardTo.getAmount();

        if (cardFrom.getAmount() > 0) {
            if (balanceCardFrom - amountToTransfer - commissionPercent > 0) {
                if (cardFrom.limitCheck(amountToTransfer)) {
                    cardFrom.setAmount(balanceCardFrom - amountToTransfer - commissionPercent);
                    cardTo.setAmount(balanceCardTo + amountToTransfer);
                } else {
                    System.out.println("insufficient funds for transfer");
                    return;
                }
            } else {
                System.out.println("insufficient funds for transfer");
                return;
            }
        } else {
            System.out.println("insufficient funds for transfer");
            return;
        }

        System.out.println("Card From: "   + cardFrom.getCardNumber() + ". After transfer: " + cardFrom.getAmount());
        System.out.println("Card To: "   + cardTo.getCardNumber() + ". After transfer: " + cardTo.getAmount());
        System.out.println("Commission from transfer: " + commissionPercent);
    }
}
