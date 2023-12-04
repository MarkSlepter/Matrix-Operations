package com.teachmeskills.lesson9.Assignment3.service;

import com.teachmeskills.lesson9.Assignment3.client.ClientBase;

public abstract class ActionsForTransfers {
    public static void infoClientName(){
        System.out.println(ClientBase.client_1.firstName + " " + ClientBase.client_1.lastName);
    }
    public static void infoClientCartStock(){
        System.out.println("Cards in stock: " + ClientBase.cardsDavid.length);
    }
    public static void infoBalanceCartBeforeT(int id){
        System.out.println("balance before transfer: " + ClientBase.cardsDavid[id].balance);
    }
    public static void infoBalanceCartAfterT(int id){
        System.out.println("balance after transfer: " + ClientBase.cardsDavid[id].balance);
    }
    public static void balanceWithdrawal(int id, double sum){
        ClientBase.cardsDavid[id].balance -= (sum + (sum * ClientBase.cardsDavid[id].commission / 100));
    }
    public static void combinedMethod (int id1, int id2, double sum){
        ActionsForTransfers.infoClientName();
        ActionsForTransfers.infoClientCartStock();
        ActionsForTransfers.infoBalanceCartBeforeT(id1);
        ActionsForTransfers.balanceWithdrawal(id1, sum);
        ActionsForTransfers.infoBalanceCartAfterT(id1);
        ActionsForTransfers.infoBalanceCartBeforeT(id2);
    }
}
