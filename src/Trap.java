import java.util.*;

// Kelas Trap menyimpan pertanyaan, jawaban, dan durasi aktif jebakan
public class Trap {
    String question;
    String answer;
    int timer;

    // Konstruktor untuk membuat trap dengan durasi default
    public Trap(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.timer = 5;
    }
}
