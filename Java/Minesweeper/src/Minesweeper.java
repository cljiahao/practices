import java.util.Scanner;

public class Minesweeper {

    public Minesweeper() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int bomb = 0;
        String move = "";
        int lose = 0;

        // Initial Message and Size input
        System.out.println("Welcome to Minesweeper!");
        while (10 < size || size < 2) {
            try {
                System.out.println("Enter the size of the grid (e.g. 4 for a 4x4 grid):");
                size = scanner.nextInt();
            } catch(Exception e) {
                scanner.nextLine();
                System.out.println("Incorrect input. Numbers only");
            }

            if (10<size) {
                System.out.println("Maximum size of grid is 10.");
            }
            else if (size<2) {
                System.out.println("Minimum size of grid is 2.");
            }
        }

        // Number of bombs input must be below 35% and a minimum of 1 bomb
        while (Math.ceil(size*0.35)<bomb || bomb == 0) {
            System.out.println("Enter the number of mines to place on the grid (maximum is 35% of the total squares ["+Math.ceil(size*0.35)+"]):");
            try{
                bomb = scanner.nextInt();
                if (bomb == 0) {
                    System.out.println("There must be at least 1 mine.");
                } else if (Math.ceil(size*0.35)<bomb){
                    System.out.println("Maximum is 35% of the total squares. Please enter size smaller than " + Math.ceil(size*0.35)+"");
                }
            }
            catch(Exception e) {
                scanner.nextLine();
                System.out.println("Incorrect input. Numbers only");
            }
        }

        // Creation of Grid board
        Grid grid = new Grid(size, bomb);

        // Repeat input until user chose a bomb or win
        while (lose != 1) {
            System.out.println("Select a square to reveal (e.g. A1):");
            move = scanner.next();

            if
            ((move.length() == 2 && Character.isLetter(move.charAt(0)) && Character.isDigit(move.charAt(1))) ||
                    (move.length() == 3 && Character.isLetter(move.charAt(0)) && Character.isDigit(move.charAt(1))&& Character.isDigit(move.charAt(2)))) {
                lose = grid.checkBomb(size, move);
                if (lose != 1) {
                    System.out.print(grid.getGrid());
                    if (grid.unopened == grid.bomb) {
                        System.out.print("Congratulations, you have won the game!\n");
                        lose=1;
                    }
                }
            } else if (move.equals("quit")){
                lose=1;
            }
            else {
                System.out.println("Incorrect input.");
            }
        }
    }
}
