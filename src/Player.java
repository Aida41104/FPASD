import java.util.*;
class Player {
    Position pos;
    boolean skipTurn; //klo false= player boleh gerak

    Player(int x, int y){
        pos = new Position(x,y);
        skipTurn = false;
    } //new Player(x,y), belum kena trap jadi g ad skipturn


    public void move(Grid grid){
        if(skipTurn){ //klo salah jawab trap bakal skip turn
            System.out.println("KAMU SALAH JAWAB, YAHAAA GA BISA JALAN!");
            skipTurn = false;
            return;
        }

        Scanner sc = new Scanner(System.in); //input: keyboard
        System.out.print("Move (W/A/S/D): ");
        String input = sc.nextLine().toLowerCase();

        int nx = pos.x, ny = pos.y;
        //grid[0][0]  grid[0][1]  grid[0][2]
        //grid[1][0]  grid[1][1]  grid[1][2]
        //grid[2][0]  grid[2][1]  grid[2][2]
        if(input.equals("w")) {
            nx--;
        }
        else if(input.equals("s")) {
            nx++;
        }
        else if(input.equals("a")) {
            ny--;
        }
        else if(input.equals("d")) {
            ny++;
        }
        else {
            System.out.println("Invalid move!");
            return;

        }

        if(grid.isWalkable(nx, ny)) { //bukan tembok dan masih dalam batas map = true, pindah posisi
            pos.x = nx;
            pos.y = ny;
        }
    }
}
