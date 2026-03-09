import java.util.ArrayList;

public class Wallet {
    
    private ArrayList<Money> contents = new ArrayList<>();
    private ArrayList<Integer> itemIDs = new ArrayList<>();

    public void addMoney(Money m, int id) {
        contents.add(m);
        itemIDs.add(id);
    }

    public Money sumAll() {
        Money total = new Money(0,0); 
        for (int i = 0; i < contents.size(); i++) {
            total.add(contents.get(i)); 
        }
        return total; 
    }

    public boolean compareWallets(Wallet other) {
    	Money myTotal = this.sumAll(); 
    	Money otherTotal = other.sumAll();

    	if (!myTotal.isEqualTo(otherTotal)) { 
    		return false;
    	}
    	return true;
    }
    
    public void printAll() {
        System.out.println("Current Wallet Contents:");
        for (int i = 0; i < contents.size(); i++) {
            System.out.println("ID " + itemIDs.get(i) + ": " + contents.get(i));
        }
    }

    // add getter functions
    public ArrayList<Money> getContents(){
        return contents;
    }

    public ArrayList getItemIDs(){
        return itemIDs;
    }
}