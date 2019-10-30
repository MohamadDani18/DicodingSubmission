package com.Dani.bacakomik;

import java.util.ArrayList;

public class KomiksData {
    private static String[] komikNames = {
            "One Piece",
            "Naruto",
            "Bleach",
            "Fairy Tail",
            "Death Note",
            "Conan",
            "Hunter X Hunter",
            "Full Metal Alchemist",
            "Beelzebub",
            "Inuyasha"
    };

    private static String[] komikDetails = {
            "Manga karya Eichiiro Oda ini punya cerita tentang petualangan para bajak laut mencari harta karun bernama “One Piece”. Para bajak laut tersebut dipimpin oleh Monkey D. Luffy yang terkenal dnegan topi jeraminya. Sampai sekarang, manga One Piece masih memegang rekor penjualan terbanyak dan tercepat di seluruh dunia.",
            "Manga yang satu ini bercerita tentang seorang anak bernama Uzumaki Naruto yang bercita-cita menjadi Hokage (ninja terhebat). Namun, sebuah monster di dalam tubuhnya buat dia jadi incaran organisasi bernama Akatsuki. Dilihat dari ceritanya, banyak sisi positif yang bisa diambil dari manga ciptaan Masashi Kishimoto ini. Bukan hanya manganya, anime Naruto juga sudah ditayangkan di banyak negara.",
            "Manga populer lainnya adalah Bleach ciptaan Tite Kubo. Manga ini menampilkan Ichigo Kurokasi yang punya kekuatan dewa kematian. Kurosaki punya tugas untuk melindungi manusia dari roh-roh jahat yang disebut Hollows. Manga Bleach pun sudah diadaptasi ke dalam anime dan live action movie.",
            "Cerita tentang kehidupan penyihir bernama Natsu Dragneel. Dia bergabung ke dalam kelompok Fairy Tale Guild yang punya banyak misi untuk umat manusia dan penyihir lainnya. Fairy Tail adalah salah satu manga terlaris yang dibuat oleh Hiro Mashima. Manga ini pun sudah diadaptasi ke dalam anime dan juga sangat laris di dunia.",
            "Ada satu cerita yang cukup unik dari sebuah manga. Seri manga Death Note bercerita tentang sebuah catatan yang bisa bikin orang mati hanya dengan menuliskannya nama lengkapnya di sana. Karakter bernama Light Yagami kebetulan menemukan buku milik dewa kematian tersebut dan mulai menggunakannya. Manga ini dikarang oleh Tsugumi Ohba. Live action movie Death Note pun cukup lari di banyak negara",
            "Gosho Aoyama jadi orang yang paling dicari untuk ditanyai kelanjutan manga Detective Conan. Cerita tentang Shinicihi Kudo yang terjebak dalam tubuh anak-anak karena dipaksa minum obat dari organisasi hitam. Shinichi Kudo pun harus mengganti jati dirinya menjadi Conan Edogawa sambil mencari organisasi untuk mencari penawarnya.",
            "Manga karya Yoshihiro Togashi ini punya cerita yang bagus dan cukup memuaskan. Seorang anak bernama Gon ingin jadi hunter profesional dengan mendapatkan lisensi. Setelah itu, dia ingin mencari keberadaan ayahnya. Manga dan anime Hunter X Hunter sudah dibaca dan ditonton oleh jutaan orang. Kamu sudah?",
            "Seorang alchemist bernama Edward Elric mau mengembalikan ibunya yang sudah meninggal. Namun, sebuah kesalahan malah buat sebagian dirinya berubah. Bukan hanya itu, saudaranya juga malah menjadi baju perang. Full Metal Alchemist juga sudah dibuatkan versi anime dan live action movie.",
            "Manga ini merpukana karya Ryuhei Tamura yang mengisahkan seorang remaja bernama Oga Tatsumi. Dia menemukan pria yang mengambang di sungai. Pria tersebut terbelah dua dan mengeluarkan anak bayi (Beelzebub). Oga pun harus berperan menjadi orang tua bayi tersebut. Cerita dari manga ini cukup lucu untuk diikuti.",
            "Petualangan dari manga Inuyasha cukup apik untuk diikuti. Inuyasha harus bertarung dengan saudaranya sendiri yang berniat menghancurkan manusia. Dia dibantu oleh seorang manusia bernama Kagome. Selain manga, anime Inuyasha juga cukup laris di Indonesia, loh"

    };

    private static int[] komikImages = {
            R.drawable.onepiece,
            R.drawable.naruto,
            R.drawable.bleach,
            R.drawable.fairytail,
            R.drawable.deathnote,
            R.drawable.conan,
            R.drawable.hunter,
            R.drawable.fullmetal,
            R.drawable.belzebub,
            R.drawable.inuyasa
    };

    private static String[] komikGenres = {
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure",
            "action, horror, adventure"
    };

    static ArrayList<komik> getListData(){
        ArrayList<komik> list = new ArrayList<>();
        for (int position = 0; position < komikNames.length; position++){
            komik komik = new komik();
            komik.setGenre(komikGenres[position]);
            komik.setName(komikNames[position]);
            komik.setDetail(komikDetails[position]);
            komik.setPhoto(komikImages[position]);
            list.add(komik);
        }
        return list;
    };
}
