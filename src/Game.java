import java.util.*;
public class Game {
    public static void main(String[] args){
        Grid grid = new Grid();
        Player player = new Player(1,1);
        Monster monster = new Monster(9,8);
        Scanner sc = new Scanner(System.in);

        while(true){
            grid.render(player,monster);

            if(player.pos.equals(new Position(14,13))){
                System.out.println("YOU WIN!");
                break;
            }
            if(player.pos.equals(monster.pos)){
                System.out.println("YOU LOSE! Monster menang!");
                break;
            }

            grid.spawnTrap(player);
            player.move(grid);
            grid.checkTrap(player, sc);
            monster.moveTowards(player, grid);
            System.out.println();
        }

        sc.close();
    }
}