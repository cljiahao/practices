import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            new Minesweeper();
            System.out.println("Press any key to play again...");
            scanner.next();
        }
    }
}
