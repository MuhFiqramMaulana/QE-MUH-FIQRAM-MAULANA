Versioning Control
Versioning dapat diartikan sebagai mengatur versi (pelacakan perubahan) dari source code program dengan tujuan untuk mengetahui perubahan apa saja yang telah dilakukan oleh team projek agar dapat melakukan managemen projek dengan lebih baik lagi dengan mengetrack setiap perubahan-perubahan tersebut.
Tools: 
-	Version Control System (VCS):
Single User (localize):
 SCCS-1972 (Unix only) localize
RCS-1982 (Cross platform, text only)
Centralize (sudah ada internet): 
CVS-1986 File Focus
Perforce-1995
Subversion-2000 (track directory structure)
Microsoft team foundation server-2005
Distributed	: 
Git-2005
Mercurial-2005
Bazaar-2005
-	Source Code Manager (SCM)
-	Revision Control System (RCS)

GIT (Group Inclusive Tour) 2005
	GIT dikena ljuga dengan distributed revision control (VCS terdistribusi) merupakan salah satu version control system yang digunakan untuk mengembangkan software secara bersama-sama (collaboration) yang artinya database GIT tidak hanya berada dalam satu gempat saja melainkan setiap orang yang terlibat dalam pengkodean projek akan menyimpan data base GIT hal ini dapat memudahkan pengelolaan projek baik secara online maupun offline.
(GIT: LINUS TORVALDS => https://github.com/torvalds/linux)

Cara mengapload projek ke sistem
Setting configurasi: init, clone, config
Cara kerja: 
-	Working directory: untuk mengubah (commit), sebelum masuk ke commit maka arus memasukan ‘git add’ untuk menandai sehingga dapat dijadikan staging area. 
Untuk melihat perubahan pada working area dapat menggunakan ‘git graph’.
-	Staging area: untuk mendapatkan repositoy dapat menggunakan ‘git commit’ untuk ke server. Dapat menggunakan ’git push’ 
-	Repository: tempat menghimpun projek
Untuk mengecek tanpa git graph (git key):
-	Git status: untuk mengecek peubahan (akan muncul branch berapa dan perubahanya apa saja)
-	Git add: untuk mengubah directory ke staging area, bisa satu folder atau satu file dengan titik.
-	Git commit: menggunakn -m kemudian dilanjutkan dengan pesannya. Ketika commit hindari pesan yang tidak jelas.
-	Git diff: mirip dengan git status namun lebih detail(tejadi di branch mana, detail setiap perubahan), saat dieksekusi maka akan muncul perubahanya
-	Git Stash: sebuah penyimpanan sememntara, misal ada 100 line kemudian di stash sehingga di file main.go nya hilang. Kemudian line tersebut dapat di fixing  dan kemudian dapat dikempalikan. 
-	File .gitignore: sebuah file untuk mengeksekusi file yang di ignore yang tidk ingin dimasukan ke dalam github
*.log
Logs: dalam satu folder
-	Git log: untuk melihat perubahanya 
Git log –oneline: untuk melihat id setiap line (setiam commit line memiliki id)
-	Git reset: melalkukan sebuah pengembalian
--soft: saat mau Kembali ke suatu titik maka perubahan2 yang terjadi akan tetap ke tracking di staging area.
--hard: tidak ke tracking namun masih tetap ada di dalam working area namun masih belum ke staging.
*jika tidak menggunakan git reset maka dapat menghapus yang bermasalah kemudian melakukan push sehingga pekerjaanya yang dilakukan masih se alur.
Perintah untuk mengsyncronize di dalam git:
-	Git push: untuk mengirimkan commit kedalm server
-	Git fetch: mengambil data yang ada di dalam server, dan mengecek saat ada updet branch atau branch yang sama atau ada develop yang sama (mengambil semuanya). Setelah diambil bisa melakukan 
-	Git pull: menarik data yang selanjutnya di merge(git pull adalah gabungan antara git master dan git merge).
Braches:
Mengisoalsi perubahan2 yang terjadi di master
-	Master diguakan untuk sisi production (fix)
-	Development (branch utama dalam pengembangan)
-	Branch memiliki tugas khusus (nisal branche feature A maka akan mengerjakan commit/ perintah A)
-	Git branch: untuk melihat branch yang kita miliki, akaan terlihat branchnya apa saja, kemudian tanda bintang sebagi penenda kita berada di branch apa.
Membuat branch baru:
-	Git branch faeturA. Sebelum melakukan commit maka hanya akan ada 1 branch yaitu master, maka untuk menambah branch kita harus melakukan commit minimal 1 kali, sehingga akan membuat git membuat branch baru
-	Jika mau melihat di dalam git local (mengarah ke github)
local: master
origin: 
*untuk melihat semua branch di origin maka gunakan git branch -a
-	Git checout: untuk pindah
-	Untuk pindah dan buat baru, misal 'git chekout -b'
-	Untuk pindah ke master 'git checout  master'
-	Git merge
Fast forward (ff): akan melakukan percabangan misal dari master dan master mengambil dari feature B maka graph akan terlihat bercabang
No fast forward 
Pull request:
-	Master/developmet biasanya di pegang oleh lead/maneger
-	Pemrograman biasanya mengerjakan feature saja, maka saat akan melakukan merge feature ke master dapat mnggunakan pull request dengan melalui github melalui menu pull request. 
Workflow collaboration: 
	Alur dari menggunakan git di github,sehingga dapat diketahui optimalisasinya dapat diketahui.
Branch: 
-	Master: yang baik tidak banyak titik (final tidak ada bug dsb)
-	Develop: penggabungan pengembangan
-	Feature: pengabungan titik dari develop
Catatan:
1.	Jangan membuat master/ mengubah2 master (master hanya menerima fix request)
2.	Development akan mengambil dari master kemudian menerima dari feature, dan branch master hanya mengambil dari development
3.	Setiap feature jika selesai minta pull requet dari development
4.	Jika development sudah selesai dan tidak ada bug, maka minta pull request atau master merge ke development.

Ingat!
Tidak ada projek yang sempurna! Oleh sebab itu perlu dilakukan upgread menjadi lebih baik lagi!
Dalam git terdapat remote computer (server)
Tidak boleh mengedit master di branch
Konflik: ada perubahan dalam 2 fixing dalam 1 line. Selesaikan dengan fixing (dikomunikasikan) misal dengan di hapus atau di ubah. Saat ada konflik akan ada tanda Sama dengan banyak (======) adalah sebagai pemisah antara perubahan yang tengah dilakukan
Ssh:lebih aman akarena ana key yang perlu dibuat yang dapat dijadikan penanda yang berhubungan dengan projek yang dibuat
https: akan melakykan enkripsi data pengirimiman sehingga orang yang menerimanya akan mendapatkan data yang acak.
Remote control best practisnya bernamama ‘origin’
