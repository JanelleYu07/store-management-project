public class Coffee extends Drink {

    /*
    * Instance Variables
    */
    private boolean hasCaffeine;
    private int espressoShots;

    /*
    * No Argument Constructor Method
    */
  
    public Coffee() {
        super("No size", 0.0, false); 
        hasCaffeine = true;
        espressoShots = 1;
    }
    /*
    * Parameterized Constructor Methods
    */
    public Coffee(String size, double price, boolean isIced, boolean hasCaffeine, int espressoShots) {
        super(size, price, isIced); 
        this.hasCaffeine = hasCaffeine;
        this.espressoShots = espressoShots;
    }
  
      public Coffee(String size, double price, boolean isIced, int espressoShots) {
        super(size, price, isIced); 
        this.hasCaffeine = true;
        this.espressoShots = espressoShots;
    }

    /*
    * Accessor Methods
    */ 

    public boolean getHasCaffeine() {
        return hasCaffeine;
    }

    public int getEspressoShots() {
        return espressoShots;
    }

    /*
    * Mutator Methods
    */ 
    public void setHasCaffeine(boolean hasCaffeine) {
        this.hasCaffeine = hasCaffeine;
    }
  
    public void setEspressoShots(int espressoShots) {
        this.espressoShots = espressoShots;
    }
  
    /*
    * toString Method Override
    */ 
    public String toString() {
      String caffeine;
      if (hasCaffeine == true) {
        caffeine = "Caffeinated";
      } else {
        caffeine = "Decaf";
      }
        return super.toString() + "\nIs it caffeinated or decaf?" + caffeine + "\nHow many espresso shots?" + espressoShots;
    }
}
