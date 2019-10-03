package com.dicoding.submission;

import java.util.ArrayList;

public class DataBook {
    private static String[] bukuNama = {
            "Meluruskan Miskonsepsi Bumi Datar",
            "My Brief History",
            "A Brief History of Time",
            "The Grand Design",
            "Perang Salib Timur dan Barat",
            "EVOLUSI Dari Teori ke Fakta",
            "Buku Pintar Sejarah Islam",
            "Jerusalem: The Biography",
            "Sebuah Seni untuk Bersikap Bodo Amat",
            "Asal Mula"
    };
    private static String[] isbnBuku = {
            " - ",
            "9786020300061",
            "9789792292121",
            "9789792264395",
            "9786025469695",
            "9786024810016",
            "9786021791950",
            "9786029193022",
            "9786024526986",
            "9786024812034"
    };
    private static String[] halamanBuku = {
            "182",
            "305",
            "201",
            "206",
            "244",
            "370",
            "1218",
            "912",
            "256",
            "306"

    };
    private static String[] deskripsiBuku = {
            "Buku ini membahas kajian sains baik dari sisi historis, konseptual, dan teknis untuk garis besar topik sains yang dipahami secara keliru oleh flat earther. Topiknya meliputi gravitasi, air, dinamika gerak, bentuk Bumi, satelit, roket, dan Bulan.",
            "My Brief History menceritakan perjalanan luar biasa Stephen Hawking, dari masa kecilnya di London sesudah Perang Dunia II sampai menjadi pesohor yang terkenal di seluruh dunia. Dilengkapi foto-foto yang jarang terlihat, buku singkat, kocak, dan cerdas ini memperkenalkan pembaca dengan seorang Hawking yang belum tampak di buku-buku terdahulu: anak sekolah yang ingin tahu dan dijuluki \"Einstein\" oleh teman-temannya; orang yang suka bercanda dan pernah bertaruh dengan temannya perihal keberadaan lubang hitam; serta suami dan ayah muda yang berjuang untuk mendapat tempat di dunia akademia.",
            "A Brief History of Time mengajak kita menjelajahi dunia ajaib lubang hitam dan kuark, antizat dan “panah waktu”, ledakan besar dan peran Tuhan di alam semesta beserta segala kemungkinan yang luar biasa dan tak terduga. Dengan penggambaran yang menarik dan menggugah imajinasi, Stephen Hawking membawa kita makin dekat ke rahasia pamungkas penciptaan alam semesta.",
            "Dalam buku ini, Stephen Hawking dan Leonard Mlodinow menyajikan pemikiran sains terkini mengenai misteri alam semesta, dalam bahasa nonteknis yang cemerlang sekaligus sederhana. Buku ini adalah buku pedoman singkat, jelas, dan menyentak, yang menyajikan penemuanpenemuan yang akan mengubah pemahaman sekaligus mengusik keyakinan; buku ini mencerahkan dan menohok. Buku yang tiada duanya",
            "Perang Salib merupakan peperangan yang paling bersejarah di dunia karena melibatkan faktor paling rumit dan paling pribadi dalam diri manusia yaitu agama atau kepercayaan. Sebelum membahas Perang Salib lebih jauh, alangkah baiknya kita mengerti dulu apa arti Perang Salib yang sesungguhnya. Perang Salib adalah peperangan yang terjadi antara pasukan Kristen dari berbagai kerajaan di Eropa dengan pasukan Islam yang bertujuan untuk merebut Kota Suci Yerusalem dari kekuasaan Islam (Sinclair, 1995: 57). Pengertian tersebut merupakan mayoritas arti Perang Salib yang dipahami orang-orang pada masa sekarang. Pengertian tersebut dapat dipersempit lagi, yaitu dengan melibatkan kata agama, yang artinya peperangan yang terjadi antara Kristen dengan Islam dalam merebut Yerusalem. Jika pemahaman tersebut dijadikan suatu kebenaran mutlak, maka akan timbul persepsi yang saling menyudutkan antara Kristen dan Islam.",
            "Sejak digagas Charles Darwin pada 1859, evolusi telah dikukuhkan statusnya sebagai fakta dan bukan hanya teori. Evolusi menjadi inti ilmu biologi berikut satu-satunya penjelasan ilmiah untuk kemunculan keragaman makhluk hidup. Penjelasan paling otoritatif atas evolusi bisa didapat dari seorang yang ikut terlibat membangun teori evolusi modern, Ernst Mayr. Buku ini tuntas menjelaskan segala seluk-beluk evolusi dengan jernih. Mayr memaparkan bukti-bukti evolusi, cara kerja evolusi, konsep yang mendasari teori evolusi, juga menjawab berbagai keraguan terhadap evolusi. Siapa pun yang ingin tahu tentang evolusi, baik setuju, menentang, maupun ragu-ragu, akan paham evolusi dengan membaca buku ini",
            "Buku ini memaparkan sejarah Islam dan menjelaskannya dari sudut pandang Islam: sejak masa Nabi Muhammad, Khalifah Empat, Dinasti Umayah, Dinasti Abbasiyah, hingga masa kini; sejak muncul di Makkah hingga merekah di penjuru dunia. Tak hanya menyuguhkan catatan manis saat Islam tampil sebagai kekuatan yang mewarnai peradaban dunia, tapi juga saat Islam sebagai kekuatan politik mengalami kemunduran dan paceklik. Bagaimana Islam berkonfrontasi atau berasimilasi secara alami dengan bangsa dan budaya lain.Lebih dari itu, melalui buku ini, kita tak hanya diajak menengok masa lalu, tapi menjadikan masa lalu sebagai cermin, memilah dan memilih yang relevan untuk menafsirkan masa kini dan untuk menjadi pijakan membangun masa depan. Sebab, sejarah tak hanya memaparkan peristiwa, tapi juga menjejakkan makna.",
            "Dalam buku yang sangat memikat ini, riwayat Yerusalem dikisahkan melalui cerita perang, cinta, dan wahyu yang melibatkan pria dan wanita: raja, ratu, nabi, penyair, orang suci, penakluk, dan pelacursosok-sosok yang menciptakan, menghancurkan, mencatat, dan memercayai keyakinan masing-masing di Yerusalem. Di dalamnya, tertampilkan pula beragam karakter tokoh-tokoh berpengaruh dalam sejarah dunia: dari Suleiman al-Qanuni dan Shalahuddin al-Ayyubi (Saladin) hingga Cleopatra, Caligula, dan Churchill; dari Ibrahim sampai Yesus dan Muhammad; dari Izebel, Nebukadnezar, Herod, dan Nero di zaman kuno hingga Kaiser, Disraeli, Mark Twain, Rasputin, dan Lawrence dari Arabia di masa modern.",
            "Selama beberapa tahun belakangan, Mark Manson melalui blognya yang sangat populer telah membantu mengoreksi harapan-harapan delusional kita, baik mengenai diri kita sendiri maupun dunia. Ia kini menuangkan buah pikirnya yang keren itu di dalam buku hebat ini.\nDalam hidup ini, kita hanya punya kepedulian dalam jumlah yang terbatas. Makanya, Anda harus bijaksana dalam menentukan kepedulian Anda. Manson menciptakan momen perbincangan yang serius dan mendalam, dibungkus dengan cerita-cerita yang menghibur dan 'kekinian', serta humor yang cadas. Buku ini merupakan tamparan di wajah yang menyegarkan untuk kita semua, supaya kita bisa mulai menjalani kehidupan yang lebih memuaskan, dan apa adanya.",
            "Manusia berusaha mencari tahu asal mula dirinya dan segalanya sejak dulu. Penelitian sains telah mengungkapkan bahwa asal mula manusia bukan hanya dari Bumi, melainkan juga bintang-bintang dan alam semesta. Kisah asal mula kita merentang sampai awal waktu serta kelahiran ruang dan seluruh zat. Asal Mula menceritakan bagaimana terjadinya alam semsta, bintang-bintang, planet-planet, dan kehidupan berdasarkan temuan-temuan sains, yang menunjukan betapa megahnya kosmos dan bagaimana kedudukan kita di dalamnya."
    };

