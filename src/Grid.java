import java.util.*;

class Grid {

    // Ukuran grid permainan
    public static final int ROW = 15, COL = 15;

    // Status visibilitas tile
    boolean[][] visible;
    boolean[][] pernahTerlihat = new boolean[15][15];

    // Representasi visual fog
    public static final String FOG_LIGHT  = "\u001B[38;5;240m░░";
    public static final String FOG_MEDIUM = "\u001B[38;5;238m▒▒";
    public static final String FOG_DARK   = "\u001B[38;5;235m▓▓";

    // Layout peta: '|' = tembok, ' ' = jalan
    public char[][] grid = {
            {'|','|','|','|','|','|','|','|','|','|','|','|','|','|','|'},
            {' ',' ',' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' ','|'},
            {'|',' ','|','|',' ','|',' ','|','|','|','|','|',' ',' ','|'},
            {'|',' ','|',' ',' ','|',' ','|',' ',' ',' ','|','|',' ','|'},
            {'|',' ',' ','|','|','|',' ','|',' ','|',' ','|','|',' ','|'},
            {'|',' ',' ',' ',' ','|',' ','|',' ','|',' ','|',' ',' ','|'},
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

    // Konstruktor: inisialisasi visibilitas awal
    public Grid() {
        visible = new boolean[ROW][COL];
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                visible[i][j] = true;
            }
        }
    }

    // Konstanta warna ANSI untuk tema horror
    public static final String RESET = "\u001B[0m";
    public static final String PLAYER_COLOR  = "\u001B[44m\u001B[97m";
    public static final String MONSTER_COLOR = "\u001B[41m\u001B[30m";
    public static final String WALL_COLOR    = "\u001B[35m";
    public static final String TRAP_COLOR    = "\u001B[32m";

    // Menggelapkan seluruh peta
    void gelapkanSemua() {
        for (int i = 0; i < ROW; i++) {
            Arrays.fill(visible[i], false);
        }
    }

    // Membuka seluruh peta tanpa fog
    void bukaPetaTotal() {
        for (int i = 0; i < ROW; i++) {
            Arrays.fill(visible[i], true);
        }
    }

    // DFS untuk menyebarkan cahaya dari posisi player
    private void cahayaDFS(int x, int y, int depth, boolean[][] visited){
        if(depth > 5) return;
        if(x < 0 || x >= ROW || y < 0 || y >= COL) return;
        if(visited[x][y]) return;

        visible[x][y] = true;
        pernahTerlihat[x][y] = true;

        if(grid[x][y] == '|') return;

        cahayaDFS(x+1, y, depth+1, visited);
        cahayaDFS(x-1, y, depth+1, visited);
        cahayaDFS(x, y+1, depth+1, visited);
        cahayaDFS(x, y-1, depth+1, visited);
    }

    // Mengatur sistem pencahayaan berdasarkan giliran
    public void aturCahaya(Player player, int langkah){
        if(langkah == 1 || langkah % 5 == 0){
            bukaPetaTotal();
            return;
        }

        gelapkanSemua();
        boolean[][] visited = new boolean[ROW][COL];
        cahayaDFS(player.pos.x, player.pos.y, 0, visited);
    }

    // Struktur data untuk trap aktif dan pertanyaannya
    private List<Position> activeTraps = new ArrayList<>();
    private Map<Position, Trap> trapQuestions = new HashMap<>();

    // Bank pertanyaan trap
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

    // Mengecek apakah tile dapat dilewati
    public boolean isWalkable(int x,int y){
        return x>=0 && y>=0 && x<ROW && y<COL && grid[x][y]!='|';
    }

    // Menampilkan peta ke layar
    public void render(Player player, Monster monster, int langkah){
        final String BLOCK = "\u2588\u2588";

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){

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

                if(player.pos.x == i && player.pos.y == j) {
                    System.out.print(PLAYER_COLOR + "<>" + RESET);
                } else if(isTrap(i, j)) {
                    System.out.print(TRAP_COLOR + "^^" + RESET);
                } else if(grid[i][j] == '|') {
                    System.out.print(WALL_COLOR + BLOCK + RESET);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Mengecek apakah posisi tertentu adalah trap
    public boolean isTrap(int x,int y) {
        for (int i = 0; i < activeTraps.size(); i++) {
            Position t = activeTraps.get(i);
            if (t.x == x && t.y == y) return true;
        }
        return false;
    }

    // Mengurangi durasi trap setiap giliran
    public void updateTrapDurations() {
        for (int i = activeTraps.size() - 1; i >= 0; i--) {
            Position pos = activeTraps.get(i);
            Trap t = trapQuestions.get(pos);

            if (t != null) {
                t.timer--;
                if (t.timer <= 0) {
                    activeTraps.remove(i);
                    trapQuestions.remove(pos);
                }
            }
        }
    }

    // Menentukan posisi spawn trap di sekitar player
    public void spawnTrap(Player player){
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int i = 0; i < dirs.length; i++) {
            int[] d = dirs[i];
            int nx = player.pos.x + d[0] * 3;
            int ny = player.pos.y + d[1] * 3;

            if(nx >= 0 && ny >= 0 && nx < ROW && ny < COL && isWalkable(nx, ny) && !isTrap(nx, ny)) {
                Position trapPos = new Position(nx, ny);
                String[] qa = questionBank.get(new Random().nextInt(questionBank.size()));
                trapQuestions.put(trapPos, new Trap(qa[0], qa[1]));
                activeTraps.add(trapPos);
                return;
            }
        }
    }

    // Mengecek dan memproses trap yang diinjak player
    public void checkTrap(Player player, Scanner sc) {
        for(int i = activeTraps.size() - 1; i >= 0; i--) {
            Position trap = activeTraps.get(i);

            if(trap.equals(player.pos)) {
                System.out.println();
                System.out.println(" ████████ ██████   █████  ██████   ██   ██ ");
                System.out.println("    ██    ██   ██ ██   ██ ██   ██  ██   ██ ");
                System.out.println("    ██    ██████  ███████ ██████   ██   ██ ");
                System.out.println("    ██    ██   ██ ██   ██ ██            ");
                System.out.println("    ██    ██   ██ ██   ██ ██        ██   ██ ");
                System.out.println();

                activeTraps.remove(i);
                Trap t = trapQuestions.remove(trap);

                System.out.println("Dr. Arkam: \"Jawab ini, jika otakmu masih berfungsi...\"\nTrap Question: " + t.question);
                String ans = sc.nextLine().toLowerCase();

                if(!ans.equals(t.answer)) {
                    player.skipTurn = true;
                } else {
                    System.out.println("Dr. Arkam: \"Hmm...jawabanmu benar. Baiklah, jebakan itu kulepas.\"");
                }
            }
        }
    }
}
