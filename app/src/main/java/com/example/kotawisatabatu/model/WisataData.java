package com.example.kotawisatabatu.model;

import com.example.kotawisatabatu.R;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNama = {
            "Jatim Park 3",
            "Jatim Park 2",
            "Jatim Park 1",
            "Coban Talun",
            "Batu Night Spectacular (BNS)",
            "Taman Langit",
            "Predator Fun Park",
            "Goa Pinus",
            "Museum Angkut",
            "Paralayang Batu",
            "Eco Green Park",
            "Alun-Alun Kota Batu",
            "Omah Kayu Paralayang",
            "Museum D'Topeng",
            "Taman Wisata Selecta",
            "Wisata Petik Apel Bumiaji",
            "Flora Wisata San Terra",
    };

    private static String [] wisataDeskripsi = {
            "Mulai dari wisata yang masih terbilang baru, yaitu Jatim Park 3. Tempat wisata buatan Jatim Park Group ini, baru resmi dibuka tahun 2017 lalu. Dengan mengambil tema taman dinosaurus untuk spot utamanya. Di dalam Dino Park, Anda akan dibawa ke zaman dimana masih terdapat dinosaurus. Taman ini dilengkapi dengan area Dino Park nuansa Timur Tengah, Zaman Ice Age, dan masih banyak lagi lainnya. Setelah puas dengan zaman purbakala, Anda bisa berkunjung ke wahana Fun Tech. Wahana satu ini akan mengajak Anda ke zaman modern. Disini Anda dapat merasakan bermain game futuristic dengan menggunakan teknologi terbaru seperti Virtual Reality. Jadi, seakan-akan Anda ikut bermain di dalam game tersebut. Tak hanya itu saja, masih banyak bagian dari Jatim Park 3 ini yang bisa Anda jelajahi dan nikmati keseruannya selama satu hari penuh.",
            "Masih tergabung dalam Jatim Park Group, ada juga Jatim Park 2. Jatim Park 2 ini menawarkan konsep modern zoo, di dalamnya terdapat banyak koleksi hewan dari berbagai negara di dunia yang bisa Anda lihat. Bukan hanya hewan yang masih ada saat ini, hewan purba yang telah punah pun bisa Anda jumpai di sini. Sehingga tak hanya liburan, Anda pun bisa mengajak anak-anak belajar banyak hal dari tempat wisata Jatim Park 2 ini.",
            "Jatim Park 1 merupakan tempat wisata Malang yang sudah lama terdapat di Kota Batu, dan menjadi wisata unggulan dari Jatim Park Group. Tempat wisata ini, memang favorit bagi warga Kota Batu dan sekitarnya. Terutama bagi pengunjung pelajar, karena di dalamnya selain terdapat berbagai permainan juga terdapat edukasinya juga. Anda bisa menemukan banyak anak sekolah yang melakukan studi wisata di Jatim Park 1 ini.",
            "Berkunjung ke Kota Batu, belum lengkap rasanya jika tidak mengunjungi Coban Talun. Wisata satu ini menghadirkan air terjun yang sangat indah. Suara gemericik air terjun dan juga udara yang sejuk menjadi hal yang bisa Anda dapatkan ketika berada di wisata ini. Anda pun bisa melakukan trekking dengan medan yang tidak terlalu sulit disini. Tidak hanya air terjun saja, Anda juga akan menemukan zona lain yang tersedia disini. Seperti taman bunga hingga wahana Apache yang diminati oleh wisatawan. Zona satu ini sendiri merupakan wahana yang mirip dengan kampung dan budaya dari Indian. Anda pun bisa menyewa aksesoris khas Indian dan berfoto di tempat tersebut.",
            "Salah satu tempat wisata yang juga tergabung dalam Jatim Park Group, yaitu Batu Night Spectacular. Wisata ini, menawarkan sensasi yang berbeda dari yang lain. Anda bisa menaiki wahana permainan, ditemani hawa dingin Kota Batu pada malam hari. Beberapa wahana favorit pengunjung di antaranya rumah hantu, cinema 4D, dan sepeda udara. Tak hanya itu saja, di BNS juga terdapat taman lampion. Yang dijadikan sebagai spot foto, dan merupakan ikon dari BNS itu sendiri.",
            "Taman Langit merupakan salah satu destinasi yang lokasinya berdekatan dengan Paralayang. Disini, Anda bisa berfoto dengan banyak spot kekinian dan menarik. Dengan latar belakang pegunungan dan udara yang segar, pastinya akan mampu untuk merefresh kembali pikiran Anda yang sedang penat.",
            "Objek wisata yang berada di Batu Malang di bawah Jatim Park Group lainnya, yaitu Predator Fun Park. Sesuai dengan namanya, tempat wisata ini mengusung tema predator terutama buaya. Anda bisa menemukan galeri buaya yang berisi berbagai jenis dan ukuran. Tidak hanya buaya hidup saja, tapi juga fosil buaya, serta buaya yang telah diawetkan. Ditambah, beberapa fasilitas yang disediakan di sini pun cukup lengkap. Seperti pasar wisata, mushola, food court, dan bike station.",
            "Berada di daerah perbukitan membuat Anda akan disuguhkan panorama alam yang memukau saat berada di lokasi satu ini. Memasuki kawasan ini, Anda akan disambut dengan plang yang terbuat dari kayu. Sepanjang penjelajahan Anda juga akan bisa menikmati indahnya pohon pinus yang berjejer di area ini. Ada beberapa spot foto menarik yang bisa untuk Anda temukan. Contohnya saja seperti kawasan Papua yang mana Anda akan menemukan rumah Honai. Selain itu, ada pula spot foto yang cukup ikonik yakni perahu di Jurang. Disini, Anda akan merasa bak di atas kapal dengan pemandangan alam yang luar biasa indahnya.",
            "Masih berada di bawah naungan Jawa Timur Group, ada lagi wisata edukasi yang berada di Batu Malang yakni Museum Angkut. Museum ini memiliki lebih dari 300 koleksi mobil dan motor klasik yang ada di seluruh dunia. Anda akan menemukan koleksi ini di area depan, saat pertama kali memasuki museum di zona hall utama. Ada juga zona Las Vegas, yang menggambarkan kehidupan malam di Kota Las Vegas. Dan zona lainnya yang tak kalah menarik.",
            "Paralayang Batu menjadi destinasi selanjutnya yang tidak bisa Anda lewatkan begitu saja. sebab, wisata ini sangat cantik untuk dikunjungi baik pagi maupun malam hari. Disini, Anda akan disuguhkan dengan keindahan kota Batu. Apabila Anda datang saat malam hari, maka kerlap kerlip lampu kota dapat menjadi pemandangan yang Anda dapatkan. Sedangkan apabila Anda datang ketika siang ataupun sore hari, Anda bisa untuk mencoba salah satu wahana yang menguras adrenalin yakni paralayang. Anda akan terjun dari ketinggian dengan menggunakan parasut dan bisa melihat indahnya kota Batu. Selain itu, udara sejuk yang ada disini pun tentunya akan membuat Anda menjadi betah.",
            "Eco Green Park merupakan wisata edukasi yang sangat cocok untuk wisata keluarga. Di destinasi wisata ini sedikitnya terdapat lebih dari 10 zona. Antara lain zona walking bird, zona music plaza, zona animal farm, zona duck kingdom, zona jungle adventure, zona world parrots, zona insectarium, dan zona rumah terbalik. Ada juga zona memerah susu sapi, dimana akan ditunjukkan demonya terhadap 2 jenis sapi perah yang didatangkan langsung dari Australia.",
            "Apabila Anda mencari tempat wisata yang ramah di kantong saat berada di kota Batu, maka Alun Alun Kota Batu adalah lokasi yang tepat. Hal ini dikarenakan Anda tidak perlu untuk membayar tiket masuk saat berada disini. Anda hanya akan ditarik ongkos parkir kendaraan saja. ada banyak hal yang bisa Anda lakukan disini. Mulai dari wisata kuliner dengan segala makanan khas kota Malang. Banyak jajanan yang bisa Anda beli dengan harga yang sangat murah di area ini. Selain itu, apabila ingin menikmati keindahan kota Batu dari ketinggian, Anda hanya perlu untuk naik bianglala yang telah tersedia di wisata satu ini.",
            "Omah Kayu Paralayang adalah salah satu objek wisata yang sangat ramai dikunjungi wisatawan. Pada destinasi ini, Anda bisa mendapatkan 2 objek wisata sekaligus yaitu Omah Kayu dan Bukit Paralayang. Mengusung konsep back to nature, Omah Kayu meyediakan rumah pohon mini di atas pohon pinus. Kapasitas maksimal dari masing-masing rumah ini adalah 3 orang. Di depannya, terdapat bangku kayu yang bisa Anda gunakan untuk bersantai menikmati hawa sejuk perbukitan. Sedangkan Bukit Paralayang, merupakan salah satu spot yang berada di samping Omah Kayu. Di sini Anda dapat merasakan sensasi terbang menggunakan paralayang, dengan didampingi oleh instruktur yang sudah ahli di bidangnya. Dijamin, Anda akan ketagihan melihat indahnya Kota Batu sembari menaiki paralayang tersebut. Terdapat juga beberapa spot foto instagramable di destinasi wisata ini yang bisa Anda nikmati.",
            "Salah satu wisata edukasi yang bisa Anda kunjungi saat berada di Batu adalah Museum D’Topeng. Masih menjadi satu bagian dengan Museum Angkut, disini Anda akan disuguhkan dengan berbagai macam karya seni yang ada di beberapa wilayah yang ada di Indonesia. Selain itu, Anda juga akan menemukan banyak koleksi menarik yang dipajang di museum ini. Benda benda dengan nilai sejarah yang tinggi juga bisa Anda temui disini. Sebut saja, benda pada masa zaman prasejarah hingga koleksi dari kerajaan Majapahit. Terdapat salah satu koleksi yang memiliki nilai historis cukup tinggi yakni Singgasana dari Kerajaan Singharaja. Bagi Anda yang penasaran, maka Anda pun bisa menemukannya di lokasi satu ini.",
            "Bagi masyarakat asli Batu, mungkin Selecta adalah tempat wisata yang sudah tidak asing lagi. Tempat wisata ini memang sudah ada sejak jaman Belanda, dan tidak kalah ramai dikunjungi pengunjung. Selecta kini sudah semakin membaik dengan banyaknya penambahan fasilitas di sana. Selain taman bunga yang indah, Anda juga bisa menikmati kereta gantung, flying fox, naik kuda, kolam renang, dan lain sebagainya.",
            "Wisata Petik Apel Bumiaji menjadi destinasi agrowisata yang wajib Anda kunjungi selama berada di kota Apel. Pasalnya, di tempat ini Anda bisa memetik buah apel sesuai dengan keinginan Anda. Untuk itu, bagi Anda yang ingin mencoba buah hasil petikan sendiri, Anda bisa mengunjungi destinasi satu ini. Agrowisata petik apel yang berada di Bumiaji ini merupakan salah satu dari wisata petik apel yang bisa Anda temui di Batu. Selain mencicipi apel dari hasil petikan sendiri, Anda juga bisa untuk membawa buah apel tersebut sebagai oleh oleh untuk keluarga di rumah. Dengan begitu, Anda telah bisa membawa buah tangan yang tepat.",
            "Flora Wisata San Terra masih terbilang tempat wisata yang cukup baru. Namun sudah menjadi tempat favorit para warga Malang. Destinasi wisata ini menyuguhkan warna warni tanaman bunga cantik. Selain itu, tempat ini juga memiliki konsep replika bangunan BelAnda dan Little Korea sebagai spot berfoto. Untuk menambah estetik foto anda, di sini pun menyediakan penyewaan kostum Hanbok maupun kostum khas perempuan Belanda. Sedangkan untuk akses jalan menuju Flora Wisata San Terra ini, cukup mudah dijangkau. Karena destinasi ini berada di dataran tinggi, maka jalannya memang cukup menanjak dan berkelok. Namun Anda tidak perlu khawatir, karena jalannya mulus dan bersahabat. Anda dapat mencapainya dengan menggunakan kendaraan roda dua maupun roda empat. Jaraknya dari pusat Kota Malang pun tidak terlalu jauh, hanya sekitar 29 kilometer."
    };

    private static String [] wisataAlamat = {
            "Jl. Ir. Soekarno No.144, Beji, Kec. Junrejo, Kota Batu, Jawa Timur.",
            "Jl. Jatim Park II, Temas, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Dewi Sartika Atas, Sisir, Kec. Batu, Kota Batu, Jawa Timur.",
            "Dusun Wonorejo, Desa, Tulungrejo, Kec. Bumiaji, Kota Batu, Jawa Timur.",
            "Jl. Hayam Wuruk No.1, Oro-Oro Ombo, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Gn. Banyak, Gunungsari, Kec. Bumiaji, Kota Batu, Jawa Timur",
            "Jl. Raya Tlekung No.315, Tlekung, Kec. Junrejo, Kota Batu, Jawa Timur.",
            "Gg. Mbah Ba’i, Gunungsari, Kec. Bumiaji, Kota Batu, Jawa Timur.",
            "Jl. Terusan Sultan Agung No.2, Ngaglik, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Gn. Banyak, Songgokerto, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Oro-Oro Ombo No.9A, Sisir, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Diponegoro, Sisir, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Gn. Banyak, Gunungsari, Kec. Bumiaji, Kota Batu, Jawa Timur.",
            "Jl. Kartika No.2, Sisir, Kec. Batu, Kota Batu, Jawa Timur.",
            "Jl. Raya Selecta No.1, Tulungrejo, Kec. Bumiaji, Kota Batu, Jawa Timur.",
            "Bulukerto, Kec. Bumiaji, Kota Batu, Jawa Timur.",
            "Jl. Truno Joyo, Jurangrejo, Pandesari, Kec. Pujon, Kab. Malang, Jawa Timur."
    };

    private static String [] wisataNoTelp = {
            "081336172460",
            "081336172461",
            "081336172462",
            "081336172463",
            "081336172464",
            "081336172465",
            "081336172466",
            "081336172467",
            "081336172468",
            "081336172469",
            "081336172470",
            "081336172471",
            "081336172472",
            "081336172473",
            "081336172474",
            "081336172475",
            "081336172476"
    };

    private static String [] wisataLonlat = {
            "-7.896862797138822, 112.5527164553295",
            "-7.888702433407652, 112.52957468312239",
            "-7.884362904667813, 112.52487483507358",
            "-7.80315274612592, 112.51639305090505",
            "-7.896356505759345, 112.53455322940388",
            "-7.854235855862723, 112.49800708301254",
            "-7.912896761263726, 112.54846214338234",
            "-7.8495693368513235, 112.49424382960888",
            "-7.8784326193760155, 112.51986372993781",
            "-7.854792996406958, 112.4966963184926",
            "-7.888437414947045, 112.52769979875264",
            "-7.870948216478152, 112.52675175670272",
            "-7.854725996483551, 112.49786947197906",
            "-7.883677657099256, 112.52498080072861",
            "-7.818061719120414, 112.52530724091336",
            "-7.828058153115207, 112.52957128742466",
            "-7.854221024815378, 112.48568636993458",
    };

    private static String [] wisataHargaTiket = {
            "150.000",
            "150.000",
            "150.000",
            "30.000",
            "50.000",
            "60.000",
            "40.000",
            "55.000",
            "59.000",
            "63.000",
            "67.000",
            "71.000",
            "75.000",
            "79.000",
            "83.000",
            "87.000",
            "87.000",
    };

    private static int [] wisataFoto = {
            R.drawable.foto_1,
            R.drawable.foto_2,
            R.drawable.foto_3,
            R.drawable.foto_4,
            R.drawable.foto_5,
            R.drawable.foto_6,
            R.drawable.foto_7,
            R.drawable.foto_8,
            R.drawable.foto_9,
            R.drawable.foto_10,
            R.drawable.foto_11,
            R.drawable.foto_12,
            R.drawable.foto_13,
            R.drawable.foto_14,
            R.drawable.foto_15,
            R.drawable.foto_16,
            R.drawable.foto_17
    };

    public static ArrayList<ClsWisata> getListData() {
        ArrayList<ClsWisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNama.length; position++) {
            ClsWisata ClsWisata = new ClsWisata();
            ClsWisata.setNama(wisataNama[position]);
            ClsWisata.setDeskripsi(wisataDeskripsi[position]);
            ClsWisata.setAlamat(wisataAlamat[position]);
            ClsWisata.setHarga_tiket(wisataHargaTiket[position]);
            ClsWisata.setLonlat(wisataLonlat[position]);
            ClsWisata.setNo_telp(wisataNoTelp[position]);
            ClsWisata.setFoto(wisataFoto[position]);
            list.add(ClsWisata);
        }
        return list;
    }
}
