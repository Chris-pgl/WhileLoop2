import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("stop")){
            System.out.println("Please enter a command: ");
            command = scanner.nextLine();
            System.out.println("Enter command "+ command);
        }
    }
}