import java.util.*;
public class Trap {
    String question;
    String answer;
    int timer; // <--- NEW FIELD

    public Trap(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.timer = 5; // <--- Set default duration to 3 turns
    }
}