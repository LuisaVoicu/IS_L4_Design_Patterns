package behavioralPatterns.strategy.example.strategies;

public interface PayStrategy {
    public boolean pay(int paymentAmount);
    public void collectPaymentDetails();
}
