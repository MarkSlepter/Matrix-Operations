package assignment3.card;
public class BelCard extends BaseCard{
    public BelCard(String cardNumber, int amount) {
        super(cardNumber, amount);
    }

    private static final int COMMISSION_BELCARD = 8;
    public static final int TRANSFER_LIMIT_BELCARD = 3000;

    @Override
    public int commission() {
        return COMMISSION_BELCARD;
    }

    @Override
    public boolean limitCheck(int amount) {
        if (getAmount() - amount < TRANSFER_LIMIT_BELCARD) {
            return false;
        }
        return true;
    }
}
