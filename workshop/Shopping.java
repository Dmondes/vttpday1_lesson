import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping{
    public static void main(String[] args){
        Console cons = System.console();
        List<String> cart = new ArrayList<>();
        while (true){
        String theInput = cons.readLine("Welcome to your shopping cart\n ");
        if (theInput.equalsIgnoreCase("stop")){
            System.out.println("Checking out...");
            break;
        }
        
        Scanner scan = new Scanner(theInput);
        switch (scan.next().toLowerCase()){
            case "list":
                if (cart.size() == 0){
                    System.out.println("Cart is empty");
                    break;
                }
                else{
                    for (int i = 0; i < cart.size(); i ++){
                        System.out.printf("%d : %s\n", i+1, cart.get(i));
                    }
                    break;
                }
            case "add":
                while (scan.hasNext()){
                    String item = scan.next();
                cart.add(item);
                System.out.printf("%s added to cart\n", item);

                }
                break;
            case "delete":
                int count = Integer.parseInt(scan.next());
                if (count > cart.size() + 1){
                    System.out.println("Incorrect item index\n");
                }
                else{
                System.out.printf("%s removed from cart\n", cart.get(count - 1));
                cart.remove(count - 1);}
        }
        scan.close();
    }
}
}