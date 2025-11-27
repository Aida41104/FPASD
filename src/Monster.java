import java.util.*;

public class Monster {
    public Position pos;

    public Monster(int x, int y) { pos = new Position(x,y); }

    public void moveTowards(Player player, Grid grid) {
        int[][] dist = new int[Grid.ROW][Grid.COL];
        for(int[] row : dist) Arrays.fill(row, -1);

        Queue<Position> q = new LinkedList<>();
        Position[][] parent = new Position[Grid.ROW][Grid.COL];

        q.add(new Position(pos.x,pos.y));
        dist[pos.x][pos.y] = 0;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        while(!q.isEmpty()) {
            Position cur = q.poll();
            if(cur.equals(player.pos)) break;

            for(int i=0;i<4;i++) {
                int nx = cur.x + dx[i], ny = cur.y + dy[i];
                if(grid.isWalkable(nx,ny) && dist[nx][ny]==-1) {
                    dist[nx][ny] = dist[cur.x][cur.y]+1;
                    parent[nx][ny] = cur;
                    q.add(new Position(nx,ny));
                }
            }
        }

        if(dist[player.pos.x][player.pos.y]==-1) return; // tidak menemukan player

        Position cur = player.pos;
        while(parent[cur.x][cur.y]!=null && !parent[cur.x][cur.y].equals(pos))
            cur = parent[cur.x][cur.y];

        pos = new Position(cur.x,cur.y);
    }
}
