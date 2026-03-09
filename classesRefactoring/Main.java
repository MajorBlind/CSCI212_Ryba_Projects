public class Main {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.addMoney(new Money(9, 0), 101);
        w1.addMoney(new Money(4, 100), 102);
        
        Wallet w2 = new Wallet();
        w2.addMoney(new Money(10, 0), 201);
        w2.addMoney(new Money(4, 0), 202);
        
        System.out.println("Total money in Wallet 1 is: " + w1.sumAll()); 
        System.out.println("Total money in Wallet 2 is: " + w2.sumAll()); 
        System.out.println();        

        if (w1.compareWallets(w2)) {
            System.out.println("Wallets are equal!");
            System.out.println();  
        } else {
            System.out.println("Wallets are different!");
            System.out.println();  
        }
        
        // User case: Finding the largest single item in wallet 1
        Money max = new Money(0, 0);

        for (Money current : w1.getContents()) {
        	if (current.getDollars() > max.getDollars()) {
        		max = current;
        	}
        }
        System.out.println("The most expensive item in Wallet 1 is: " + max);
  
    }
}
