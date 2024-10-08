public class Drink {
  
  /*
  * Instance Variables
  */
  private String size;
  private double price;
  boolean isIced;
  
  /*
  * No-Argument Constructor Method
  */
  public Drink() {
    size = "No size";
    price = 0.0;
    isIced = false;
  }
  
  /*
  * Parameterized Constructor Methods
  */
  public Drink(String size, double price, boolean isIced) {
    this.size = size;
    this.price = price;
    this.isIced = isIced;
  }

  public Drink(String size, double price) {
    this.size = size;
    this.price = price;
    this.isIced = true;
  }
  
  /*
  * Accessor Methods
  */   
  
  public String getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsIced() {
    return isIced;
  }
  
  /*
  * Mutator Methods
  */   
  public void setSize(String size) {
    this.size = size;
  }

  public void setPrice(double price) {
     if (price < 0.0) {
      this.price = 0.0;
    } else {
      this.price = price;
    }
  }

  public void setIsIced(boolean isIced) {
    this.isIced = isIced;
  }

  /*
  * toString Method Override
  */   
  public String toString() {
    String text;
    if (isIced == true) {
      text = "Iced";
    } else {
      text = "Hot";
    }
    return "\nSize: " + size + "\nPrice: " + price + "\nIs it Iced or Hot? " + text;
  }
  
  
}