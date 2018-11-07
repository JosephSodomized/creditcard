package pl.krutkowska.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    private double balance = 0;
    private double cardLimit = 0;
    
    public void assignLimit(double limit) {
        balance = limit;
        cardLimit = limit;
    }   
    
    public double getLimit() {
        return 2000;
    }
    
    public void block() {
        this.blockade = true;
    }
    
    public boolean isBlocked() {
        return this.blockade;
    }

    public withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}