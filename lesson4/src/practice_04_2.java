public class practice_04_2 {
    public static void main(String[] args){
        String custName ="Bob";
        String itemCost ="book";
        double price = 20d;
        double tax = 1.2d;
        int quantity = 1;
        String message;
        message = custName + "want to purcase a" +itemCost ;
        System.out.println(message);
        double totalcost = (price * quantity) * tax;
        System.out.println(totalcost);
    }
}