import java.util.*;

public class Monster {
    Position pos;

    // Constructor: menentukan posisi awal monster
    public Monster(int x, int y) {
        pos = new Position(x, y);
    }

    // Menggerakkan monster menuju player menggunakan algoritma BFS
    public void moveTowards(Player player, Grid grid) {

        // Inisialisasi matriks jarak untuk BFS
        int[][] dist = new int[Grid.ROW][Grid.COL];
        for (int i = 0; i < Grid.ROW; i++) {
            Arrays.fill(dist[i], -1);
        }

        // Struktur data BFS: queue dan parent untuk pelacakan jalur
        Queue<Position> q = new LinkedList<>();
        Position[][] parent = new Position[Grid.ROW][Grid.COL];

        // Titik awal BFS adalah posisi monster
        q.add(new Position(pos.x, pos.y));
        dist[pos.x][pos.y] = 0;

        // Arah gerak 4 arah (atas, bawah, kiri, kanan)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // Proses BFS untuk mencari jalur terpendek ke player
        while (!q.isEmpty()) {
            Position cur = q.poll();

            if (cur.equals(player.pos)) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (grid.isWalkable(nx, ny) && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cur.x][cur.y] + 1;
                    parent[nx][ny] = cur;
                    q.add(new Position(nx, ny));
                }
            }
        }

        // Backtracking jalur BFS untuk menentukan satu langkah monster
        Position cur = player.pos;
        while (parent[cur.x][cur.y] != null && !parent[cur.x][cur.y].equals(pos)) {
            cur = parent[cur.x][cur.y];
        }

        // Monster bergerak satu langkah menuju player
        pos = new Position(cur.x, cur.y);
    }
}
