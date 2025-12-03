import java.util.*;
public class Game {
    public static void main(String[] args){
        Grid grid = new Grid(); //instantiates your game board.
        Player player = new Player(1,0); //spawn elmeen
        Monster monster = new Monster(9,9);
        Scanner sc = new Scanner(System.in); //y/n

        while(true){
            grid.render(player,monster); //visual player n monster

            if(player.pos.equals(new Position(14,13))){ //koordinat finish
                System.out.println("YOU WIN!");
                break;
            }
            if(player.pos.equals(monster.pos)){
                System.out.println("MONSTER MENANGKAPMU!! YOU LOSE!");
                break;
            }

            grid.spawnTrap(player); //spawn trap. misal Player di (5,5) Trap muncul di (5,8)
            player.move(grid);//wasd gerak
            grid.checkTrap(player, sc); //player nginjek trap ga?
            monster.moveTowards(player, grid); // m grk 1 langkah
            System.out.println();
        }
    }
}