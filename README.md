# Monster Chase (FInal Project ASD)
Implementasi Algoritma Breadth-First Search dan Depth-First Search dalam Game Labirin Berbasis Java

## Informasi Proyek:
Mata Kuliah: Algoritma dan Struktur Data

Dosen Pengampu: Renny Pradina Kusumawardani

Kelas: D

Kelompok: 10
| No | Nama Lengkap        | NRP     |
| -- | ------------------- | ------- |
| 1  | Ary Ratna Aida Safa | 5026241029 |
| 2  | Izaaz Verdiansyah Khaisan Athif  | 5026241194 |
| 3  | Ghanendra Dzakwan Wiradikusumah  | 5026241127 |
| 4  | Candleline audrina firsta  | 5026221159 |

Link Demo: https://www.youtube.com/watch?v=JreG7UPnVmg

## Latar Belakang

Algoritma dan Struktur Data merupakan salah satu mata kuliah fundamental dalam bidang ilmu komputer yang menuntut kemampuan berpikir logis, terstruktur, dan analitis. Namun, banyak mahasiswa mengalami kesulitan memahami materi Algoritma & Struktur Data karena penyajiannya cenderung abstrak, monoton, dan minim contoh interaktif sehingga konsep seperti graph, sorting, dan tree sering terasa sulit untuk dipahami. Hal ini menyebabkan proses pembelajaran menjadi kurang menarik dan cenderung monoton.

Untuk mengatasi permasalahan tersebut, diperlukan media pembelajaran alternatif yang mampu menyajikan konsep algoritma secara lebih menarik. Salah satu pendekatan yang dapat digunakan adalah game-based learning, di mana konsep algoritma diterapkan langsung ke dalam mekanisme permainan sehingga mahasiswa dapat melihat dan merasakan dampaknya secara nyata.

Berdasarkan latar belakang tersebut, dikembangkanlah Monster Chase, yaitu sebuah game labirin berbasis Java yang mengintegrasikan konsep Algoritma dan Struktur Data ke dalam gameplay. Dalam game ini, algoritma Breadth-First Search (BFS) digunakan untuk menentukan jalur terpendek pergerakan monster dalam mengejar pemain, sedangkan algoritma Depth-First Search (DFS) diterapkan pada sistem Fog untuk membatasi area penglihatan pemain di sekitar posisinya. Selain itu, terdapat mekanisme trap berupa pertanyaan seputar materi Algoritma dan Struktur Data sebagai sarana evaluasi dan penguatan pemahaman konsep. Melalui gameplay yang menantang serta trap berisi pertanyaan materi ASD, game ini membantu mahasiswa belajar secara lebih aktif, kontekstual, dan menyenangkan tanpa terasa seperti pembelajaran formal.

Dengan menggabungkan elemen permainan, visualisasi algoritma, dan interaksi langsung, Monster Chase diharapkan dapat menjadi media pembelajaran yang lebih menarik, interaktif, dan efektif, serta membantu mahasiswa memahami penerapan Algoritma dan Struktur Data secara lebih mendalam tanpa terasa seperti pembelajaran formal konvensional.

## Solusi yang Ditawarkan

Sebagai solusi atas permasalahan pembelajaran Algoritma dan Struktur Data yang cenderung abstrak dan kurang interaktif, dikembangkan sebuah game edukatif berbasis console berjudul Monster Chase. Game ini dirancang sebagai media pembelajaran alternatif yang mengintegrasikan konsep Algoritma dan Struktur Data secara langsung ke dalam mekanisme permainan, sehingga pengguna dapat memahami penerapan algoritma melalui pengalaman bermain.

Pada game Monster Chase, game ini dilengkapi dengan mekanisme trap berupa pertanyaan seputar materi Algoritma dan Struktur Data yang berfungsi sebagai sarana evaluasi pemahaman pemain. Jawaban yang diberikan pemain akan mempengaruhi jalannya permainan, sehingga mendorong pemain untuk berpikir kritis dan memahami materi secara aktif

