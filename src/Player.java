import java.util.*;

class Player {
    Position pos;
    boolean skipTurn;

    // Constructor: menentukan posisi awal player dan status giliran
    Player(int x, int y) {
        pos = new Position(x, y);
        skipTurn = false;
    }

    // Mengatur pergerakan player berdasarkan input keyboard (W/A/S/D)
    public void move(Grid grid) {

        // Jika player terkena trap, ia kehilangan satu giliran
        if (skipTurn) {
            System.out.println("Dr. Arkam: \"Salah!! Tampaknya otakmu membeku! Kau kehilangan satu giliran.\"");
            skipTurn = false;
            return;
        }

        // Membaca input pergerakan dari pemain
        Scanner sc = new Scanner(System.in);
        System.out.print("Move (W/A/S/D): ");
        String input = sc.nextLine().toLowerCase();

        int nx = pos.x;
        int ny = pos.y;

        // Menentukan arah gerak berdasarkan input
        if (input.equals("w")) {
            nx--;
        } else if (input.equals("s")) {
            nx++;
        } else if (input.equals("a")) {
            ny--;
        } else if (input.equals("d")) {
            ny++;
        } else {
            System.out.println("Invalid move!");
            return;
        }

        // Mengecek apakah tujuan dapat dilewati sebelum memindahkan player
        if (grid.isWalkable(nx, ny)) {
            pos.x = nx;
            pos.y = ny;
        }
    }
}
