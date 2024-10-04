import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /*
    * Instantiates Coffee Object
    */
    Coffee newCoffee = new Coffee();

    // Get Size Input with Scanner Object
    System.out.println("What size is the coffee? (Small/Medium/Large)");
    String userSize = input.next();
    newCoffee.setSize(userSize); 
    
    // Get Price Input with Scanner Object
    System.out.println("How much is the coffee? ($)");
    double userPrice = input.nextDouble();
    newCoffee.setPrice(userPrice); 

    // Get isIced Input with Scanner Object 
    System.out.println("Is the coffee iced? (true/false)");
    boolean userIsIced = input.nextBoolean();
    newCoffee.setIsIced(userIsIced); 

    // Get hasCaffeinate Input with Scanner Object
    System.out.println("Is the coffee caffeinated? (true/false)");
    boolean userHasCaffeine = input.nextBoolean();
    newCoffee.setHasCaffeine(userHasCaffeine); 

    // Get espressoShots Input with Scanner Object
    System.out.println("How many esspresso shots does the coffee have?");
    int userEspressoShots = input.nextInt();
    newCoffee.setEspressoShots(userEspressoShots); 

    // Printing Coffee Stats
    System.out.println();
    System.out.println("----------Coffee Order----------");    
    System.out.println("Size: " + newCoffee.getSize());
    System.out.println("Price: $" + newCoffee.getPrice());
    System.out.println("Is it Iced? " + newCoffee.getIsIced());   
    System.out.println("Is it Caffeinated? " + newCoffee.getHasCaffeine());
    System.out.println("How Many Espresso Shots? " + newCoffee.getEspressoShots());
    System.out.println("--------------------------------");
    System.out.println();


    /*
    * Instantiates Matcha Object
    */
    Matcha newMatcha = new Matcha();

    // Get Size Input with Scanner Object
    System.out.println("What size is the matcha? (Small/Medium/Large)");
    String matchaSize = input.next();
    newMatcha.setSize(matchaSize); 
    
    // Get Price Input with Scanner Object
    System.out.println("How much is the matcha? ($)");
    double matchaPrice = input.nextDouble();
    newMatcha.setPrice(matchaPrice); 

    // Get isIced Input with Scanner Object
    System.out.println("Is the matcha iced? (true/false)");
    boolean matchaIsIced = input.nextBoolean();
    newMatcha.setIsIced(matchaIsIced); 

    // Get isSweetened Input with Scanner Object
    System.out.println("Is the matcha sweetened? (true/false)");
    boolean userIsSweetened = input.nextBoolean();
    newMatcha.setIsSweetened(userIsSweetened); 

    // Get matchaScoops Input with Scanner Object
    System.out.println("How many matcha scoops does the matcha have?");
    int userMatchaScoops = input.nextInt();
    newMatcha.setMatchaScoops(userMatchaScoops); 

    // Printing Matcha Stats
    System.out.println();
    System.out.println("----------Matcha Order----------");
    System.out.println("Size: " + newMatcha.getSize());
    System.out.println("Price: $" + newMatcha.getPrice());
    System.out.println("Is it Iced? " + newMatcha.getIsIced());   
    System.out.println("Is it Sweetened? " + newMatcha.getIsSweetened());
    System.out.println("How Many Matcha Scoops? " + newMatcha.getMatchaScoops());
    System.out.println("--------------------------------");

    System.out.println();
    System.out.println("---------Default Drinks----------");
    Drink d1= new Drink();
    System.out.println(d1);
    Drink d2 = new Drink("Small", 6.50, true);
    System.out.println(d2);

    Coffee c1 = new Coffee("Medium", 4.25, true, false, 2);
    System.out.println(c1);
    
    Matcha m1 = new Matcha("Medium", 5.75, true, true, 1);
    System.out.println(m1);
    System.out.println("---------------------------------");


    // Closes the Scanner object
    input.close();
    
  }
}