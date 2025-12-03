import java.util.*;

// Posisi x,y di grid
class Position {
    int x, y;
    Position(int x, int y){ this.x = x; this.y = y; }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Position p = (Position)obj;
        return x == p.x && y == p.y;
    }

    public int hashCode(){
        return Objects.hash(x,y);
    }
}