Selain itu, algoritma Breadth-First Search (BFS) diterapkan untuk menentukan jalur terpendek pergerakan monster dalam mengejar pemain, sehingga merepresentasikan konsep pathfinding pada struktur graph tanpa bobot. Sementara itu, algoritma Depth-First Search (DFS) digunakan dalam sistem Fog of War untuk membuka area penglihatan pemain di sekitar posisinya dengan batas kedalaman tertentu, sehingga memberikan visualisasi eksplorasi ruang berbasis traversal. Dengan mengombinasikan elemen permainan, visualisasi algoritma, serta interaksi langsung, Monster Chase diharapkan mampu meningkatkan minat belajar serta pemahaman mahasiswa terhadap konsep Algoritma dan Struktur Data secara lebih efektif dan kontekstual.

## Fitur Utama
Game Monster Chase memiliki beberapa fitur utama yang dirancang untuk mendukung proses pembelajaran Algoritma dan Struktur Data secara interaktif dan kontekstual, yaitu sebagai berikut:

1. Eksplorasi Labirin Berbasis Grid
Permainan berlangsung pada labirin berukuran 15×15 yang direpresentasikan dalam bentuk matriks dua dimensi. Pemain dapat bergerak menggunakan kontrol W, A, S, dan D dengan batasan tembok sebagai penghalang, sehingga merepresentasikan konsep navigasi pada struktur data grid.

2. Pergerakan Monster dengan Jalur Terpendek
Monster bergerak secara otomatis untuk mengejar pemain menggunakan algoritma Breadth-First Search (BFS). Algoritma ini memastikan monster selalu memilih jalur terpendek menuju posisi pemain, sehingga memberikan simulasi penerapan pathfinding pada struktur graph tanpa bobot.

3. Sistem Fog of War Dinamis
Game menerapkan sistem Fog of War yang membatasi area penglihatan pemain. Algoritma Depth-First Search (DFS) digunakan untuk membuka area di sekitar posisi pemain dengan kedalaman tertentu, sementara pada turn tertentu seluruh peta akan terbuka sementara. Fitur ini memberikan visualisasi langsung proses traversal pada struktur data.

4. Mekanisme Trap Berbasis Pertanyaan
Terdapat trap yang berisi pertanyaan seputar materi Algoritma dan Struktur Data. Ketika pemain menginjak trap, pemain harus menjawab pertanyaan tersebut. Jawaban yang salah akan memberikan penalti berupa kehilangan satu giliran, sehingga mendorong pemain untuk memahami materi secara aktif.

5. Sistem Evaluasi dan Interaksi Turn-Based
Permainan bersifat turn-based, di mana setiap aksi pemain diikuti dengan pergerakan monster. Mekanisme ini memungkinkan alur permainan yang terkontrol serta memudahkan visualisasi perubahan keadaan permainan pada setiap langkah.

6. Kondisi Menang dan Kalah yang Jelas
Permainan memiliki kondisi menang apabila pemain berhasil mencapai titik keluar labirin, serta kondisi kalah apabila pemain tertangkap oleh monster. Fitur ini memberikan tujuan permainan yang jelas dan meningkatkan tantangan selama proses bermain.

7. Audio Latar untuk Mendukung Atmosfer Permainan
Game dilengkapi dengan background music yang berjalan secara berulang untuk mendukung suasana permainan dan meningkatkan pengalaman pengguna selama bermain.

## Gameplay  
Game Monster Chase dimainkan secara turn-based pada grid berukuran 15 × 15. Setiap satu input pemain dihitung sebagai 1 turn, kemudian sistem akan memperbarui kondisi permainan secara berurutan. Setiap turn berlangsung dengan urutan berikut:  

1. Pengaturan Cahaya (Fog)

   * Pada turn pertama dan setiap kelipatan 5, seluruh map terbuka.
   * Pada turn lainnya, map digelapkan dan hanya area sekitar player yang terlihat menggunakan DFS dengan batas kedalaman tertentu.

2. Render Tampilan

   * Player, monster, tembok, trap, dan efek fog ditampilkan di console.
   * Tile yang pernah terlihat akan ditampilkan lebih redup untuk memberi jejak eksplorasi.

3. Cek Kondisi Menang/Kalah

   * Menang: Player mencapai koordinat tujuan `(14,13)`
   * Kalah: Monster berada pada posisi yang sama dengan player

