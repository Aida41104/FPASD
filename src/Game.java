import java.util.*;
public class Game {
    public static void main(String[] args){
        int langkah = 1;
        Grid grid = new Grid(); //instantiates your game board.
        Player player = new Player(1,0); //spawn elmeen
        Monster monster = new Monster(9,9);
        Scanner sc = new Scanner(System.in); //y/n

        boolean storyShown = false;
        boolean ready = false;

        if(!storyShown){
            System.out.println("\n \nDr. Arkam dulunya adalah ilmuwan jenius yang terobsesi menciptakan “otak sempurna”.\n" +
                    "Ia percaya bahwa kecerdasan manusia terlalu mudah rapuh, terlalu emosional, dan terlalu mudah salah.\n" +
                    "Karena itu, ia membangun Labirin Pengetahuan—tempat untuk menguji kecerdasan seseorang.\n" +
                    "\n" +
                    "Menurut catatan gilanya, hanya manusia yang mampu menjawab pertanyaan logika,\n" +
                    "struktur data, dan algoritma dengan cepat yang dianggap “layak dipertahankan”.\n" +
                    "Siapa pun yang gagal... dianggap cacat dan akan menjadi santapan monster.\n" +
                    "\n" +
                    "Kamu adalah salah satu 'subjek uji coba'-nya.\n" +
                    "Dr. Arkam sengaja menjebakmu di dalam labirinnya yang menyeramkan, sambil melepaskan:\n" +
                    "monster yang haus darah.\n" + "\nDr. Arkam telah menaruh jebakan pertanyaan yang harus dijawab dengan benar" +
                    "\nJika kamu salah menjawab, maka kamu akan terkena racun yang membuatmu tidak dapat bergerak untuk satu turn" +
                    "\nTujuanmu sederhana, gerakkan dirimu dengan W/A/S/D untuk keluar dari labirin ini dengan selamat!! \nJangan biarkan monster menyentuhmu\n");
            storyShown = true;
        }

        while(true){
            grid.aturCahaya(player, langkah);

            grid.render(player,monster, langkah); //visual player n monster

            if(!ready){
                System.out.println("\n\nDr. Arkam: \"Selamat datang, subjek uji coba baru...\"\n" +
                        "Dr. Arkam: \"Labirin Pengetahuan ini akan menguji apakah otakmu layak dipertahankan.\"\n" +
                        "Dr. Arkam: \"Monster kesayanganku sudah bangun... mari kita lihat seberapa lama kau bertahan.\"\n");
                ready = true;
            }

            if(player.pos.equals(new Position(14,13))){ //koordinat finish
                System.out.println("YOU WIN!!!!!!! \nDr. Arkam: \"Selamat otakmu layak untuk hidupd!\"");
                break;
            }
            if(player.pos.equals(monster.pos)){
                System.out.println("GAME OVER!!\nDr. Arkam: \"Seharusnya kau tahu...\"\n" +
                        "Dr. Arkam: \"Hanya otak yang layak yang bisa bertahan.\"\n" +
                        "Dr. Arkam: \"Sisanya akan disantap oleh monsterku.\"");
                break;
            }


            grid.spawnTrap(player); //spawn trap. misal Player di (5,5) Trap muncul di (5,8)
            player.move(grid);//wasd gerak
            grid.checkTrap(player, sc); //player nginjek trap ga?
            monster.moveTowards(player, grid); // m grk 1 langkah

            //hitung ulang fog setelah semua bergerak
            grid.aturCahaya(player, langkah);

            langkah++;
            System.out.println();
        }
    }
}