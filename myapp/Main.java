import java.io.Console;

public class Main {
    public static void main(String[] args){
        Console cons = System.console();
        /*String name = cons.readLine("What is your name? ");
        System.out.printf("Hello %s. Please to meet you. \n", name);
        String sport = cons.readLine("What is the sport that you like to do?");
        if (sport.toUpperCase().equals("SWIMMING")){
            System.out.println("Cool!");
        }
        else if (sport.toUpperCase().equals("SOCCER")){
            System.out.println("Nice!");
            }
        else{
            System.out.println("Esports?");
        }*/
       /*String Score = cons.readLine("Score between 1 to 10: ");

       Integer ScoreValue = Integer.parseInt(Score);

       switch (ScoreValue){
        case 10:
            System.out.println("Perfection");
            break; 
       case 5:
            System.out.println("Passing grade");
            break;
        default:
            System.out.println("Upgraded");
       }*/
      String[] todo = new String[5];
      for (int i = 0; i < todo.length; i ++){
        String task = cons.readLine("Enter task %d: ", (i + 1));
        todo[i] = task;
      }
      for (String count: todo){
        System.out.println(count);
      }
        
    }
}