4. Spawn Trap

   * Trap akan muncul pada jarak tertentu dari posisi player.
   * Setiap trap membawa satu pertanyaan Algoritma dan Struktur Data.

5. Gerakan Player

   * Player menggerakkan karakter menggunakan input:

     * `W` → atas
     * `A` → kiri
     * `S` → bawah
     * `D` → kanan
   * Player hanya dapat bergerak ke tile yang bukan tembok.

6. Interaksi Trap

   * Jika player menginjak trap:

     * Sistem menampilkan pertanyaan
     * Player harus menjawab dengan `y` atau `n`
     * Jawaban salah → player kehilangan 1 turn berikutnya
     * Jawaban benar → trap dinonaktifkan

7. Manajemen Trap

   * Trap memiliki durasi hidup terbatas
   * Trap yang tidak diinjak akan otomatis menghilang setelah beberapa turn

8. Pergerakan Monster

   * Monster bergerak 1 langkah per turn
   * Jalur yang dipilih adalah jalur terpendek menuju player menggunakan Breadth-First Search (BFS)

9. Update Turn

   * Nilai turn (`langkah`) bertambah
   * Siklus gameplay kembali ke awal

## Mekanisme Utama Gameplay

1. Player

* Dikendalikan manual oleh pemain
* Dapat kehilangan giliran jika salah menjawab trap
* Tujuan utama: keluar dari labirin sebelum tertangkap monster

2. Monster

* Bergerak otomatis
* Selalu mengejar player
* Menggunakan BFS untuk memastikan pergerakan optimal
* Memberi tekanan waktu kepada pemain

3. Fog of War

* Membatasi visibilitas player
* Diimplementasikan menggunakan DFS
* Membuat pemain tidak bisa melihat seluruh map setiap saat
* Menambah unsur ketegangan dan strategi

4. Trap Pertanyaan

* Berisi pertanyaan seputar:

  * BFS & DFS
  * Stack & Queue
  * Tree & Graph
* Mendorong pemain berpikir cepat di bawah tekanan
* Kesalahan berdampak langsung pada gameplay

5. Kondisi Akhir Permainan

* Win
  Player berhasil mencapai titik keluar tanpa tersentuh monster.

* Game Over
  Monster berhasil menyentuh player sebelum player keluar dari labirin.

## Tujuan Gameplay

Gameplay dirancang agar pemain:

* Mengambil keputusan cepat
* Memahami konsekuensi dari setiap langkah
* Melihat langsung penerapan algoritma dalam sistem game
* Belajar Algoritma dan Struktur Data melalui pengalaman interaktif


##  Algoritma yang Digunakan

Pada pengembangan game Monster Chase, beberapa algoritma dari mata kuliah Algoritma dan Struktur Data diterapkan secara langsung ke dalam mekanisme permainan. Setiap algoritma memiliki peran spesifik yang mendukung fitur dan alur permainan sebagai berikut.

1. Breadth-First Search (BFS)  
   Algoritma Breadth-First Search (BFS) digunakan untuk mengatur pergerakan monster dalam mengejar pemain. BFS bekerja dengan menjelajahi node secara bertahap berdasarkan jarak terdekat (level by level), sehingga menjamin ditemukannya jalur terpendek pada struktur graph tanpa bobot.  
   
   A. Tujuan: Menentukan jalur terpendek monster menuju pemain  
   B. Struktur Data Pendukung: Queue, array jarak (distance), dan array parent   
   C. Implementasi pada Kode:Monster.moveTowards(Player player, Grid grid)  
   D. Dalam implementasinya, BFS ini bekerja sebagia berikut:  
      * Dimulai dari posisi monster.
      * Menjelajah grid secara level-by-level.
      * BFS menyimpan parent untuk setiap tile, sehingga bisa ditelusuri kembali jalurnya.
      * Ketika BFS mencapai posisi pemain, BFS berhenti.
      * Monster menelusuri kembali jalur terpendek dari player ke parent hingga menemukan langkah berikutnya.
   
   
