public class Money {
    
    private int dollars;
    private int cents;
    
    public Money(int dollars, int cents) {
        this.dollars = dollars + (cents / 100);
        this.cents = cents % 100;
    }

    public void add(Money other) {
        int totalCents = this.cents + other.cents;
        int extraDollars = totalCents / 100;
        
        this.cents = totalCents % 100;
        this.dollars = this.dollars + other.dollars + extraDollars;
    }

    public String toString() {
        if (cents < 10)
        	return "$" + dollars + ".0" + cents;
        else 
        	return "$" + dollars + "." + cents;
    }

    public boolean isEqualTo(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }
    
    public int getDollars() {
        return this.dollars;
    }

    public int getCents() {
        return this.cents;
    }
}