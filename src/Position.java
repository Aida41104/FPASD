import java.util.*;

// Kelas untuk merepresentasikan posisi (x, y) pada grid
class Position {
    int x, y;

    // Konstruktor untuk membuat posisi baru
    Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Membandingkan dua objek Position berdasarkan koordinatnya
    public boolean equals(Object obj){
        Position p = (Position)obj;
        return x == p.x && y == p.y;
    }

    // Menghasilkan hash code berdasarkan nilai x dan y
    public int hashCode(){
        return Objects.hash(x, y);
    }
}
