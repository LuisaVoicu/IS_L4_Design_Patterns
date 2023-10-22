package behavioralPatterns.strategy.example.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPresent()){
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void collectPaymentDetails() {
        try{
            System.out.println("Enter credit number: ");
            String number = READER.readLine();
            System.out.println("Enter card expiration date 'mm/yy' : ");
            String date = READER.readLine();

            System.out.println("Enter CVV' : ");
            String cvv = READER.readLine();

           card = new CreditCard(number, date, cvv);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean cardIsPresent(){
        return card != null;
    }

}
