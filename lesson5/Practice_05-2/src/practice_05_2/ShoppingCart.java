package practice_05_2;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";
 
        // Declare and initialize the items String array with 4 item descriptions.
        String[] items = {"Shirt","Boots","Pants","Book"};
        int [] numberitems = {1,1,1,1};
        // Change message to show the number of items purchased.
        message = message + " " + items[0] + ": " + numberitems[0];
        System.out.println(message);
        // Print an element from the items array.
        
    }
}
