import java.util.*;

public class Game {
    public static void main(String[] args){

        // Memulai backsound game
        BackgroundMusic bg = new BackgroundMusic();

        // Inisialisasi variabel utama permainan
        int langkah = 1;
        Grid grid = new Grid();
        Player player = new Player(1,0);
        Monster monster = new Monster(9,9);
        Scanner sc = new Scanner(System.in);

        // Penanda tampilan story dan dialog awal
        boolean storyShown = false;
        boolean ready = false;

        // Menampilkan opening story sekali di awal game
        if(!storyShown){
            System.out.println();
            System.out.println(" ██     ██ ███████ ██      ██████   ██████  ███    ███ ███████ ");
            System.out.println(" ██     ██ ██      ██     ██       ██    ██ ████  ████ ██      ");
            System.out.println(" ██  █  ██ █████   ██     ██       ██    ██ ██ ████ ██ █████   ");
            System.out.println(" ██ ███ ██ ██      ██     ██       ██    ██ ██  ██  ██ ██      ");
            System.out.println("  ███ ███  ███████ ███████ ██████   ██████  ██      ██ ███████ ");
            System.out.println();

            System.out.println(
                    "\n \nDr. Arkam dulunya adalah ilmuwan jenius yang terobsesi menciptakan “otak sempurna”.\n" +
                            "Ia percaya bahwa kecerdasan manusia terlalu mudah rapuh, terlalu emosional, dan terlalu mudah salah.\n" +
                            "Karena itu, ia membangun Labirin Pengetahuan—tempat untuk menguji kecerdasan seseorang.\n\n" +
                            "Menurut catatan gilanya, hanya manusia yang mampu menjawab pertanyaan logika,\n" +
                            "struktur data, dan algoritma dengan cepat yang dianggap “layak dipertahankan”.\n" +
                            "Siapa pun yang gagal... dianggap cacat dan akan menjadi santapan monster.\n\n" +
                            "Kamu adalah salah satu 'subjek uji coba'-nya.\n" +
                            "Dr. Arkam sengaja menjebakmu di dalam labirinnya yang menyeramkan,\n" +
                            "sambil melepaskan monster yang haus darah.\n\n" +
                            "Jika kamu salah menjawab jebakan pertanyaan,\n" +
                            "kamu akan kehilangan satu giliran.\n\n" +
                            "Gerakkan dirimu dengan W/A/S/D dan keluarlah dari labirin dengan selamat!\n"
            );

            storyShown = true;
        }

        // Game loop utama
        while(true){

            // Mengatur pencahayaan berdasarkan posisi player dan turn
            grid.aturCahaya(player, langkah);

            // Menampilkan grid, player, monster, dan fog
            grid.render(player, monster, langkah);

            // Menampilkan dialog awal hanya sekali
            if(!ready){
                System.out.println(
                        "\n\nDr. Arkam: \"Selamat datang, subjek uji coba baru...\"\n" +
                                "Dr. Arkam: \"Labirin Pengetahuan ini akan menguji apakah otakmu layak dipertahankan.\"\n" +
                                "Dr. Arkam: \"Monster kesayanganku sudah bangun... mari kita lihat seberapa lama kau bertahan.\"\n"
                );
                ready = true;
            }

            // Kondisi menang (player mencapai titik keluar)
            if(player.pos.equals(new Position(14,13))){
                System.out.println();
                System.out.println(" ██    ██  ██████  ██    ██     ██     ██ ██ ███    ██ ");
                System.out.println("  ██  ██  ██    ██ ██    ██     ██     ██ ██ ████   ██ ");
                System.out.println("   ████   ██    ██ ██    ██     ██  █  ██ ██ ██ ██  ██ ");
                System.out.println("    ██    ██    ██ ██    ██     ██ ███ ██ ██ ██  ██ ██ ");
                System.out.println("    ██     ██████   ██████       ███ ███  ██ ██   ████ ");
                System.out.println();

                System.out.println("YOU WIN!!!!!!!\nDr. Arkam: \"Selamat, otakmu layak untuk hidup!\"");
                break;
            }

            // Kondisi kalah (monster menyentuh player)
            if(player.pos.equals(monster.pos)){
                System.out.println();
                System.out.println("  ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ");
                System.out.println(" ██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ");
                System.out.println(" ██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ");
                System.out.println(" ██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██ ");
                System.out.println("  ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ");
                System.out.println();

                System.out.println(
                        "GAME OVER!!\n" +
                                "Dr. Arkam: \"Seharusnya kau tahu...\"\n" +
                                "Dr. Arkam: \"Hanya otak yang layak yang bisa bertahan.\"\n" +
                                "Dr. Arkam: \"Sisanya akan disantap oleh monsterku.\""
                );
                break;
            }

            // Urutan logika satu turn permainan
            grid.spawnTrap(player);
            player.move(grid);
            grid.checkTrap(player, sc);
            grid.spawnTrap(player);
            grid.updateTrapDurations();
            monster.moveTowards(player, grid);

            // Update ulang fog setelah semua pergerakan
            grid.aturCahaya(player, langkah);

            langkah++;
            System.out.println();
        }
    }
}
