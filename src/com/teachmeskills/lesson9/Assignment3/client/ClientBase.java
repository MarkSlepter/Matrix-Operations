package com.teachmeskills.lesson9.Assignment3.client;

import com.teachmeskills.lesson9.Assignment3.card.BaseCard;
import com.teachmeskills.lesson9.Assignment3.card.BelCard;
import com.teachmeskills.lesson9.Assignment3.card.MasterCard;
import com.teachmeskills.lesson9.Assignment3.card.VisaCard;

public class ClientBase extends AddressInfo{
    public static Client client_1 = new Client("Mark", "Barduk", "EYER3436B2",
            "12.12.2002", 00124, "Poland", "Warsaw",
            "Nosewana", 66, 12);
    static BaseCard belCart1Client_1 = new BelCard(1085_1504_0000_1587L, 445, 3789.65, 0, BelCard.limit, BelCard.commission, BelCard.currency);
    static BaseCard belCart2Client_1 = new BelCard(1246_0780_0000_1474L, 702, 0.04, 1, BelCard.limit, BelCard.commission, BelCard.currency);
    static BaseCard visaCard1Client_1 = new VisaCard(1789_7933_0011_1452L, 214, 623.12, 2, VisaCard.limit, VisaCard.commission, VisaCard.currency);
    static BaseCard visaCard2Client_1 = new VisaCard(2236_5202_4111_3412L, 614, 1102.00, 3, VisaCard.limit, VisaCard.commission, VisaCard.currency);
    static BaseCard masterCard1Client_1 = new MasterCard(3214_7851_0000_4158L, 178, 102.3, 4, MasterCard.limit, MasterCard.commission, MasterCard.currency);
    static BaseCard masterCard2Client_1 = new MasterCard(3408_1483_0000_3491L, 324, 505, 5, MasterCard.limit, MasterCard.commission, MasterCard.currency);
    public static BaseCard[] cardsDavid = {belCart1Client_1, belCart2Client_1, visaCard1Client_1, visaCard2Client_1, masterCard1Client_1, masterCard2Client_1};

}