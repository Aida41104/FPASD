import java.util.*;
class Player {
    Position pos;
    boolean skipTurn;

    Player(int x, int y){
        pos = new Position(x,y);
        skipTurn = false;
    }


    public void move(Grid grid){
        if(skipTurn){
            System.out.println("Turn skipped karena kamu salah menjawab!");
            skipTurn = false;
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Move (W/A/S/D): ");
        String move = sc.nextLine().toLowerCase();

        int nx = pos.x, ny = pos.y;
        switch(move){
            case "w": nx--; break;
            case "s": nx++; break;
            case "a": ny--; break;
            case "d": ny++; break;
            default: System.out.println("Invalid move!"); return;
        }

        if(grid.isWalkable(nx, ny)) {
            pos.x = nx;
            pos.y = ny;
        }
    }
}
