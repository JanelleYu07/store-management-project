public class Matcha extends Drink {

    /*
    * Instance Variables
    */
    private boolean isSweetened;
    private int matchaScoops;

    /*
    * No Argument Constructor Methods
    */
    public Matcha() {
        this("No size", 0.0, false, false, 1);
    }

    /*
    * Parameterized Constructor Methods
    */
    public Matcha(String size, double price, boolean isIced, boolean isSweetened, int matchaScoops) {
        super(size, price, isIced);
        this.isSweetened = isSweetened;
        this.matchaScoops = matchaScoops;
    } 

    public Matcha(String size, double price, boolean isIced, int matchaScoops) {
        super(size, price, isIced);
        this.isSweetened = true;
        this.matchaScoops = matchaScoops;
    } 

    /*
    * Accessor Methods
    */ 
    public boolean getIsSweetened() {
        return isSweetened;
    }

    public int getMatchaScoops() {
        return matchaScoops;
    }

    /*
    * Mutator Methods
    */ 
    public void setIsSweetened(boolean isSweetened) {
        this.isSweetened = isSweetened;
    }
  
    public void setMatchaScoops(int matchaScoops) {
        this.matchaScoops = matchaScoops;
    }

    /*
    * toString Method Override
    */ 
    public String toString() {
      String sweetened;
      if (isSweetened == true) {
        sweetened = "Sweetened";
      } else {
        sweetened = "Not Sweetened";
      }
        return super.toString() + "\nIs it Sweetened? " + sweetened + "\nHow Many Matcha Scoops? " + matchaScoops;
    }    
}