2. Depth-First Search (DFS)  
   Algoritma Depth-First Search (DFS) digunakan dalam sistem Fog untuk mengatur area penglihatan pemain. DFS bekerja dengan menelusuri satu jalur secara mendalam hingga mencapai batas tertentu sebelum berpindah ke jalur lain, sehingga sesuai untuk mensimulasikan penyebaran cahaya di sekitar pemain.
   
   A. Tujuan: Membuka area penglihatan pemain di sekitar posisinya  
   B. Struktur Data Pendukung: Rekursi (implicit stack) dan array visited  
   C. Implementasi pada Kode: Grid.cahayaDFS(int x, int y, int depth, boolean[][] visited)  
   D. Keterangan tambahan: Pada turn ke-1 dan setiap turn ke-5, seluruh peta akan terbuka sementara sebagai efek “vision burst”.  
   E. Cara kerja:  
      * Fungsi DFS dipanggil dari posisi player.
      * DFS menyebar ke empat arah (atas, bawah, kiri, kanan).
      * Kedalaman dibatasi hingga radius tertentu (depth ≤ 5).
      * Jika menemukan tembok, DFS berhenti di arah itu.
      * Tile yang dilewati DFS menjadi terlihat (visible).  

4. Linear Search  
   Algoritma Linear Search digunakan untuk mengecek keberadaan trap pada posisi tertentu di dalam labirin. Pencarian dilakukan dengan menelusuri daftar trap yang aktif satu per satu hingga ditemukan kecocokan posisi.  

   A. Tujuan: Mengecek apakah suatu posisi merupakan lokasi trap  
   B. Struktur Data Pendukung: List (ArrayList)  
   C. Implementasi pada Kode: Grid.isTrap(int x, int y); Grid.checkTrap(Player player, Scanner sc)  


## Struktur Data yang Digunakan  

Dalam pengembangan game Monster Chase, beberapa struktur data digunakan untuk mendukung mekanisme permainan serta implementasi algoritma Algoritma dan Struktur Data. Pemilihan struktur data disesuaikan dengan kebutuhan efisiensi akses, pengelolaan data, dan kemudahan implementasi algoritma.  

1. Array Dua Dimensi (char[][])  
   * Struktur data array dua dimensi digunakan untuk merepresentasikan peta labirin permainan yang berukuran 15×15. Setiap elemen array menyimpan informasi mengenai kondisi suatu tile, seperti jalur kosong atau tembok.
   * Fungsi: Representasi dunia permainan (labirin)
   * Keunggulan: Akses langsung ke setiap tile dengan kompleksitas waktu O(1)
   * Implementasi pada Kode: Grid.grid  

2. Class Object (Position, Player, Monster, Trap)  
   * Beberapa class object digunakan untuk merepresentasikan entitas utama dalam permainan.
   * Position digunakan untuk menyimpan koordinat posisi dalam bentuk pasangan (x, y).
   * Player merepresentasikan karakter pemain.
   * Monster merepresentasikan musuh yang mengejar pemain.
   * Trap menyimpan informasi pertanyaan, jawaban, dan durasi jebakan.
   * Penggunaan class object membantu memisahkan data dan logika, sehingga kode menjadi lebih terstruktur dan mudah dipahami.  

3. Queue (LinkedList)  
   * Struktur data Queue digunakan dalam implementasi algoritma Breadth-First Search (BFS) pada pergerakan monster.
   * Fungsi: Menyimpan daftar posisi yang akan diproses dalam BFS
   * Karakteristik: First In First Out (FIFO)
   * Implementasi pada Kode: Queue<Position> q = new LinkedList<>();   

4. Array Jarak dan Parent (int[][], Position[][])  
   Untuk mendukung BFS, digunakan:  
      * int[][] dist untuk menyimpan jarak dari posisi monster ke setiap tile
      * Position[][] parent untuk menyimpan asal pergerakan tiap tile
      * Struktur ini memungkinkan rekonstruksi jalur terpendek yang akan dilalui monster menuju pemain.
      * Implementasi pada Kode: Monster.moveTowards(Player player, Grid grid)  

5. ArrayList (List<Position>)  
   * Struktur data ArrayList digunakan untuk menyimpan daftar trap yang sedang aktif di dalam permainan.
   * Fungsi: Menyimpan dan mengelola koordinat trap aktif
   * Keunggulan: Mudah ditambah dan dihapus secara dinamis
   * Kompleksitas Pencarian: O(n) (linear search)
   * Implementasi pada Kode: List<Position> activeTraps   