    private static String[] pembuatBuku = {
            "Saintif",
            "Stephen Hawking",
            "Stephen Hawking",
            "Stephen Hawking & Leonard Mlodinow",
            "Jati Pamungkas",
            "Ernst Mayr",
            "Qasim A. Ibrahim &  Muhammad A. Saleh",
            "Simon Sebag Montefiore",
            "Mark Manson",
            "Neil Degrasse Tyson & Donald Goldsmith"
    };

    private static int[] imgBuku = {
            R.drawable.gambar_buku_miskonsepsi,
            R.drawable.gambar_buku_mybriefhistory,
            R.drawable.gambar_buku_abriefhistoryoftime,
            R.drawable.gambar_buku_thegranddesign,
            R.drawable.gambar_perang_salib,
            R.drawable.gambar_evolusi,
            R.drawable.gambar_buku_pintar_sejarah_islam,
            R.drawable.gambar_jerusalem,
            R.drawable.gambar_buku_seni_untuk,
            R.drawable.gambar_buku_asal_mula
    };

    private static String[] tahunTerbitBuku = {
            "2018",
            "2017",
            "2017",
            "2017",
            "2018",
            "2019",
            "2014",
            "2012",
            "2018",
            "2019"
    };

    private static String[] penerbitBuku = {
            "Diandra Kreatif",
            "Gramedia Pustaka Utama",
            "Gramedia Pustaka Utama",
            "Gramedia Pustaka Utama",
            "Anak Hebat Indonesia",
            "Kepustakaan Populer Gramedia",
            "Zaman",
            "Alvabet",
            "Gramedia Pustaka Utama",
            "Kepustakaan Populer Gramedia"
    };

    static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < bukuNama.length; position++) {

            Book book = new Book();
            book.setNama_buku(bukuNama[position]);
            book.setNama_penulis(pembuatBuku[position]);
            book.setNama_penerbit(penerbitBuku[position]);
            book.setDeskripsi_buku(deskripsiBuku[position]);
            book.setTahun_terbit(tahunTerbitBuku[position]);
            book.setHalaman_buku(halamanBuku[position]);
            book.setIsbn_buku(isbnBuku[position]);
            book.setImg_buku(imgBuku[position]);

            list.add(book);

        }
        return list;
    }
}
