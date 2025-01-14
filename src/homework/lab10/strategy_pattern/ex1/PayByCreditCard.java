package homework.lab10.strategy_pattern.ex1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;
    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPresent()){
            System.out.println("Paying "+ paymentAmount + " using credit card. ");
            card.setAmount(card.getAmount() - paymentAmount);
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiratin data 'mm/yy' : ");
            String date = READER.readLine();
            System.out.println("enter :");
            String cardVerificationValue = READER.readLine();
            if(CreditCardValidator.isValid(number)){
                card = new CreditCard(number, date, cardVerificationValue);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    private boolean cardIsPresent(){
        return card != null;
    }

}