6. HashMap (Map<Position, Trap>)  
   * Struktur data HashMap digunakan untuk memetakan posisi trap dengan data pertanyaan yang terkait.
   * Fungsi: Menghubungkan koordinat trap dengan objek Trap
   * Keunggulan: Akses data dengan kompleksitas waktu O(1)
   * Implementasi pada Kode: Map<Position, Trap> trapQuestions  

7. Array Boolean (boolean[][])  
   * Array boolean digunakan untuk mendukung sistem Fog.
   * boolean[][] visible digunakan untuk menandai tile yang sedang terlihat oleh pemain
   * boolean[][] pernahTerlihat digunakan untuk menandai tile yang pernah terlihat sebelumnya
   * Struktur ini membantu pengelolaan visibilitas peta secara efisien.
   * Implementasi pada Kode: Grid.visible Grid.pernahTerlihat  

8. List dan Random  
   * Struktur data List digunakan untuk menyimpan kumpulan pertanyaan, sedangkan kelas Random digunakan untuk memilih pertanyaan secara acak saat trap dibuat.
   * Fungsi: Menyediakan variasi pertanyaan dalam permainan
   * Implementasi pada Kode: List<String[]> questionBank, Random  

## Struktur File Penting  
Struktur file pada proyek Monster Chase disusun secara modular untuk memisahkan fungsi dan tanggung jawab setiap komponen, sehingga memudahkan pengembangan, pemeliharaan, dan pemahaman alur program. Berikut adalah file-file utama beserta fungsinya:

| No | Nama File | Deskripsi |
|----|-----------|-----------|
| 1 | `Game.java` | Mengatur alur utama permainan, inisialisasi objek, input pemain, serta kondisi menang dan kalah. |
| 2 | `Grid.java` | Mengelola peta labirin, sistem Fog of War, proses render tampilan, dan manajemen trap. |
| 3 | `Player.java` | Mengatur pergerakan pemain, input kontrol (W/A/S/D), dan mekanisme skip turn. |
| 4 | `Monster.java` | Mengatur pergerakan monster menggunakan algoritma Breadth-First Search (BFS). |
| 5 | `Position.java` | Merepresentasikan koordinat posisi (x, y) yang digunakan oleh seluruh entitas permainan. |
| 6 | `Trap.java` | Menyimpan data jebakan berupa pertanyaan, jawaban, dan durasi trap. |
| 7 | `BackgroundMusic.java` | Mengelola pemutaran musik latar permainan. |  

## Screenshot Program  
Pada bagian ini ditampilkan beberapa tangkapan layar (screenshot) dari game Monster Chase untuk memberikan gambaran visual mengenai tampilan dan mekanisme permainan. Screenshot disertakan sebagai ilustrasi pendukung dan tidak ditampilkan secara berlebihan.  

