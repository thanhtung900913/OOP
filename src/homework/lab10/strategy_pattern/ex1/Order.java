package homework.lab10.strategy_pattern.ex1;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;
    public void processOrderUsingPaypal(PayByPaypal paypal){
        paypal.collectPaymentDetails();
    }
    public void processOrderUsingCreditCard(PayByCreditCard creditcard){
        creditcard.collectPaymentDetails();
    }
    public void setTotalCost(int cost){
        this.totalCost += cost;
    }
    public boolean isClosed(){
        return isClosed;
    }
    public void setClosed(){
        isClosed = true;
    }

    public int getTotalCost() {
        return totalCost;
    }
}