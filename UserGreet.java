import java.util.Scanner

	// Class finds if user is ready to play the game
public class UserGreet {
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Are you ready for the game? [y/n]");
     String input = scanner.nextLine();
     System.out.println("You entered: " + input);
 }
}
