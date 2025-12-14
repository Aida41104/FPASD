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

##  Algoritma yang Digunakan

Pada pengembangan game Monster Chase, beberapa algoritma dari mata kuliah Algoritma dan Struktur Data diterapkan secara langsung ke dalam mekanisme permainan. Setiap algoritma memiliki peran spesifik yang mendukung fitur dan alur permainan sebagai berikut.

1. Breadth-First Search (BFS)  
   Algoritma Breadth-First Search (BFS) digunakan untuk mengatur pergerakan monster dalam mengejar pemain. BFS bekerja dengan menjelajahi node secara bertahap berdasarkan jarak terdekat (level by level), sehingga menjamin ditemukannya jalur terpendek pada struktur graph tanpa bobot.  
   
   A. Tujuan: Menentukan jalur terpendek monster menuju pemain  
   B. Struktur Data Pendukung: Queue, array jarak (distance), dan array parent   
   C. Implementasi pada Kode:Monster.moveTowards(Player player, Grid grid)  
   D. Dalam implementasinya, BFS ini bekerja sebagia berikut:  
      a. Dimulai dari posisi monster.  
      b. Menjelajah grid secara level-by-level.
      c. BFS menyimpan parent untuk setiap tile, sehingga bisa ditelusuri kembali jalurnya.
      d. Ketika BFS mencapai posisi pemain, BFS berhenti.
      e. Monster menelusuri kembali jalur terpendek dari player ke parent hingga menemukan langkah berikutnya.
   
   
2. Depth-First Search (DFS)  
   Algoritma Depth-First Search (DFS) digunakan dalam sistem Fog untuk mengatur area penglihatan pemain. DFS bekerja dengan menelusuri satu jalur secara mendalam hingga mencapai batas tertentu sebelum berpindah ke jalur lain, sehingga sesuai untuk mensimulasikan penyebaran cahaya di sekitar pemain.
   
   A. Tujuan: Membuka area penglihatan pemain di sekitar posisinya  
   B. Struktur Data Pendukung: Rekursi (implicit stack) dan array visited  
   C. Implementasi pada Kode: Grid.cahayaDFS(int x, int y, int depth, boolean[][] visited)  
   D. Keterangan tambahan: Pada turn ke-1 dan setiap turn ke-5, seluruh peta akan terbuka sementara sebagai efek “vision burst”.  
   E. Cara kerja:  
      a. Fungsi DFS dipanggil dari posisi player.  
      b. DFS menyebar ke empat arah (atas, bawah, kiri, kanan).  
      c. Kedalaman dibatasi hingga radius tertentu (depth ≤ 5).  
      d. Jika menemukan tembok, DFS berhenti di arah itu.  
      e. Tile yang dilewati DFS menjadi terlihat (visible).  

4. Linear Search  
   Algoritma Linear Search digunakan untuk mengecek keberadaan trap pada posisi tertentu di dalam labirin. Pencarian dilakukan dengan menelusuri daftar trap yang aktif satu per satu hingga ditemukan kecocokan posisi.  

   A. Tujuan: Mengecek apakah suatu posisi merupakan lokasi trap  
   B. Struktur Data Pendukung: List (ArrayList)  
   C. Implementasi pada Kode: Grid.isTrap(int x, int y); Grid.checkTrap(Player player, Scanner sc)  


## Struktur Data yang Digunakan  

Dalam pengembangan game Monster Chase, beberapa struktur data digunakan untuk mendukung mekanisme permainan serta implementasi algoritma Algoritma dan Struktur Data. Pemilihan struktur data disesuaikan dengan kebutuhan efisiensi akses, pengelolaan data, dan kemudahan implementasi algoritma.  

1. Array Dua Dimensi (char[][])  
   Struktur data array dua dimensi digunakan untuk merepresentasikan peta labirin permainan yang berukuran 15×15. Setiap elemen array menyimpan informasi mengenai kondisi suatu tile, seperti jalur kosong atau tembok.  
   Fungsi: Representasi dunia permainan (labirin)  
   Keunggulan: Akses langsung ke setiap tile dengan kompleksitas waktu O(1)  
   Implementasi pada Kode: Grid.grid  

2. Class Object (Position, Player, Monster, Trap)  
   Beberapa class object digunakan untuk merepresentasikan entitas utama dalam permainan.  
   Position digunakan untuk menyimpan koordinat posisi dalam bentuk pasangan (x, y).  
   Player merepresentasikan karakter pemain.  
   Monster merepresentasikan musuh yang mengejar pemain.  
   Trap menyimpan informasi pertanyaan, jawaban, dan durasi jebakan.  
   Penggunaan class object membantu memisahkan data dan logika, sehingga kode menjadi lebih terstruktur dan mudah dipahami.  

3. Queue (LinkedList)  
   Struktur data Queue digunakan dalam implementasi algoritma Breadth-First Search (BFS) pada pergerakan monster.  
   Fungsi: Menyimpan daftar posisi yang akan diproses dalam BFS  
   Karakteristik: First In First Out (FIFO)  
   Implementasi pada Kode: Queue<Position> q = new LinkedList<>();   

