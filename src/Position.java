import java.util.*;

// Posisi x,y di grid
class Position {
    int x, y; //koordinat posisi objek
    Position(int x, int y){ this.x = x; this.y = y; } //misal new Position(3,4)

    public boolean equals(Object obj){ //buat bandingin 2 posisi iut sama apa ga
        Position p = (Position)obj; //cm ngubah objek jadi position, biar bisa tau p.x
        return x == p.x && y == p.y; // true klo koordinat sama
    }

    public int hashCode(){
        return Objects.hash(x,y); //ngasih id(?) untuk setiap koordinat biar beliaunya ga nyari lama-lama
    }
}