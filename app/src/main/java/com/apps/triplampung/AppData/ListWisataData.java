package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.WisataEntity;

public class ListWisataData {

    private static final String[][] wisata = {
            {"Puncak Mas", "Puncak Mas merupakan salah satu tempat rekreasi favorit warga Lampung yang berada di perbukitan Kota Tapis Berseri. " +
                    "Dari tempat ini, wisatawan dapat melihat pemandangan Bandar Lampung dari ketinggian.\n" +
                    "Berbagai wahana dan spot menarik banyak terdapat di area wisata ini. Fasilitas yang disediakan di tempat ini pun cukup lengkap. " +
                    "Mulai dari rumah pohon, area permainan anak, hingga café yang menawan ada di sini.\n",

                    "Lokasi :\n\n" +
                            "Objek wisata ini berada di Jl. H. Hamim RJP, Sukadana Ham, Kec. Tj. Karang Barat, Kota Bandar Lampung, Lampung 35215.\n\n" +
                            "Jam Buka :\n\n" +
                            "Tempat wisata ini buka seitap hari dari pagi hingga sore hari kecuali hari Senin buka selama 24 Jam.\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Senin-Minggu\t\t\t\t\t\t\t Rp20.000"
            },

            {"Pahawang", "Banyak sekali destinasi wisata alam di kawasan Lampung yang berupa pantai dan juga pulau yang sangat cantik dan indah memesona." +
                    "Salah satunya adalah pulau Pahawang. Nama Pahawang itu mulai populer dan mencuat di kalangan para " +
                    "wisatawan, yakni terutama di kalangan para wisatawan penggemar jenis wisata bahari.Pulau Pahawang di Lampung ini bahkan mendapat julukan sebagai " +
                    "serpihan surga yang jatuh ke bumi dan tersembunyi.Pulau ini merupakan salah satu spot snorkeling yang memiliki keindahan pemandangan bawah laut yang " +
                    "memesona dan masih belum begitu banyak terjamah tangan manusia.Terdapat banyak spot atau lokasi tempat tujuan snorkeling yang dipenuhi dengan " +
                    "terumbu karang dan juga aneka ikan warna-warni.",

                    "Lokasi :\n\n" +
                            "Pulau Pahawang tersebut alamat tepatnya berada di kecamatan Punduh Pidada, kabupaten Pesawaran, Lampung Selatan." +
                            "Nama Pahawang tersebut adalah nama suatu desa dan juga pulau yang letaknya di lepas teluk Punduh.\n\n" +
                            "Jam Buka :\n\n" +
                            "Pulau ini buka setiap hari 24 jam untuk kunjungan wisatawan. Namun bagi yang tidak ingin menginap, maka tentunya harus " +
                            "menyesuaikan waktu liburan dengan jadwal balik kapal yang akan pulang ke Dermaga Ketapang\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Untuk memasuki Pulau Pahawang kita tidak perlu membeli tiket masuk. Yang kita bayar hanyalah ongkos kapal saat menyeberang " +
                            "dari Dermaga Ketapang.\n\n" +
                            "Ongkos kapal ini pun tidaklah terlalu mahal. Besarannya hanya sekitar Rp. 30.000 saja sekali jalan.\n\n" +
                            "Jenis Tiket/Wahana\t\t|\t\tHarga\n" +
                            "Tiket Masuk\t\t\t\t\t\t\t\t\t\t\t|\t\tGratis\n" +
                            "Snorkeling\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\tRp.50.000\n" +
                            "Banana Boat\t\t\t\t\t\t\t\t\t\t|\t\tRp.30.000\n" +
                            "Ongkos Kapal\t\t\t\t\t\t\t\t\t|\t\tRp.30.000\n\n" +
                            "Kemudian untuk yang ingin snorkeling, di sana sudah ada penyewaan alat-alat snorkel dengan tarif sekitar Rp. 50.000.\n" +
                            "Lalu bagi yang akan menginap, di pulau ini juga ada banyak penginapan dengan harga sewa bervariasi tergantung fasilitasnya.\n" +
                            "Selain snorkel di Pahawang Besar juga ada wahana permainan air salah satunya banana boat.\n\n" +
                            "Tarif sewa wahana ini untuk sekali putarannya adalah sekitar Rp. 30.000.\n"},

            {"Pantai Gigi Hiu", "Ciri khas dari Pantai Gigi Hiu adalah adanya jajaran batu karang yang tersebar di sepanjang pantai. " +
                    "Hal tersebut menjadi keunikan pantai yang tidak dapat ditemukan di pantai lainnya.\n" +
                    "Berbeda dengan umumnya pantai yang menjadi terkenal karena hamparan pasir landai yang luas, Pantai gigi hiu justru tidak " +
                    "memiliki pasir. Kalaupun ada sangat sempit. Pantai ini menyambut pengunjung dengan hal yang berbeda. " +
                    "\n"+"\n"+
                    "Pantai ini penuh dengan hamparan bebatuan artistik yang tersebar secara alami di sepanjang pesisir.Perairan sekitar pantai dipenuhi gugusan bebatuan " +
                    "karang yang menjulang hingga 10 meter. Pemandangan ini akan membuat pengunjung terpesona. Mengingatkan pada kondisi pantai di" +
                    " film animasi avatar, yang dipakai latihan pendekar pengendali bumi.\n\n",

                    "Lokasi :\n\n" +
                            "Pantai Gigi Hiu Kelumbayan, terletak di Kecamatan Kelumbayan, Kabupaten Tanggamus, Lampung, Indonesia.\n\n" +
                            "Jam Buka :\n\n" +
                            "Pantai ini terbuka utnuk kunjungan wisatawan 24 jam dalam sehari.\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Untuk masuk ke Pantai Gigi Hiu maka anda akan dikenakan tiket masuk seharga Rp. 10.000. " +
                            "Harga ini belum resmi karena hanya dikelola oleh masyarakat setempat.\n"},

            {"Pantai tanjung putus ", "Pantai tanjung putus adalah pantai dengan keindahan pasirnya yang bersih serta lembut dan berwarna agak ke coklatan. " +
                    "Air laut di pantai tanjung putus sangat jernih, bahkan ikan-ikan yang berlalu lalang di terumbu karang dapat terlihat jelas.",

                    "Lokasi :\n\n" +
                            "Pantai Tanjung Putus berlokasi di kabupaten pesawaran, provinsi lampung. Lokasi terdekat untuk wisatawan yang berasal dari luar kota " +
                            "ke Pantai Tanjung Putus adalah dari kota Bandar lampung.\n\n" +
                            "Jam Buka :\n\n" +
                            "Jam oprasional atau jam masuk ke Pantai Tanjung Putus di buka selama 24 jam.\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Tiket masuk ke Pantai Tanjung Putus sekitar Rp. 10.000.- namun jika anda bersama dengan rombongan tour dan di pandu oleh pemandu " +
                            "setempat anda hanya dikenakan biaya sewa perahu.\n" +
                            "\n" +
                            "Rata-rata perahu yang disewakan oleh masyarakat sekitar harganya borongan. \n" +
                            "\n" +
                            "Biasanya dalam satu perahu yang terdiri dari 8 sampai dengan 10 orang, penyewa perahu di bebankan biaya sekitar Rp. 500.000,- per perahu.\n"},

            {"Taman Nasional Way Kambas", "Taman Nasional Way Kambas (TNWK)  adalah salah satu Taman Nasional pertama dan tertua di Indonesia. " +
                    "Taman Nasional ini menempati 1.300 km persegi dari hutan dataran rendah pantai sekitar Sungai Way Kambas di pantai timur Provinsi " +
                    "Lampung. TNWK dikenal dengan konservasi gajah, karena selain menjadi tempat perlindungan bagi gajah sumatera, taman nasional ini juga " +
                    "dikenal sebagai tempat latihan mereka. Way Kambas didirikan oleh pemerintah Belanda pada tahun 1937 sampai sekarang masih terjaga " +
                    "sebagai Taman Nasional dan di sini diyakini ada sekitar 200 gajah sumatera (Elephas maximus sumatranensis) hidup di dalam Taman " +
                    "Nasional. Selain konservasi gajah, di sini juga terdapat konservasi badak sumatera dan ada fasilitas Rhino Sanctuary.",

                    "Lokasi :\n\n" +
                            "taman nasional perlindungan gajah yang terletak di daerah Lampung tepatnya di Kecamatan Labuhan Ratu, Lampung Timur, Indonesia.\n\n" +
                            "Jam Buka :\n\n" +
                            "Tempat wisata ini buka seitap hari dari pagi hingga sore hari.\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Harga tiket masuk yang ditawarkan adalah 7 ribu rupiah saja. Biyaya menunggangi gajah bisa membayar uang sebesar 20 ribu rupiah. " +
                            "Apabila, ingin berpetualang dengan gajah sebesar 150 ribu rupiah.\n\n" +
                            "Harga cottage dengan harga kurang lebih 500 ribuan. Bisa juga dengan beberapa penginapan murah dengan hatrga 100 hingga 200 ribu rupiah.\n"},

            {"Pantai Marina", "Pantai Marina merupakan salah satu pantai yang berada di kecamatan Merak Belatung, Lampung Selatan, Provinsi Lampung. " +
                    "Banyak sekali para traveler yang membicarakan keindahan dari pantai ini, pantai dengan bebatuan karang cantik dari deburan ombak yang " +
                    "terus mengikis dan membentuk sebuah goresan alam yang indah. Tentu siapa saja yang melihat keindahan nya akan merasa terpesona.\n" +
                    "\n" +
                    "Pantai marina terkenal dengan deburan ombaknya yang cukup besar. Hal ini diakrenakan karena memang pantai ini berbatasan langsung " +
                    "dengan Samudera Hindia yang membuat arus air laut begitu kencang.  Kebanyakan wisatawan berkunjung ke pantai ini hanya untuk berburu " +
                    "foto saja dan menggunakannya sebagai tempat foto pre-wedding.\n",

                    "Lokasi :\n\n" +
                            "lokasi dari marina kalianda sendiri berada di Lampung Selatan, Provinsi Lampung yang tepatnya berada di alamat Kec.Kalianda, " +
                            "Kabupaten Lampung Selatan, Lampung 35551.\n\n" +
                            "Jam Buka :\n\n" +
                            "Tempat wisata ini buka seitap hari dari pagi hingga sore hari  (pukul 18.00)\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Harga tiket masuk atau HTM Pantai Marina Lampung sendiri pada saat hari biasa, hari libur tetap sama. Yakni pengunjung " +
                            "akan dikenakan tarif sebesar Rp 10.000 per orang.\n"},

            {"Lembah Hijau Lampung ", "Taman Wisata Lembah Hijau Lampung adalah destinasi wisata keluarga yang tak pernah sepi dikunjungi wisatawan. " +
                    "Terletak di Bandar Lampung, tempat ini menawarkan sarana edukasi sekaligus rekreasi alam di lahan seluas 30 hektar. Keindahan alam " +
                    "berpadu dengan wahana-wahana menarik di tempat ini tak berhenti memanjakan pengunjung.\n\n" +
                    "Terdapat banyak wahana yang tersedia di objek wisata ini. Ada wahana air, outbound, tempat berkemah, wahana permainan, hingga water " +
                    "park. Namun, salah satu yang paling digemari di sini adalah Taman Satwa. Di taman ini, pengunjung akan menyaksikan 465 satwa dari " +
                    "65 jenis binatang.\n",
                    "Lokasi :\n\n" +
                            "Jl. Raden Imba Kesuma No.21, Sukadana Ham,Tj. Karang Barat,Kota Bandar Lampung,Lampung,Indonesia,35116.\n\n" +
                            "Jam Buka :\n\n" +
                            "Taman rekreasi keluarga ini bisa dikunjungi mulai pagi hari. Tempat wisata ini sudah buka pukul 08.00 WIB pagi.\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Tiket Reguler  : \n" +
                            "Hari Biasa : Rp15.000\n\n" +
                            "Paket Taman Wisata : \n" +
                            "Hari Biasa: Rp35.000, \n\nAkhir Pekan: Rp45.000\n" +
                            "Paket WaterBoom : \n\n" +
                            "Hari Biasa : Rp45.000"},

            {"Bukit Sakura","Bukit Sakura Lampung merupakan objek wisata di Kota Bandar Lampung yang menyuguhkan nuansa negeri Sakura. " +
                    "Pemandangannya dihiasi pohon Sakura, kincir angin, dan bangunan bernuansa Jepang. Berbagai ornamen di dalamnya mendukung nuansa " +
                    "wisata terasa begitu nyata.\n" +
                    "Tempat wisata di ketinggian ini diberi nama Bukit Sakura karena berada di Gang Sakura. Setelah melewati pintu masuk, wisatawan akan " +
                    "merasa seperti berada di Jepang. Udara tempat wisata ini sejuk untuk menikmati keindahan Lampung dari ketinggian atas bukit.\n",
                    "Lokasi :\n\n" +
                            "Jl. Melati Raya,Langkapura,Bandar Lampung,Lampung,Indonesia,35115.\n\n" +
                            "Jam Buka :\n\n" +
                            "Senin-Minggu : 08.00 - 22.00\n\n" +
                            "Harga Tiket Masuk :\n\n" +
                            "Senin-Minggu  : Rp10.000\n" +
                            "Sewa Kostum Jepang  : Rp25.000\n" +
                            "Sewa Kostum Korea  : Rp35.000\n" +
                            "Sewa Kostum Belanda  : Rp40.000\n" +
                            "Payung  : Rp10.000\n" +
                            "Bando/Kipas  : Rp7.000"}

    };



    public static void prepareData(Context context){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        WisataEntity wisataEntity = new WisataEntity();
        for (int i = 0; i < wisata.length; i++){
            wisataEntity.setId_wisata(i);
            appDatabase.appDao().addIdWisata(wisataEntity);
            wisataEntity.setWisata(wisata[i][0]);
            appDatabase.appDao().addWisata(wisataEntity);
            wisataEntity.setInfo_wisata(wisata[i][1]);
            appDatabase.appDao().addInfoWisata(wisataEntity);
            wisataEntity.setLokasi_wisata(wisata[i][2]);
            appDatabase.appDao().addLokasiWisata(wisataEntity);
        }
    }
}