4. Array Jarak dan Parent (int[][], Position[][])  
   Untuk mendukung BFS, digunakan:  
      a. int[][] dist untuk menyimpan jarak dari posisi monster ke setiap tile  
      b. Position[][] parent untuk menyimpan asal pergerakan tiap tile  
      c. Struktur ini memungkinkan rekonstruksi jalur terpendek yang akan dilalui monster menuju pemain.  
      d. Implementasi pada Kode: Monster.moveTowards(Player player, Grid grid)  

5. ArrayList (List<Position>)  
   Struktur data ArrayList digunakan untuk menyimpan daftar trap yang sedang aktif di dalam permainan.  
   Fungsi: Menyimpan dan mengelola koordinat trap aktif  
   Keunggulan: Mudah ditambah dan dihapus secara dinamis  
   Kompleksitas Pencarian: O(n) (linear search)  
   Implementasi pada Kode: List<Position> activeTraps   

6. HashMap (Map<Position, Trap>)  
   Struktur data HashMap digunakan untuk memetakan posisi trap dengan data pertanyaan yang terkait.  
   Fungsi: Menghubungkan koordinat trap dengan objek Trap  
   Keunggulan: Akses data dengan kompleksitas waktu O(1)  
   Implementasi pada Kode: Map<Position, Trap> trapQuestions  

7. Array Boolean (boolean[][])  
   Array boolean digunakan untuk mendukung sistem Fog.  
   boolean[][] visible digunakan untuk menandai tile yang sedang terlihat oleh pemain  
   boolean[][] pernahTerlihat digunakan untuk menandai tile yang pernah terlihat sebelumnya  
   Struktur ini membantu pengelolaan visibilitas peta secara efisien.  
   Implementasi pada Kode: Grid.visible Grid.pernahTerlihat  

8. List dan Random  
   Struktur data List digunakan untuk menyimpan kumpulan pertanyaan, sedangkan kelas Random digunakan untuk memilih pertanyaan secara acak saat trap dibuat.  
   Fungsi: Menyediakan variasi pertanyaan dalam permainan  
   Implementasi pada Kode: List<String[]> questionBank, Random  

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
   Ini adalah tampilan awal saat kita run, yaitu menampilkan story beserta tampilan awal map dengan player ditandai dengan warna biru dan digerakkan dengan input W/A/S/D sebanyak 1 kali per turn, monster dengan warna merah, dan tembok berwarna ungu yang tak dapat dilewati oleh player  
   <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/3688ecc2-b9e4-44da-a5f4-e32ee18d904a" />  
   <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/007adeca-a0f9-42a2-b43e-e1b397ea0a45" />  
   
2. Sistem Fog
   Pada saat tertentu, player tidak bisa melihat keseluruhan labirin (hanya area dekat dirinya yang terlihat, yaitu 5 tile di sekitar player dan tidak menembus tembok). Kabut akan hilang di setiap kelipatam 5 turn dan akan muncul lagi di turn selanjutnya. Area berwarna lebih gelap merupakan posisi monster sebagai hint keberadaan monster.

   Map akan seluruhnya terlihat pada pertama kali dirender:
   
   <img width="946" height="641" alt="image(23)" src="https://github.com/user-attachments/assets/48014679-95f2-4c07-a038-947d69f82c54" />

   Lalu Map akan tertutup dengan fog:

   <img width="630" height="384" alt="image(24)" src="https://github.com/user-attachments/assets/d8c5c6c5-05b5-428b-80cb-8df6cb55aff2" />

   Map terbuka kembali/ fog menghilang setip turn kelipatan 5:

   <img width="693" height="424" alt="image(25)" src="https://github.com/user-attachments/assets/d41dad36-ea84-40b7-876b-205b31c8a881" />
   
4. Monster Mengejar Player dengan BFS
   Monster bergerak menuju player sebanyak 1 langkah per turn dengan menggunakan BFS agar dapat berjalan mengikuti jalur terdekat menuju player.  
   <img width="569" height="439" alt="image(16)" src="https://github.com/user-attachments/assets/d032463f-c05f-4db4-811e-c5b8dc833220" />
   
5. Trap Berisi Pertanyaan  
   Saat player menginjak trap, maka player diwajibkan untuk menjawan pertanyaan dengan pilihan y/n, y untuk yes/ benar, n untuk no/ salah.  
   <img width="1030" height="444" alt="image(15)" src="https://github.com/user-attachments/assets/d8950a91-4255-46f8-ba7d-1de1edcbd03c" />

6. Kondisi Menjawab Trap Benar
   Ketika player menjawab trap dengan benar, maka player tidak akan mengalami apapun/ tidak mendapat penalti.
   Berikut ketika menginjak trap:
   
   <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/6c47c689-5a44-451f-ae33-f00d683bcbf7" />

   Berikut merupakan input untuk bergerak:  
   
   <img width="608" height="407" alt="image(21)" src="https://github.com/user-attachments/assets/ef3d47f2-3585-431f-b4f8-aadced40ece9" />

   Player tetap dapat bergerak:
   <img width="549" height="387" alt="image(22)" src="https://github.com/user-attachments/assets/cfdf03f2-c87e-40ea-9c12-6fb4e681e5e0" />  
   
7. Kondisi Kalah
   <img width="691" height="563" alt="image(17)" src="https://github.com/user-attachments/assets/902b86a1-a98a-4879-b264-cb28c6db9d9c" />
8. Kondisi Menang
   <img width="609" height="521" alt="image(18)" src="https://github.com/user-attachments/assets/539448cc-d4e3-45d0-8998-723034a10c6a" />

