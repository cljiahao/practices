import java.util.Random;

public class Grid {

    private String[][] grid;
    private String[][] backend;
    public int bomb;
    public int unopened;

    // Initialize of Grid
    public Grid(int size, int bomb) {

        this.bomb = bomb;

        String[][] g_arr = new String[size+1][size+1];

        for (int i = 0; i<size+1; i++) {
            for (int j = 0; j<size+1; j++) {
                if (j==0){
                    if (i==0) {
                        g_arr[i][j] = " ";
                    } else {
                        g_arr[i][j] = String.valueOf((char)(i + 64));
                    }
                } else if (i==0) {
                    g_arr[i][j] = Integer.toString(j);
                }
                else {
                    g_arr[i][j] = "-";
                }
            }
        }
        this.grid = g_arr;

        addBomb(size);

        System.out.println(getGrid());
    }

    // Randomly input bomb onto board
    private void addBomb(int size) {

        String[][] b_arr = new String[size+1][size+1];
        Random rand = new Random();
        int bombleft = this.bomb;

        while (bombleft>0) {
            int r = rand.nextInt(size);
            int c = rand.nextInt(size);
            if (r!=0 && c!=0 && b_arr[r][c] != "*") {
                b_arr[r][c] = "*";
                bombleft-=1;
            }

        }
        this.backend = b_arr;
    }

    // Return a string to show user the current status of board
    public String getGrid() {
        String toPrint = "";
        int unopened = 0;

        for (int i = 0; i<this.grid.length; i++) {
            for (int j = 0; j<this.grid.length; j++) {
                if (this.grid[i][j] == "-") {
                    unopened+=1;
                }
                toPrint += this.grid[i][j];
            }
            toPrint += "\n";
        }

        this.unopened = unopened;

        return toPrint;
    }

    // Check if User select a square that has a bomb init.
    public int checkBomb(int size, String move) {

        int row;
        int column;

        if (move.length() < 3) {
            row = move.toLowerCase().charAt(0) - 'a' + 1;
            column = Character.getNumericValue(move.charAt(1));
        } else {
            row = move.toLowerCase().charAt(0) - 'a' + 1;
            column = Character.getNumericValue(move.charAt(1)+move.charAt(2));
        }

        if (size < row || size < column) {
            System.out.println("Input more than grid size. Please try again.");
            return 0;
        }

        if (this.grid[row][column] == "-") {
            if (this.backend[row][column] == "*") {
                System.out.println("Oh no, you detonated a mine! Game over.");
                return 1;
            } else {
                checkSquare(size,row,column);
                return 0;
            }
        } else {
            System.out.println(move + " selected before. Please select another square.");
            return 0;
        }
    }

    // Recursive Function to expand if current square does not have a bomb adjacent to it
    private void checkSquare(int size, int row, int column) {

        if (row< 0 || row>=size+1 || column<0 || column>=size+1) {
            return;
        }
        if (this.grid[row][column] != "-") {
            return;
        }

        int mines = 0;

        mines += countMine(size, row-1,  column-1);
        mines += countMine(size, row-1,  column);
        mines += countMine(size, row-1,  column+1);

        mines += countMine(size, row,  column-1);
        mines += countMine(size, row,  column+1);

        mines += countMine(size, row+1,  column-1);
        mines += countMine(size, row+1,  column);
        mines += countMine(size, row+1,  column+1);

        if (mines>0) {
            this.grid[row][column] = Integer.toString(mines);
        } else {
            this.grid[row][column] = "0";
            checkSquare(size, row - 1, column - 1);
            checkSquare(size, row - 1, column);
            checkSquare(size, row - 1, column + 1);

            checkSquare(size, row, column - 1);
            checkSquare(size, row, column + 1);

            checkSquare(size, row + 1, column - 1);
            checkSquare(size, row + 1, column);
            checkSquare(size, row + 1, column + 1);
        }
        return;
    }

    // Check if adjacent squares has bombs
    private int countMine(int size,int row, int column) {
        if (row< 0 || row>=size+1 || column<0 || column>=size+1) {
            return 0;
        } else if (this.backend[row][column] == "*"){
            return 1;
        } else {
            return 0;
        }

    }

}