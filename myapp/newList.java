import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Console;

public class newList{
    public static void main(String[] args){
        Console cons = System.console();
        //Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String keyboardInput = "";
        keyboardInput = cons.readLine("Enter a sentence: ");
        Scanner scan = new Scanner(keyboardInput);
        while (scan.hasNext()){
            words.add(scan.next());
        }
        scan.close();

        for(int i = 0; i <words.size(); i ++){
            System.out.printf("%d : %s \r\n", i + 1, words.get(i));
        }
    }
}