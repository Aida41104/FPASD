import java.util.*;
class Grid {
    public static final int ROW = 15, COL = 15; //grid nya 15 x 15
    public char[][] grid = {
            {'|','|','|','|','|','|','|','|','|','|','|','|','|','|','|'},
            {' ',' ',' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' ','|'},
            {'|',' ','|','|',' ','|',' ','|','|','|','|','|',' ',' ','|'},
            {'|',' ','|',' ',' ','|',' ','|',' ',' ',' ','|','|',' ','|'},
            {'|',' ',' ','|','|','|',' ','|',' ','|',' ','|','|',' ','|'},
            {'|',' ',' ',' ',' ','|',' ','|',' ','|',' ','|',' ',' ','|',},
            {'|','|','|',' ','|','|',' ','|',' ','|',' ','|',' ','|','|'},
            {'|',' ',' ',' ',' ','|',' ',' ',' ',' ','|',' ',' ','|','|'},
            {'|',' ','|','|',' ','|','|','|',' ','|','|','|',' ','|','|'},
            {'|',' ','|',' ',' ','|',' ',' ',' ',' ',' ','|',' ','|','|'},
            {'|',' ','|','|',' ','|',' ','|','|','|','|','|',' ','|','|'},
            {'|',' ',' ','|',' ',' ',' ','|',' ',' ',' ',' ',' ','|','|'},
            {'|',' ','|','|','|',' ','|','|',' ','|',' ','|','|','|','|'},
            {'|',' ',' ',' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ','|'},
            {'|','|','|','|','|','|','|','|','|','|','|','|','|',' ','|'}

    };

    // Horror Theme Constants
    public static final String RESET = "\u001B[0m";

    // Player: A bright, ghostly cyan (like a lost soul)
    public static final String PLAYER_COLOR = "\u001B[1;96m";

    // Monster: Red Background with Black Text (Intense contrast)
    public static final String MONSTER_COLOR = "\u001B[41m\u001B[30m";

    // Walls: Dim Purple/Magenta (Unnatural, eerie environment)
    public static final String WALL_COLOR = "\u001B[35m";

    // Traps: Toxic Green (Slime or Poison)
    public static final String TRAP_COLOR = "\u001B[32m";

    private List<Position> activeTraps = new ArrayList<>(); //list koordinat trap
    private Map<Position, Trap> trapQuestions = new HashMap<>(); //koordinat trap ditentuin dulu, Q nanti
    private List<String[]> questionBank = Arrays.asList(
            new String[]{"Apakah binary tree selalu memiliki maksimal 2 anak per node? (y/n)","y"},
            new String[]{"DFS mengeksplorasi node berdasarkan level sebelum menyelam lebih dalam. Benar? (y/n)","n"},
            new String[]{"BFS mengeksplorasi node sedalam mungkin sebelum pindah ke level berikutnya. Benar? (y/n)","n"},
            new String[]{"Queue mengikuti prinsip LIFO (Last In First Out). Benar? (y/n)","n"},
            new String[]{"Stack mengikuti prinsip FIFO (First In First Out). Benar? (y/n)","n"},
            new String[]{"Apakah tree selalu memiliki siklus? (y/n)", "n"},
            new String[]{"Apakah graph bisa bersifat terarah maupun tak terarah? (y/n)", "y"},
            new String[]{"Linked list memungkinkan akses elemen secara langsung (random access). Benar? (y/n)", "n"},
            new String[]{"Queue cocok digunakan untuk BFS. Benar? (y/n)", "y"},
            new String[]{"Stack cocok digunakan untuk DFS. Benar? (y/n)", "y"},
            new String[]{"Binary Search hanya bekerja pada data yang sudah terurut. Benar? (y/n)", "y"},
            new String[]{"Heap adalah struktur data yang selalu terurut secara penuh dari kiri ke kanan. Benar? (y/n)", "n"},
            new String[]{"Merge Sort memiliki kompleksitas waktu O(n log n). Benar? (y/n)", "y"},
            new String[]{"Bubble Sort selalu lebih cepat dari Insertion Sort. Benar? (y/n)", "n"},
            new String[]{"Hash table dapat mengalami collision. Benar? (y/n)", "y"}

    );

    public boolean isWalkable(int x,int y){

        return x>=0 && y>=0 && x<ROW && y<COL && grid[x][y]!='|'
                ; //xy gaboleh negatif n harus di dalem row col n xy ga boleh = |
    }

    public void render(Player player, Monster monster){
        // Unicode for a solid block
        final String BLOCK = "\u2588\u2588";

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){

                // 1. Player (Ghostly Cyan)
                // We use "@ " to keep it 2 chars wide like the walls
                if(player.pos.x == i && player.pos.y == j) { //koor grid = player = true
                    System.out.print(PLAYER_COLOR + "<>" + RESET);
                }

                // 2. Monster (Red Background)
                // "M " is 2 chars wide
                else if(monster.pos.x == i && monster.pos.y == j) {
                    System.out.print(MONSTER_COLOR + "XX" + RESET);
                }

                // 3. Trap (Green Spikes)
                else if(isTrap(i, j)) {
                    System.out.print(TRAP_COLOR + "^^" + RESET);
                }

                // 4. Walls vs Empty Space
                else {
                    if(grid[i][j] == '|') {
                        // This prints two solid blocks side-by-side
                        System.out.print(WALL_COLOR + BLOCK + RESET);
                    } else {
                        // Two spaces to match the width of the blocks
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean isTrap(int x,int y) { //cek apakah posisi itu posisi traap
        for (int i = 0; i < activeTraps.size(); i++) {
            Position t = activeTraps.get(i); //ngecek 1 1 trap
            if (t.x == x && t.y == y) {
                return true; //berarti itu trap di posisi itu
            }
        }
        return false;
    }

    //atas → kalau bisa, taruh trap di situ
    //kalau tidak bisa → coba bawah
    //kalau tidak bisa → coba kiri
    //kalau tidak bisa → coba kanan
    public void spawnTrap(Player player){
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}}; // atas bawah kiri kanan trap
        for(int i = 0; i < dirs.length; i++) {
            int[] d = dirs[i]; // ambil arah ke-i

            int nx = player.pos.x + d[0] * 3; //misal i 0, -1*3 = -3
            int ny = player.pos.y + d[1] * 3;

            if(nx >= 0 && ny >= 0 && nx < ROW && ny < COL && isWalkable(nx, ny) && !isTrap(nx, ny)) { //koor gblh -, row col smape 14,dll)
                Position trapPos = new Position(nx, ny); //spawn
                String[] qa = questionBank.get(new Random().nextInt(questionBank.size())); //bikin angka dari 0 sampai 14, angka random misal = 5 = ambil pertanyaan ke 5.
                trapQuestions.put(trapPos, new Trap(qa[0], qa[1])); //trapPos, qna & qa[0] = pertanyaan qa[1] = jawaban
                activeTraps.add(trapPos); // + trap itu ke daftar trap
                return;
            }
        }
    }

    public void checkTrap(Player player, Scanner sc) {
        for(int i = activeTraps.size() - 1; i >= 0; i--) { //biar bisa diapus pas kita dah lewat
            Position trap = activeTraps.get(i);

            if(trap.equals(player.pos)) { // kalau player menginjak posisi trap
                activeTraps.remove(i); //visual trap
                Trap t = trapQuestions.remove(trap);//apus trap n Q nya biar dirimu ga kena pertanyaan terus
                System.out.println("Dr. Arkam: \"Jawab ini, jika otakmu masih berfungsi...\"\nTrap Question: " + t.question);
                String ans = sc.nextLine().toLowerCase(); // baca answer
                if(!ans.equals(t.answer)) {
                    player.skipTurn = true;
                } else {
                    System.out.println("Dr. Arkam: \"Hmm...jawabanmu benar. Baiklah, jebakan itu kulepas.\"");
                }
            }
        }
    }

    public String getTrapAnswer(Position pos){
        Trap t = trapQuestions.get(pos);
        return t==null? null : t.answer;
    }
}