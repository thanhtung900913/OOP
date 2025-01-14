package oop.lab10.strategy_pattern.ex1;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    public CreditCard( String number, String date, String cardVerificationValue) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public String getNumber(){
        return this.number;
    }

    public int getAmount() {
        return amount;
    }
}
