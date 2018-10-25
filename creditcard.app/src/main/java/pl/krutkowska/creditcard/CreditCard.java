package pl.krutkowska.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    
    public void assignLimit(double limit) {
        
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
}