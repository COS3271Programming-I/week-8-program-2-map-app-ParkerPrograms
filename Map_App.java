package Week_8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Map_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String,String> passwords = new HashMap<>();
    	passwords.put("bjohnson", "hcruhclehteb");
    	passwords.put("twhite", "v%34uYs6t");
    	passwords.put("jduplantis", "t8d5*@&z");
    	passwords.put("sfurtick", "4j6d*du%3");
    	passwords.put("jmeyer", "123456");
    	
    	Map<String,String> messages = new HashMap<>();
    	messages.put("bjohnson", "Close down your organization.");
    	messages.put("twhite", "You need to cut your hair.");
    	messages.put("jduplantis", "Hey, Jesse. Humans do not have original goodness.");
    	messages.put("sfurtick", "You should go find a good seminary.");
    	messages.put("jmeyer", "Change your password.");
    	
    	System.out.print("Name: ");
    	String name = userinput.nextLine();
    	System.out.print("Password: ");
    	String password = userinput.nextLine();
    	
    	if (password.equals(passwords.get(name))) {System.out.println(messages.get(name));}
    	else {System.out.println("Incorrect username or password");}
	}
}
