# Monster Chase (FInal Project ASD)
# Implementasi Algoritma Breadth-First Search dan Depth-First Search dalam Game Labirin Berbasis Java

## Informasi Proyek:
Mata Kuliah: Algoritma dan Struktur Data

Dosen Pengampu: Renny Pradina Kusumawardani

Kelas: D

Kelompok: 
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

Tujuan: Menentukan jalur terpendek monster menuju pemain

Struktur Data Pendukung: Queue, array jarak (distance), dan array paren

Dalam implementasinya, BFS ini bekerja sebagia berikut:
Dimulai dari posisi monster.
Menjelajah grid secara level-by-level.
BFS menyimpan parent untuk setiap tile, sehingga bisa ditelusuri kembali jalurnya.
Ketika BFS mencapai posisi pemain, BFS berhenti.
Monster menelusuri kembali jalur terpendek dari player ke parent hingga menemukan langkah berikutnya.

2. Depth-First Search (DFS)
   Algoritma Depth-First Search (DFS) digunakan dalam sistem Fog of War untuk mengatur area penglihatan pemain. DFS bekerja dengan menelusuri satu jalur secara mendalam hingga mencapai batas tertentu sebelum berpindah ke jalur lain, sehingga sesuai untuk mensimulasikan penyebaran cahaya di sekitar pemain.