1. Tampilan Awal Permainan  
   Ini adalah tampilan awal saat kita run, yaitu menampilkan story beserta tampilan awal map dengan player ditandai dengan warna biru, monster dengan warna merah, dan tembok berwarna ungu yang tak dapat dilewati oleh player  
   ![WhatsApp Image 2025-12-14 at 14 33 18](https://github.com/user-attachments/assets/e5f07d2c-00d0-46e6-af61-8b60e1723676)  

   <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/007adeca-a0f9-42a2-b43e-e1b397ea0a45" />  

2. Gerakan Player (W/A/S/D)
   Player dapat bergerak dengan input W untuk ke atas, A untuk ke kiri, S untuk ke bawah, D untuk ke kanan

   Contoh = Player input W untuk ke atas:  
   <img width="366" height="638" alt="image(31)" src="https://github.com/user-attachments/assets/ab8a23ae-7aff-4866-80d3-117bf8783c17" />  

3. Monster Mengejar Player dengan BFS  
   Monster (merah) bergerak menuju player (biru) sebanyak 1 langkah per turn dengan menggunakan BFS agar dapat berjalan mengikuti jalur terdekat menuju player.  
   <img width="473" height="630" alt="image(32)" src="https://github.com/user-attachments/assets/0a60ae81-5ec7-4726-9867-621edf26c6a9" />  

4. Sistem Fog  
   Pada saat tertentu, player tidak bisa melihat keseluruhan labirin (hanya area dekat dirinya yang terlihat, yaitu 5 tile di sekitar player dan tidak menembus tembok). Kabut akan hilang di setiap kelipatam 5 turn dan akan muncul lagi di turn selanjutnya. Area berwarna lebih gelap merupakan posisi monster sebagai hint keberadaan monster.

   Map akan seluruhnya terlihat pada pertama kali dirender. Lalu Map akan tertutup dengan fog:  

   <img width="630" height="384" alt="image(24)" src="https://github.com/user-attachments/assets/d8c5c6c5-05b5-428b-80cb-8df6cb55aff2" />

   Map terbuka kembali/ fog menghilang setip turn kelipatan 5  
   
5. Trap Berisi Pertanyaan  
   Saat player menginjak trap, maka player diwajibkan untuk menjawan pertanyaan dengan pilihan y/n, y untuk yes/ benar, n untuk no/ salah.
   
   ![WhatsApp Image 2025-12-14 at 14 34 59](https://github.com/user-attachments/assets/23fdd8b8-7482-436d-b0d0-df32c7a0f276)

7. Kondisi Menjawab Trap dengan Salah
   Ketika player salah menjawab trap, maka ia akan dikenakan penalty berupa skip 1 turn/ tidak dapat bergerak dalam 1 turn, sehingga monster akan lebih mudah menangkapnya
   
   ![WhatsApp Image 2025-12-14 at 14 33 28](https://github.com/user-attachments/assets/91bf71e1-84f9-4dc1-b6b0-3173ca289ed5)  


8. Kondisi Kalah
   Berikut merupakan kondisi kalah, yaitu ketika monster berhasil menangkap player (posisi monster = posisi player) dan ditandai dengan output 'Game Over' sebgaia tanda kekalahan:  
   
    ![WhatsApp Image 2025-12-14 at 14 33 43](https://github.com/user-attachments/assets/e38b9aa7-7853-4b7b-9154-e51326bcf366)

   
9. Kondisi Menang
    Berikut ketika kondisi menang, yaitu ketika player berhasil menyentuh koordinat finish tanpa tertangkap monster dan ditandai dengan output 'You Win' sebagia tanda kemenangan:  
    
   ![WhatsApp Image 2025-12-14 at 14 33 49(1)](https://github.com/user-attachments/assets/6ccfa572-38a2-4ce5-bc68-a774d6a70587)


## Update Project
| Tanggal Update   | Deskripsi Update                                                                                                                                                                                                          | File / Class yang Diubah                                                                 |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| 28 November 2025 | Pembuatan dasar permainan meliputi peta labirin, pergerakan player, pergerakan monster menggunakan algoritma Breadth-First Search (BFS), serta penambahan sistem trap dengan efek *stun*.                                 | `Game.java`, `Grid.java`, `Monster.java`, `Player.java`, `Position.java`, `Trap.java`    |
| 3 Desember 2025  | Perapian struktur kode agar lebih sederhana dan mudah dipahami, serta penambahan komentar pada kode untuk memudahkan pengembangan dan pemeliharaan lanjutan. Selain itu dilakukan perubahan tampilan antarmuka permainan. | `Position.java`, `Trap.java`, `Player.java`, `Monster.java`, `Grid.java`, `Game.java`    |
| 4 Desember 2025  | Penyederhanaan kode lanjutan, penambahan komentar, penambahan alur cerita (*storyline*) pada permainan, serta penghapusan bagian kode yang tidak digunakan.                                                               | `Game.java`, `Grid.java`, `Player.java`                                                  |
| 10 Desember 2025 | Penambahan sistem *Fog of War* menggunakan algoritma Depth-First Search (DFS) untuk membatasi area penglihatan pemain.                                                                                                    | `Game.java`, `Grid.java`                                                                 |
| 11 Desember 2025 | Penyempurnaan sistem *Fog of War*, penambahan musik latar (*background music*), serta pembaruan visual tampilan player agar lebih jelas.                                                                                  | `Grid.java`, `Game.java`, `BackgroundMusic.java`, `src/sounds/6525273874497800630-c.wav` |
| 12 Desember 2025 | Penyempurnaan lanjutan pada sistem *Fog of War* untuk meningkatkan kejelasan tampilan dan kenyamanan permainan.                                                                                                           | `Grid.java`                                                                              || Tanggal Update   | Deskripsi Update                                                                                                                                                                                                          | File / Class yang Diubah                                                                 |
| 28 November 2025 | Pembuatan dasar permainan meliputi peta labirin, pergerakan player, pergerakan monster menggunakan algoritma Breadth-First Search (BFS), serta penambahan sistem trap dengan efek *stun*.                                 | `Game.java`, `Grid.java`, `Monster.java`, `Player.java`, `Position.java`, `Trap.java`    |
| 3 Desember 2025  | Perapian struktur kode agar lebih sederhana dan mudah dipahami, serta penambahan komentar pada kode untuk memudahkan pengembangan dan pemeliharaan lanjutan. Selain itu dilakukan perubahan tampilan antarmuka permainan. | `Position.java`, `Trap.java`, `Player.java`, `Monster.java`, `Grid.java`, `Game.java`    |
| 4 Desember 2025  | Penyederhanaan kode lanjutan, penambahan komentar, penambahan alur cerita (*storyline*) pada permainan, serta penghapusan bagian kode yang tidak digunakan.                                                               | `Game.java`, `Grid.java`, `Player.java`                                                  |
| 10 Desember 2025 | Penambahan sistem *Fog of War* menggunakan algoritma Depth-First Search (DFS) untuk membatasi area penglihatan pemain.                                                                                                    | `Game.java`, `Grid.java`                                                                 |
| 11 Desember 2025 | Penyempurnaan sistem *Fog of War*, penambahan musik latar (*background music*), serta pembaruan visual tampilan player agar lebih jelas.                                                                                  | `Grid.java`, `Game.java`, `BackgroundMusic.java`, `src/sounds/6525273874497800630-c.wav` |
| 12 Desember 2025 | Penyempurnaan lanjutan pada sistem *Fog of War* untuk meningkatkan kejelasan tampilan dan kenyamanan permainan.                                                                                                           | `Grid.java`                                                                              |
| 14 Desember 2025 | Penyempurnaan Tampilan output, yaitu penambahan visual 'You Win' saat menang, 'Game Over' saat kalah, 'Welcome' di awal permainan, dan 'trap' ketika player menginjak trap.                                                                                                           | `Game.java`, `Grid.java`, `Monster.java`, `Player.java`, `Position.java`, `Trap.java`                                                                             |


## Daftar FP Kelompok Lain:
D-1 : Word Rank Guesser Game
Link : https://github.com/NashiwaInsan/asdfinalproject

D-2 : Sistem Rekomendasi Event Berbasis Graph
Link : https://github.com/dedyirama-id/kael-recommendation-system

D-3 : Smart Traffic Light Simulator
Link : https://github.com/Sudukk/FP_ASD_Traffic_Light_Simulation_FINAL

D-4 : HotelSeek - Rekomendasi Pemilihan Hotel
Link : https://github.com/dreadf/hotelseek

D-5 :
Link :

D-6 : To-Do List
Link : https://github.com/anggraitapr/ASDFPTODOLIST

D-7 : Sistem Antrian IGD
Link : https://github.com/WilliamHanantha/FP-ASD

D-8 : Sistem Rekomendasi Jadwal Latihan dan Nutrisi Gym
Link :https://github.com/tyr3x74/GymPlan

D-9 : Sistem Rekomendasi Teman Berdasarkan Mutual Friends
Link :https://github.com/mariaelvina/FinalProjectD9

D-10 : Monster Chase
Link : https://github.com/Aida41104/FPASD

D-11 : Warehouse Management System
Link : https://github.com/FasaBil/ASD-D11-Inventory-Management

D-12 : Smart Traveling Planner
Link : https://github.com/Dziky05/FP-ASD-KEL-13

D-13 : Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman
Link : https://github.com/FashaAsshofa/Final-Project-ASD-D-Kelompok-13

D-14 : Rekomendasi Film berbasis Graph
Link : https://github.com/neutralcheeze/final-project-asd.git
Link :

D-14 : Rekomendasi Film berbasis Graph
Link : https://github.com/neutralcheeze/final-project-asd.git

