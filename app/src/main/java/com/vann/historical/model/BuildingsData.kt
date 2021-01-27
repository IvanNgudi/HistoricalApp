package com.vann.historical.model

import com.vann.historical.R

object BuildingsData {

    val listBuilding: ArrayList<Building>
        get() {
            val list = arrayListOf<Building>()
            for (data in dataBuildings) {
                val building = Building()
                building.name        = data[0].toString()
                building.location    = data[1].toString()
                building.photo       = Integer.valueOf(data[2].toString())
                building.description = data[3].toString()
                list.add(building)
            }
            return list
        }

    private var dataBuildings = arrayOf(
        arrayOf("Candi Borobudur", "Magelang", R.drawable.borobudur, "Candi Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia.\n" +
                "\n" +
                "Monumen ini terdiri atas enam teras berbentuk bujur sangkar yang di atasnya terdapat tiga pelataran melingkar, pada dindingnya dihiasi dengan 2.672 panel relief dan aslinya terdapat 504 arca Buddha. Borobudur memiliki koleksi relief Buddha terlengkap dan terbanyak di dunia. Stupa utama terbesar teletak di tengah sekaligus memahkotai bangunan ini, dikelilingi oleh tiga barisan melingkar 72 stupa berlubang yang di dalamnya terdapat arca Buddha tengah duduk bersila dalam posisi teratai sempurna dengan mudra (sikap tangan) Dharmachakra mudra (memutar roda dharma).\n" +
                "\n" +
                "Monumen ini merupakan model alam semesta dan dibangun sebagai tempat suci untuk memuliakan Buddha sekaligus berfungsi sebagai tempat ziarah untuk menuntun umat manusia beralih dari alam nafsu duniawi menuju pencerahan dan kebijaksanaan sesuai ajaran Buddha. Para peziarah masuk melalui sisi timur dan memulai ritual di dasar candi dengan berjalan melingkari bangunan suci ini searah jarum jam, sambil terus naik ke undakan berikutnya melalui tiga tingkatan ranah dalam kosmologi Buddha. Ketiga tingkatan itu adalah Kāmadhātu (ranah hawa nafsu), Rupadhatu (ranah berwujud), dan Arupadhatu (ranah tak berwujud). Dalam perjalanannya para peziarah berjalan melalui serangkaian lorong dan tangga dengan menyaksikan tak kurang dari 1.460 panel relief indah yang terukir pada dinding dan pagar langkan.\n" +
                "\n" +
                "Menurut bukti-bukti sejarah, Borobudur ditinggalkan pada abad ke-14 seiring melemahnya pengaruh kerajaan Hindu dan Buddha di Jawa serta mulai masuknya pengaruh Islam. Dunia mulai menyadari keberadaan bangunan ini sejak ditemukan 1814 oleh Sir Thomas Stamford Raffles, yang saat itu menjabat sebagai Gubernur Jenderal Inggris atas Jawa. Sejak saat itu Borobudur telah mengalami serangkaian upaya penyelamatan dan pemugaran (perbaikan kembali). Proyek pemugaran terbesar digelar pada kurun waktu 1975 hingga 1982 atas upaya Pemerintah Republik Indonesia dan UNESCO, kemudian situs bersejarah ini masuk dalam daftar Situs Warisan Dunia.\n" +
                "\n" +
                "Borobudur kini masih digunakan sebagai tempat ziarah keagamaan; tiap tahun umat Buddha yang datang dari seluruh Indonesia dan mancanegara berkumpul di Borobudur untuk memperingati Trisuci Waisak. Dalam dunia pariwisata, Borobudur adalah objek wisata tunggal di Indonesia yang paling banyak dikunjungi wisatawan."),
        arrayOf("Candi Prambanan", "Yogyakarta", R.drawable.prambanan_dt, "Candi Prambanan adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wisnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah. Berdasarkan prasasti Siwagrha nama asli kompleks candi ini adalah Siwagrha (bahasa Sanskerta yang bermakna 'Rumah Siwa'), dan memang di garbagriha (ruang utama) candi ini bersemayam arca Siwa Mahadewa setinggi tiga meter yang menujukkan bahwa di candi ini dewa Siwa lebih diutamakan.\n" +
                "\n" +
                "Kompleks candi ini terletak di kecamatan Prambanan, Sleman, DI Yogyakarta dan kecamatan Prambanan, Kabupaten Klaten, Jawa Tengah kurang lebih 17 kilometer timur laut Yogyakarta, 50 kilometer barat daya Surakarta dan 120 kilometer selatan Semarang, persis di perbatasan antara provinsi Jawa Tengah dan Daerah Istimewa Yogyakarta. Letaknya sangat unik, Candi Prambanan terletak di wilayah administrasi desa Bokoharjo, Prambanan, Sleman, sedangkan pintu masuk kompleks Candi Prambanan terletak di wilayah adminstrasi desa Tlogo, Prambanan, Klaten.\n" +
                "\n" +
                "Candi ini adalah termasuk Situs Warisan Dunia UNESCO, candi Hindu terbesar di Indonesia, sekaligus salah satu candi terindah di Asia Tenggara. Arsitektur bangunan ini berbentuk tinggi dan ramping sesuai dengan arsitektur Hindu pada umumnya dengan candi Siwa sebagai candi utama memiliki ketinggian mencapai 47 meter menjulang di tengah kompleks gugusan candi-candi yang lebih kecil. Sebagai salah satu candi termegah di Asia Tenggara, candi Prambanan menjadi daya tarik kunjungan wisatawan dari seluruh dunia.\n" +
                "\n" +
                "Menurut prasasti Siwagrha, candi ini mulai dibangun pada sekitar tahun 850 masehi oleh Rakai Pikatan, dan terus dikembangkan dan diperluas oleh Balitung Maha Sambu, pada masa kerajaan Medang Mataram."),
        arrayOf("Taman Sari",  "Yogyakarta", R.drawable.tamansari, "TamanSari adalah situs bekas taman atau kebun istana Keraton Ngayogyakarta Hadiningrat, yang dapat dibandingkan dengan Kebun Raya Bogor sebagai kebun Istana Bogor. Kebun ini dibangun pada zaman Sultan Hamengku Buwono I (HB I) pada tahun 1758-1765/9. Awalnya, taman yang mendapat sebutan \"The Fragrant Garden\" ini memiliki luas lebih dari 10 hektare dengan sekitar 57 bangunan baik berupa gedung, kolam pemandian, jembatan gantung, kanal air, maupun danau buatan beserta pulau buatan dan lorong bawah air. Kebun yang digunakan secara efektif antara 1765-1812 ini pada mulanya membentang dari barat daya kompleks Kedhaton sampai tenggara kompleks Magangan. Namun saat ini, sisa-sisa bagian Taman Sari yang dapat dilihat hanyalah yang berada di barat daya kompleks Kedhaton saja.\n" +
                "\n" +
                "Konon, Taman Sari dibangun di bekas keraton lama, Pesanggrahan Garjitawati, yang didirikan oleh Susuhunan Paku Buwono II sebagai tempat istirahat kereta kuda yang akan pergi ke Imogiri. Sebagai pimpinan proyek pembangunan Taman Sari ditunjuklah Tumenggung Mangundipuro. Seluruh biaya pembangunan ditanggung oleh Bupati Madiun, Tumenggung Prawirosentiko, beserta seluruh rakyatnya. Oleh karena itu daerah Madiun dibebaskan dari pungutan pajak. Di tengah pembangunan pimpinan proyek diambil alih oleh Pangeran Notokusumo, setelah Mangundipuro mengundurkan diri. Walaupun secara resmi sebagai kebun kerajaan, namun bebrapa bangunan yang ada mengindikasikan Taman Sari berfungsi sebagai benteng pertahanan terakhir jika istana diserang oleh musuh. Konon salah seorang arsitek kebun kerajaan ini adalah seorang Portugis yang lebih dikenal dengan Demang Tegis.\n" +
                "\n" +
                "Kompleks Taman Sari setidaknya dapat dibagi menjadi 4 bagian. Bagian pertama adalah danau buatan yang terletak di sebelah barat. Bagian selanjutnya adalah bangunan yang berada di sebelah selatan danau buatan antara lain Pemandian Umbul Binangun. Bagian ketiga adalah Pasarean Ledok Sari dan Kolam Garjitawati yang terletak di selatan bagian kedua. Bagian terakhir adalah bagian sebelah timur bagian pertama dan kedua dan meluas ke arah timur sampai tenggara kompleks Magangan."),
        arrayOf("Benteng Vredeburg", "Yogyakarta", R.drawable.vredeburg, "Benteng Vredeburg Yogyakarta berdiri terkait erat dengan lahirnya Kasultanan Yogyakarta. Perjanjian Giyanti 13 Februari 1755 yang berrhasil menyelesaikan perseteruan antara Susuhunan Pakubuwono III dengan Pangeran Mangkubumi (Sultan Hamengku Buwono I kelak) adalah merupakan hasil politik Belanda yang selalu ingin ikut campur urusan dalam negeri raja-raja Jawa waktu itu.\n" +
                "\n" +
                "Melihat kemajuan yang sangat pesat akan kraton yang didirikan oleh Sultan Hamengku Buwono I, rasa kekhawatiran pihak Belanda mulai muncul. Pihak Belanda mengusulkan kepada sultan agar diizinkan membangun sebuah benteng di dekat kraton. Pembangunan tersebut dengan dalih agar Belanda dapat menjaga keamanan kraton dan sekitarnya. Akan tetapi dibalik dalih tersebut maksud Belanda yang sesungguhnya adalah untuk memudahkan dalam mengontrol segala perkembangan yang terjadi di dalam kraton. Letak benteng yang hanya satu jarak tembak meriam dari kraton dan lokasinya yang menghadap ke jalan utama menuju kraton menjadi indikasi bahwa fungsi benteng dapat dimanfaatkan sebagai benteng strategi, intimidasi, penyerangan dan blokade. Dapat dikatakan bahwa berdirinya benteng tersebut dimaksudkan untuk berjaga-jaga apabila sewaktu-waktu Sultan memalingkan muka memusuhi Belanda.\n" +
                "\n" +
                "Besarnya kekuatan yang tersembunyi dibalik kontrak politik yang dilahirkan dalam setiap perjanjian dengan pihak Belanda seakan-akan menjadi kekuatan yang sulit dilawan oleh setiap pemimpin pribumi pada masa kolonial Belanda. Dalam hal ini termasuk pula Sri Sultan Hamengku Buwono I. Oleh karena itu permohonan izin Belanda untuk membangun benteng dikabulkan."),
        arrayOf("Lawang Sewu", "Semarang", R.drawable.lawangsewu, "Lawang Sewu adalah gedung bersejarah di Indonesia yang berlokasi di Kota Semarang, Jawa Tengah. Gedung ini, dahulu yang merupakan kantor dari Nederlands-Indische Spoorweg Maatschappij atau NIS. Dibangun pada tahun 1904 dan selesai pada tahun 1907. Terletak di bundaran Tugu Muda yang dahulu disebut Wilhelminaplein.\n" +
                "\n" +
                "Masyarakat setempat menyebutnya Lawang Sewu karena bangunan tersebut memiliki pintu yang sangat banyak, meskipun kenyataannya, jumlah pintunya tidak mencapai seribu. Bangunan ini memiliki banyak jendela yang tinggi dan lebar, sehingga masyarakat sering menganggapnya sebagai pintu (lawang).\n" +
                "\n" +
                "Bangunan kuno dan megah berlantai dua ini setelah kemerdekaan dipakai sebagai kantor Djawatan Kereta Api Repoeblik Indonesia (DKARI) atau sekarang PT Kereta Api Indonesia. Selain itu pernah dipakai sebagai Kantor Badan Prasarana Komando Daerah Militer (Kodam IV/Diponegoro) dan Kantor Wilayah (Kanwil) Kementerian Perhubungan Jawa Tengah. Pada masa perjuangan gedung ini memiliki catatan sejarah tersendiri yaitu ketika berlangsung peristiwa Pertempuran lima hari di Semarang (14 Oktober - 19 Oktober 1945). Gedung tua ini menjadi lokasi pertempuran yang hebat antara pemuda AMKA atau Angkatan Muda Kereta Api melawan Kempetai dan Kidobutai, Jepang. Maka dari itu Pemerintah Kota Semarang dengan Surat Keputusan Wali Kota Nomor. 650/50/1992, memasukan Lawang Sewu sebagai salah satu dari 102 bangunan kuno atau bersejarah di Kota Semarang yang patut dilindungi.\n" +
                "\n" +
                "Saat ini bangunan tua tersebut telah mengalami tahap konservasi dan revitalisasi yang dilakukan oleh Unit Pelestarian benda dan bangunan bersejarah PT Kereta Api Persero"),
        arrayOf("Keraton Yogyakarta", "Yogyakarta", R.drawable.keratonyk, "Keraton Yogyakarta merupakan istana resmi Kesultanan Ngayogyakarta Hadiningrat yang kini berlokasi di Kota Yogyakarta, Daerah Istimewa Yogyakarta, Indonesia. Walaupun kesultanan tersebut secara resmi telah menjadi bagian Republik Indonesia pada tahun 1950, kompleks bangunan keraton ini masih berfungsi sebagai tempat tinggal sultan dan rumah tangga istananya yang masih menjalankan tradisi kesultanan hingga saat ini. Keraton ini kini juga merupakan salah satu objek wisata di Kota Yogyakarta. Sebagian kompleks keraton merupakan museum yang menyimpan berbagai koleksi milik kesultanan, termasuk berbagai pemberian dari raja-raja Eropa, replika pusaka keraton, dan gamelan. Dari segi bangunannya, keraton ini merupakan salah satu contoh arsitektur istana Jawa yang terbaik, memiliki balairung-balairung mewah dan lapangan serta paviliun yang luas. Keraton Yogyakarta mulai didirikan oleh Sultan Hamengku Buwono I beberapa bulan pasca Perjanjian Giyanti pada tahun 1755. Lokasi keraton ini konon adalah bekas sebuah pesanggarahan yang bernama Garjitawati. Pesanggrahan ini digunakan untuk istirahat iring-iringan jenazah raja-raja Mataram (Kartasura dan Surakarta) yang akan dimakamkan di Imogiri. Versi lain menyebutkan lokasi keraton merupakan sebuah mata air, Umbul Pacethokan, yang ada di tengah hutan Beringan. Sebelum menempati Keraton Yogyakarta, Sultan Hamengku Buwono I berdiam di Pesanggrahan Ambar Ketawang yang sekarang termasuk wilayah Kecamatan Gamping Kabupaten Sleman.\n" +
                "\n" +
                "Secara fisik istana para Sultan Yogyakarta memiliki tujuh kompleks inti yaitu Siti Hinggil Ler (Balairung Utara), Kamandhungan Ler (Kamandhungan Utara), Sri Manganti, Kedhaton, Kamagangan, Kamandhungan Kidul (Kamandhungan Selatan), dan Siti Hinggil Kidul (Balairung Selatan). Selain itu Keraton Yogyakarta memiliki berbagai warisan budaya baik yang berbentuk upacara maupun benda-benda kuno dan bersejarah. Di sisi lain, Keraton Yogyakarta juga merupakan suatu lembaga adat lengkap dengan pemangku adatnya. Oleh karenanya tidaklah mengherankan jika nilai-nilai filosofi begitu pula mitologi menyelubungi Keraton Yogyakarta. Dan untuk itulah pada tahun 1995 Komplek Keraton Ngayogyakarta Hadiningrat dicalonkan untuk menjadi salah satu Situs Warisan Dunia UNESCO."),
        arrayOf("Monumen Nasional", "Jakarta", R.drawable.monas, "Tugu Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda. Pembangunan monumen ini dimulai pada tanggal 17 Agustus 1961 di bawah perintah presiden Sukarno dan dibuka untuk umum pada tanggal 12 Juli 1975. Tugu ini dimahkotai lidah api yang dilapisi lembaran emas yang melambangkan semangat perjuangan yang menyala-nyala. Monumen Nasional terletak tepat di tengah Lapangan Medan Merdeka, Jakarta Pusat. Setelah pusat pemerintahan Republik Indonesia kembali ke Jakarta setelah sebelumnya berkedudukan di Yogyakarta pada tahun 1950, menyusul pengakuan kedaulatan Republik Indonesia oleh pemerintah Belanda pada tahun 1949, Presiden Sukarno mulai merencanakan pembangunan sebuah Monumen Nasional yang setara dengan Menara Eiffel di lapangan tepat di depan Istana Merdeka. Pembangunan Tugu Monas bertujuan mengenang dan melestarikan perjuangan bangsa Indonesia pada masa revolusi kemerdekaan 1945, agar terus membangkitkan inspirasi dan semangat patriotisme generasi penerus bangsa. Setelah pusat pemerintahan Republik Indonesia kembali ke Jakarta setelah sebelumnya berkedudukan di Yogyakarta pada tahun 1950, menyusul pengakuan kedaulatan Republik Indonesia oleh pemerintah Belanda pada tahun 1949, Presiden Sukarno mulai merencanakan pembangunan sebuah Monumen Nasional yang setara dengan Menara Eiffel di lapangan tepat di depan Istana Merdeka. Pembangunan Tugu Monas bertujuan mengenang dan melestarikan perjuangan bangsa Indonesia pada masa revolusi kemerdekaan 1945, agar terus membangkitkan inspirasi dan semangat patriotisme generasi penerus bangsa.\n" +
                "\n" +
                "Pada tanggal 17 Agustus 1954, sebuah komite nasional dibentuk dan sayembara perancangan Monumen Nasional digelar pada tahun 1955. Terdapat 51 karya yang masuk, akan tetapi hanya satu karya yang dibuat oleh Frederich Silaban yang memenuhi kriteria yang ditentukan komite, antara lain menggambarkan karakter bangsa Indonesia dan dapat bertahan selama berabad-abad. Sayembara kedua digelar pada tahun 1960 tetapi sekali lagi tak satupun dari 136 peserta yang memenuhi kriteria. Ketua juri kemudian meminta Silaban untuk menunjukkan rancangannya kepada Sukarno. Akan tetapi Sukarno kurang menyukai rancangan itu dan ia menginginkan monumen itu berbentuk lingga dan yoni. Silaban kemudian diminta merancang monumen dengan tema seperti itu, akan tetapi rancangan yang diajukan Silaban terlalu luar biasa sehingga biayanya sangat besar dan tidak mampu ditanggung oleh anggaran negara, terlebih kondisi ekonomi saat itu cukup buruk. Silaban menolak merancang bangunan yang lebih kecil dan menyarankan pembangunan ditunda hingga ekonomi Indonesia membaik. Sukarno kemudian meminta arsitek R.M. Soedarsono untuk melanjutkan rancangan itu. Soedarsono memasukkan angka 17, 8 dan 45, melambangkan 17 Agustus 1945 memulai Proklamasi Kemerdekaan Indonesia, ke dalam rancangan monumen itu. Tugu Peringatan Nasional ini kemudian dibangun di areal seluas 80 hektare. Tugu ini diarsiteki oleh Frederich Silaban dan R. M. Soedarsono, mulai dibangun 17 Agustus 1961."),
        arrayOf("Menara Kudus", "Kudus", R.drawable.menarakudus, "Masjid Menara Kudus adalah masjid kuno yang dibangun oleh Sunan Kudus sejak tahun 1549 Masehi (956 Hijriah). Lokasi saat ini berada di Desa Kauman, Kecamatan Kota, Kabupaten Kudus, Jawa Tengah. Ada keunikan dari masjid ini karena memiliki menara yang serupa bangunan candi serta pola arsitektur yang memadukan konsep budaya Islam dengan budaya Hindu-Buddhis sehingga menunjukkan terjadinya proses akulturasi dalam pengislaman Jawa.\n" +
                "\n" +
                "Sehari-hari, peziarah berkunjung ke masjid ini untuk beribadah sekaligus ziarah ke makam Sunan Kudus yang terletak di sisi barat kompleks masjid. Selain itu, masjid ini menjadi pusat keramaian pada Festival Dhandhangan yang diadakan warga Kudus untuk menyambut bulan suci Ramadan. Berdirinya Masjid Menara Kudus tidak terlepas dari peran Sunan Kudus sebagai penggagas dan pendiri. Sebagaimana Walisongo yang lainnya, Sunan Kudus menggunakan pendekatan kultural (budaya) dalam berdakwah. Ia mengadaptasi dan melakukan pribumisasi ajaran Islam di tengah masyarakat yang telah memiliki budaya mapan dalam pengaruh agama Hindu dan Buddha. Akulturasi budaya Hindu dan Budha dalam dakwah Islam yang dilakukan Sunan Kudus terlihat jelas pada arsitektur dan konsep bangunan Masjid Menara Kudus.\n" +
                "\n" +
                "Masjid ini mulai didirikan pada tahun 956 H atau 1549 M. Hal ini didasarkan pada inskripsi berbahasa Arab yang tertulis pada prasasti batu berukuran lebar 30 cm dan panjang 46 cm yang terletak pada mihrab masjid. Peletakan batu pertama menggunakan batu dari Baitul Maqdis di Palestina, oleh karena itu masjid ini kemudian dinamakan Masjid Al Aqsha."),
        arrayOf("Candi Gedong Songo", "Semarang", R.drawable.gedongsongo, "Candi Gedong Songo adalah nama sebuah kompleks bangunan candi peninggalan budaya Hindu yang terletak di desa Candi, Kecamatan Bandungan, Kabupaten Semarang, Jawa Tengah, Indonesia tepatnya di lereng Gunung Ungaran. Di kompleks candi ini terdapat sembilan buah candi.\n" +
                "\n" +
                "Candi ini diketemukan oleh Raffles pada tahun 1804 dan merupakan peninggalan budaya Hindu dari zaman Wangsa Syailendra abad ke-9 (tahun 927 masehi).\n" +
                "\n" +
                "Candi ini memiliki persamaan dengan kompleks Candi Dieng di Wonosobo. Candi ini terletak pada ketinggian sekitar 1.200 m di atas permukaan laut sehingga suhu udara di sini cukup dingin (berkisar antara 19-27 °C)\n" +
                "\n" +
                "Lokasi sembilan candi yang tersebar di lereng Gunung Ungaran ini memiliki pemandangan alam yang indah. Selain itu, objek wisata ini juga dilengkapi dengan pemandian air panas dari mata air yang mengandung belerang, area perkemahan, dan wisata berkuda. Untuk menempuhnya, diperlukan perjalanan sekitar 40 menit dari Kota Ambarawa dengan jalanan yang naik, dan kemiringannya sangat tajam (rata-rata mencapai 40 derajat). Lokasi candi juga dapat ditempuh dalam waktu 10 menit dari objek wisata Bandungan."),
        arrayOf("Gedung Sate", "Bandung", R.drawable.gedungsate, "dengan ciri khasnya berupa ornamen tusuk sate pada menara sentralnya, telah lama menjadi penanda atau markah tanah Kota Bandung yang tidak saja dikenal masyarakat di Jawa Barat, tetapi juga seluruh Indonesia bahkan model bangunan itu dijadikan pertanda bagi beberapa bangunan dan tanda-tanda kota di Jawa Barat. Misalnya bentuk gedung bagian depan Stasiun Kereta Api Tasikmalaya. Mulai dibangun tahun 1920, gedung berwarna putih ini masih berdiri kokoh namun anggun dan kini berfungsi sebagai gedung pusat pemerintahan Jawa Barat.\n" +
                "\n" +
                "Gedung Sate yang pada masa Hindia Belanda itu disebut Gouvernements Bedrijven (GB), peletakan batu pertama dilakukan oleh Johanna Catherina Coops, puteri sulung Wali kota Bandung, B. Coops dan Petronella Roelofsen, mewakili Gubernur Jenderal di Batavia, J.P. Graaf van Limburg Stirum pada tanggal 27 Juli 1920, merupakan hasil perencanaan sebuah tim yang terdiri dari Ir.J.Gerber, arsitek muda kenamaan lulusan Fakultas Teknik Delft Nederland, Ir. Eh. De Roo dan Ir. G. Hendriks serta pihak Gemeente van Bandoeng, diketuai Kol. Pur. VL. Slors dengan melibatkan 2000 pekerja, 150 orang di antaranya pemahat, atau ahli bongpay pengukir batu nisan dan pengukir kayu berkebangsaan Cina yang berasal dari Konghu atau Kanton, dibantu tukang batu, kuli aduk dan peladen yang berasal dari penduduk Kampung Sekeloa, Kampung Coblong Dago, Kampung Gandok dan Kampung Cibarengkok, yang sebelumnya mereka menggarap Gedong Sirap (Kampus ITB) dan Gedong Papak (Balai Kota Bandung).\n" +
                "\n" +
                "\n" +
                "Gedung Sate (ca.1920-28)\n" +
                "Selama kurun waktu 4 tahun pada bulan September 1924 berhasil diselesaikan pembangunan induk bangunan utama Gouverments Bedrijven, termasuk kantor pusat PTT (Pos, Telepon dan Telegraf) dan Perpustakaan.\n" +
                "\n" +
                "Arsitektur Gedung Sate merupakan hasil karya arsitek Ir. J.Gerber dan kelompoknya yang tidak terlepas dari masukan maestro arsitek Belanda Dr.Hendrik Petrus Berlage, yang bernuansakan wajah arsitektur tradisional Nusantara.")
    )
}

   /* private val buildingNames = arrayOf("Candi Borobudur",
            "Candi Prambanan",
            "TamanSari",
            "Benteng Vredeburg",
            "Lawang Sewu",
            "Keraton Yogyakarta",
            "Monumen Nasional",
            "Menara Kudus",
            "Candi Gedong Songo",
            "Gedung Sate")

    private val buildingLocations = arrayOf("Magelang",
            "Yogyakarta",
            "Yogyakarta",
            "Yogyakarta",
            "Semarang",
            "Yogyakarta",
            "Jakarta",
            "Kudus",
            "Semarang",
            "Bandung")

    private val buildingImages = intArrayOf(
        R.drawable.borobudur,
        R.drawable.prambanan,
        R.drawable.tamansari,
        R.drawable.vredeburg,
        R.drawable.lawangsewu,
        R.drawable.keratonyk,
        R.drawable.monas,
        R.drawable.menarakudus,
        R.drawable.gedongsongo,
        R.drawable.gedungsate
    )
}
*/
