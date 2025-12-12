import java.util.*;
class Grid {
    public static final int ROW = 15, COL = 15; //grid nya 15 x 15
    boolean[][] visible;
    boolean[][] pernahTerlihat = new boolean[15][15];
    public static final String FOG_LIGHT  = "\u001B[38;5;240m░░";
    public static final String FOG_MEDIUM = "\u001B[38;5;238m▒▒";
    public static final String FOG_DARK   = "\u001B[38;5;235m▓▓";


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

    public Grid() {
        visible = new boolean[ROW][COL];


        // default: semua jadi true biar turn pertama tidak fog
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                visible[i][j] = true;
            }
        }
    }

    // horror but colorful atheme constants
    public static final String RESET = "\u001B[0m";

    // player: a bright, ghostly cyan (like a lost soul)
    public static final String PLAYER_COLOR = "\u001B[44m\u001B[97m";

    // monster: red background with black text (intense contrast)
    public static final String MONSTER_COLOR = "\u001B[41m\u001B[30m";

    // walls: dim purple/magenta (for an unnatural & eerie environment)
    public static final String WALL_COLOR = "\u001B[35m";

    // traps: Toxic Green (slime or poison)
    public static final String TRAP_COLOR = "\u001B[32m";


    void gelapkanSemua() {
        for (int i = 0; i < ROW; i++) {
            Arrays.fill(visible[i], false);
        }
    }

    void bukaPetaTotal() {
        for (int i = 0; i < ROW; i++) {
            Arrays.fill(visible[i], true);
        }
    }

    private void cahayaDFS(int x, int y, int depth, boolean[][] visited){
        if(depth > 5) return; //jarak DFS dari player
        if(x < 0 || x >= ROW || y < 0 || y >= COL) return; //Cek keluar batas grid
        if(visited[x][y]) return; //Cegah infinite recursion

        visible[x][y] = true;
        pernahTerlihat[x][y] = true; //Tandai tile sebagai terlihat

        if(grid[x][y] == '|') return; // wall terlihat tapi tidak ditembus

        //DFS menjelajah sampai kedalaman maksimum.
        cahayaDFS(x+1, y, depth+1, visited);
        cahayaDFS(x-1, y, depth+1, visited);
        cahayaDFS(x, y+1, depth+1, visited);
        cahayaDFS(x, y-1, depth+1, visited);
    }



    public void aturCahaya(Player player, int langkah){

        // TURN 1 & TURN KELIPATAN 5 → FULL MAP
        if(langkah == 1 || langkah % 5 == 0){
            bukaPetaTotal();  // light[][] = true semua
            return;
        }


        // TURN LAIN → radius 5
        gelapkanSemua(); // light[][] = false semua

        boolean[][] visited = new boolean[ROW][COL];
        cahayaDFS(player.pos.x, player.pos.y, 0, visited);
    }





    private List<Position> activeTraps = new ArrayList<>(); //list koordinat trap
    private Map<Position, Trap> trapQuestions = new HashMap<>(); //koordinat trap ditentuin dulu, Q nanti
    private List<String[]> questionBank = Arrays.asList(
            new String[]{"Apakah binary tree selalu memiliki maksimal 2 anak per node? (y/n)","y"},
            new String[]{"DFS mengeksplorasi node berdasarkan level sebelum menyelam lebih dalam. Benar? (y/n)","n"},
            new String[]{"BFS mengeksplorasi node sedalam mungkin sebelum pindah ke level berikutnya. Benar? (y/n)","n"},
            new String[]{"Queue mengikuti prinsip LIFO (Last In First Out). Benar? (y/n)","n"},
            new String[]{"Stack mengikuti prinsip FIFO (First In First Out). Benar? (y/n)","n"},
            new String[]{"Apakah tree selalu medmiliki siklus? (y/n)", "n"},
            new String[]{"Apakah graph bisa bersifat terarah maupun tak terarah? (y/n)", "y"},
            new String[]{"Queue cocok digunakan untuk BFS. Benar? (y/n)", "y"},
            new String[]{"Stack cocok digunakan untuk DFS. Benar? (y/n)", "y"}
    );

    public boolean isWalkable(int x,int y){

        return x>=0 && y>=0 && x<ROW && y<COL && grid[x][y]!='|'
                ; //xy gaboleh negatif n harus di dalem row col n xy ga boleh = |
    }

    public void render(Player player, Monster monster, int langkah){
        final String BLOCK = "\u2588\u2588";

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){

                // ===== MONSTER PALING AWAL =====
                if (monster.pos.x == i && monster.pos.y == j) {
                    if (visible[i][j]) {
                        System.out.print(MONSTER_COLOR + "XX" + RESET);
                    } else if (pernahTerlihat[i][j]) {
                        System.out.print("\u001B[31m░░" + RESET);
                    } else {
                        System.out.print(FOG_DARK + RESET);
                    }
                    continue;
                }

                // ===== FOG UNTUK TILE NON-MONSTER =====
                if (!visible[i][j]) {
                    int level = langkah % 3;
                    String fogColor = switch(level) {
                        case 0 -> FOG_DARK;
                        case 1 -> FOG_MEDIUM;
                        case 2 -> FOG_LIGHT;
                        default -> FOG_DARK;
                    };
                    System.out.print(fogColor + RESET);
                    continue;
                }

                // ===== TILE TERLIHAT NORMAL =====
                if(player.pos.x == i && player.pos.y == j) {
                    System.out.print(PLAYER_COLOR + "<>" + RESET);
                } else if(isTrap(i, j)) {
                    System.out.print(TRAP_COLOR + "^^" + RESET);
                } else if(grid[i][j] == '|') {
                    System.out.print(WALL_COLOR + BLOCK + RESET);
                } else {
                    System.out.print("  "); // empty space tetap 2 karakter
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

    public void updateTrapDurations() {
        // Iterate backwards so we can safely remove items while looping
        for (int i = activeTraps.size() - 1; i >= 0; i--) {
            Position pos = activeTraps.get(i);
            Trap t = trapQuestions.get(pos);

            if (t != null) {
                t.timer--; // Decrease life by 1

                // If time runs out
                if (t.timer <= 0) {
                    activeTraps.remove(i);      // Remove location from list
                    trapQuestions.remove(pos);  // Remove data from map

                    // Optional: visual cue that a trap disappeared
                    // System.out.println("Warning: A trap signal has faded...");
                }
            }
        }
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
}