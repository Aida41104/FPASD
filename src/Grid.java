import java.util.*;
class Grid {
    public static final int ROW = 15, COL = 15;
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

    private List<Position> activeTraps = new ArrayList<>();
    private Map<Position, Trap> trapQuestions = new HashMap<>();
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
        return x>=0 && y>=0 && x<ROW && y<COL && grid[x][y]!='|';
    }

    public void render(Player player, Monster monster){
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){

                // 1. Player: Represented as a 'Soul' (@)
                if(player.pos.x == i && player.pos.y == j) {
                    System.out.print(PLAYER_COLOR + "@ " + RESET);
                }

                // 2. Monster: Represented as a solid block or a sharp character (M)
                // The background color will make this tile look like a "warning light"
                else if(monster.pos.x == i && monster.pos.y == j) {
                    System.out.print(MONSTER_COLOR + "M " + RESET);
                }

                // 3. Trap: Represented as a spike (^)
                else if(isTrap(i, j)) {
                    System.out.print(TRAP_COLOR + "^ " + RESET);
                }

                // 4. Walls
                else {
                    if(grid[i][j] == '|') {
                        System.out.print(WALL_COLOR + "¦ " + RESET); // Changed '|' to broken bar '¦' for texture
                    } else {
                        System.out.print("  "); // Empty space (Darkness)
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean isTrap(int x,int y){
        for(Position t:activeTraps) if(t.x==x && t.y==y) return true;
        return false;
    }

    public void spawnTrap(Player player){
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] d: dirs){
            int nx = player.pos.x + d[0]*3;
            int ny = player.pos.y + d[1]*3;
            if(nx>=0 && ny>=0 && nx<ROW && ny<COL && isWalkable(nx,ny) && !isTrap(nx,ny)){
                Position trapPos = new Position(nx,ny);
                String[] qa = questionBank.get(new Random().nextInt(questionBank.size()));
                trapQuestions.put(trapPos, new Trap(qa[0], qa[1]));
                activeTraps.add(trapPos);
                return; // spawn 1 trap per turn
            }
        }
    }

    public void checkTrap(Player player, Scanner sc){
        Iterator<Position> it = activeTraps.iterator();
        while(it.hasNext()){
            Position trap = it.next();
            if(trap.equals(player.pos)){
                it.remove();
                Trap t = trapQuestions.remove(trap);
                System.out.println("Trap Question: "+t.question);
                String ans = sc.nextLine().toLowerCase();
                if(!ans.equals(t.answer)){
                    player.skipTurn = true; // skip turn
                    System.out.println("turn berikutnya terlewat!");
                } else System.out.println("Jawaban benar! Lanjut...");
            }
        }
    }

    public String getTrapAnswer(Position pos){
        Trap t = trapQuestions.get(pos);
        return t==null? null : t.answer;
    }
}