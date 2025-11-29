Nama  : Reza Afzaal Faizullah Taqy <br>
NRP   : 5025241051 <br>

<img width="1197" height="424" alt="image" src="https://github.com/user-attachments/assets/4bf82eea-f5d9-45c7-8555-ce10bab9c496" />

A. `Fungsi Program` <br>
  Program ini adalah implementasi permainan klasik "Pong" berbasis desktop.
  
  1. Interaksi Real-time: Memungkinkan dua pengguna bermain secara bersamaan pada satu keyboard (Player 1: W/S, Player 2: Up/Down).
  
  2. Simulasi Fisika Sederhana: Mengimplementasikan logika pemantulan (bounce) ketika objek bola bertabrakan dengan dinding atau pemukul.
  
  3. Manajemen State: Mengelola posisi objek yang bergerak secara dinamis setiap milidetik tanpa flickering (kedip) yang mengganggu visual.

B. `Cara Kerja Program` <br>
  Berbeda dengan aplikasi GUI form biasa (Event-Driven), game ini menggunakan arsitektur Game Loop.
  
  1. Inisialisasi (Thread): Saat program dijalankan, GamePanel membuat sebuah Thread baru. Thread ini berjalan paralel untuk menangani logika permainan agar tidak membekukan antarmuka utama.
  
  2. Game Loop (Jantung Permainan): Di dalam method run(), terdapat loop while(true) yang berjalan sekitar 60 kali per detik (60 FPS). Dalam setiap putaran loop, program melakukan 3 hal:
  
  -> Move: Mengupdate koordinat X dan Y dari bola dan paddle berdasarkan kecepatannya.
  
  -> Check Collision: Mengecek apakah ada objek yang bertabrakan (menggunakan intersects() dari kelas Rectangle). Jika bola kena paddle, arah X dibalik. Jika bola kena dinding atas/bawah, arah Y dibalik.
  
  -> Repaint: Menggambar ulang layar dengan posisi koordinat baru.
  
  3. Input Handling: KeyAdapter mendengarkan tombol keyboard. Saat tombol ditekan, kecepatan Y paddle diubah (misal jadi -10). Saat dilepas, kecepatan dikembalikan ke 0. Ini membuat pergerakan paddle terasa halus (smooth).

<img width="1246" height="791" alt="image" src="https://github.com/user-attachments/assets/e8392313-7060-4c85-99c3-0f164531ed2a" />

C. Penjelasan Masing-Masing Class

-> PongGame <br>
Driver Class. Hanya berisi main method untuk memanggil GameFrame.

-> GameFrame <br>
Container. Turunan dari JFrame. Berfungsi sebagai bingkai jendela aplikasi yang menampung panel permainan, mengatur tombol close, dan judul window.

-> GamePanel <br>
Controller / Engine. Turunan JPanel yang juga mengimplementasikan Runnable. Class ini adalah otak permainan. Ia memuat Game Loop, mengatur grafis (Graphics), dan mendeteksi tabrakan.

-> Paddle <br>
Game Object. Turunan dari Rectangle. Objek ini menyimpan posisi X, Y, serta ID pemain. Ia memiliki logika untuk bergerak vertikal namun dibatasi oleh tinggi layar agar tidak tembus.

-> Ball <br>
Game Object. Turunan dari Rectangle. Objek bola yang bergerak bebas secara diagonal (X dan Y berubah bersamaan). Memiliki logika dasar untuk memantul jika menyentuh batas atas/bawah layar.
