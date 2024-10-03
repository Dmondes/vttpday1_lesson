import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping{
    public static void main(String[] args){
        Console cons = System.console();
        List<String> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your shopping cart");
        String item = scanner.next();
        switch (item.toLowerCase()){
            case "list":
                if (cart.size() == 0){
                    System.out.println("Cart is empty");
                }
                else{
                    for (int i = 0; i < cart.size(); i ++){
                        System.out.printf("%d.%s\n", i+1, cart.get(i));
                    }
                }
            case "add":
                while (true){
                    if (item == " "){
                        break;
                    }
                cart.add(item);
                }
            case "delete":
                cart.remove(item);
        }
    }
}