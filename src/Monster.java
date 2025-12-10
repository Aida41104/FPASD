import java.util.*;

public class Monster {
    Position pos;

    public Monster(int x, int y) {
        pos = new Position(x,y);
    }

    //BFS
    public void moveTowards(Player player, Grid grid) {
        int[][] dist = new int[Grid.ROW][Grid.COL]; //15 x 15, buat nyati jalur terpendek/ bfs
        for(int i = 0; i < dist.length; i++) {          // baris
            for(int j = 0; j < dist[i].length; j++) {   // jumlah kolom
                dist[i][j] = -1;                        // isi dg -1
            }
        }

        Queue<Position> q = new LinkedList<>();//queue isinya koordinat/ FIFO
        Position[][] parent = new Position[Grid.ROW][Grid.COL]; //nyimpen koordinat sebelumnya pas anunya gerak

        q.add(new Position(pos.x,pos.y)); // tiitk mulainya BFS
        dist[pos.x][pos.y] = 0; //ngitung jarak, jarak monster ke dirinya sendiri adalah 0, pos = posisi M

        //ngelihat are sekitar
        int[] dx = {-1,1,0,0}; //naik, turun
        int[] dy = {0,0,-1,1}; //kiri, kanan

        while(!q.isEmpty()) { //q ada isinya= true, klo kosong = dah selelsai jalan jalan
            Position cur = q.poll(); //ambil terdepan, apus, ngecek jalur sekitar sampai ke seluruh matriks 15x15
            if(cur.equals(player.pos)) break; //posisi yg diperiksa bfs = posisi player, stop

            for(int i=0;i<4;i++) { //cek 4 arah
                int nx = cur.x + dx[i], ny = cur.y + dy[i]; //i ngambil dari dy n dx
                if(grid.isWalkable(nx,ny) && dist[nx][ny]==-1) { //bisa dilewatin + belum dikunjungi/ -1 distnya
                    dist[nx][ny] = dist[cur.x][cur.y]+1; //misal= 0 + 1 = 1/ jarak tetangga
                    parent[nx][ny] = cur; //nyimpan asal datang di cur
                    q.add(new Position(nx,ny));//daftar tempat yang akan diperiksa
                }
            }
        }

        //mundur
        Position cur = player.pos;
        while(parent[cur.x][cur.y]!=null && !parent[cur.x][cur.y].equals(pos)) //masih ada parent n bukan posisi monster = ture
            cur = parent[cur.x][cur.y];//cur pindah ke posisi parent

        pos = new Position(cur.x,cur.y); //monster gerak 1 langkah ke cur
    }
}
