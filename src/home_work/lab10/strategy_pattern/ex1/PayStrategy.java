package home_work.lab10.strategy_pattern.ex1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}