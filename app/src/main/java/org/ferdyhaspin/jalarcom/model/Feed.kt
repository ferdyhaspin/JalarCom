package org.ferdyhaspin.jalarcom.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by ferdyhaspin on 30/12/22.
 */

@Parcelize
class Feed(
    val id: Int,
    val caption: String,
    val photo: String,
    val location: String,
    val createdAt: String,
    val type: String,
    val desc: String,
    val benefit: String,
    val user: User,
) : Parcelable

object FeedsData {
    val dummy = Feed(0, "", "", "", "", "", "", "", User(0, "", "", ""))

    val feeds = listOf(
        Feed(
            0,
            "Jual ubi enak mantap harga murah. Minat hubungi 08232232738237288.",
            "https://i.postimg.cc/HxPzXX8K/ubi.jpg",
            "Sukabumi - Rp.2000/Kg",
            "1 jam yang lalu",
            "Beli",
            "Salah satu kultivar pisang dari kelompok kultivar ABB. Pisang ini termasuk kelompok pisang olah (plantain) karena tinggi kandungan patinya.",
            "Ada suatu senyawa yang berfungsi dalam mengobati penyakit batu darah yang diakibatkan adanya luka atau peradangan di dalam paru-paru. Dengan mengkonsumsi jenis pisang kepok ini maka akan membantu dalam mengatasinya.",
            User(
                0,
                "Martin Escobar",
                "https://i.postimg.cc/cHK9DFWZ/martin.jpg",
                "Pengepul"
            )
        ),
        Feed(
            1,
            "Ubi mantap harga murah bisa COD.",
            "https://i.postimg.cc/8PbHm2vM/ubi2.jpg",
            "Bogor - Rp.1800/Kg",
            "4 jam yang lalu",
            "Jual",
            "Buah yang masih satu suku dengan semangka atau labu-labuan jenis lain. Buah ini biasa di gunakan sebagai hidangan sebelum makan, di buat jus buah atau di gunakan sebagai campuran es buah. Buah dengan rasa manis yang khas dan daging buah yang lembut akan terasa segar dan nikmat jika di makan di siang hari yang panas.Melon sendiri merupakan tumbuhan satu musim yang tumbuh secara menjalar pada tiang penyangga yang sengaja di sediakan oleh petani buah ketika membudidayakan melon. Tumbuhan buah ini merupakan jenis tumbuhan yang berumah satu, yang mana perkawinan buah ini dapat di lakukan dengan bantuan angin dan sentuhan yang lain.",
            "Buah melon mengandung vitamin C yang berguna baik untuk  kesehatan. Perharinya, Anda bisa mengonsumsi satu cangkir melon, yang sama dengan kebutuhan harian vitamin C Anda. Vitamin C berguna baik untuk tubuh, karena bisa meningkatkan sistem kekebalan tubuh dan membantu mencegah penyakit serta infeksi yang menyerang.",
            User(
                1,
                "Steven James",
                "https://i.postimg.cc/NGkT310w/steven.jpg",
                "Petani"
            )
        ),
        Feed(
            2,
            "Dijual murah ubi mantap. silahkan dibeli brader",
            "https://i.postimg.cc/jSPR1hsH/ubi3.jpg",
            "Cianjur - Rp.3000/Kg",
            "12 jam yang lalu",
            "Jual",
            "Buah yang masih satu suku dengan semangka atau labu-labuan jenis lain. Buah ini biasa di gunakan sebagai hidangan sebelum makan, di buat jus buah atau di gunakan sebagai campuran es buah. Buah dengan rasa manis yang khas dan daging buah yang lembut akan terasa segar dan nikmat jika di makan di siang hari yang panas.Melon sendiri merupakan tumbuhan satu musim yang tumbuh secara menjalar pada tiang penyangga yang sengaja di sediakan oleh petani buah ketika membudidayakan melon. Tumbuhan buah ini merupakan jenis tumbuhan yang berumah satu, yang mana perkawinan buah ini dapat di lakukan dengan bantuan angin dan sentuhan yang lain.",
            "Buah melon mengandung vitamin C yang berguna baik untuk  kesehatan. Perharinya, Anda bisa mengonsumsi satu cangkir melon, yang sama dengan kebutuhan harian vitamin C Anda. Vitamin C berguna baik untuk tubuh, karena bisa meningkatkan sistem kekebalan tubuh dan membantu mencegah penyakit serta infeksi yang menyerang.",
            User(
                2,
                "Cecep Subagja",
                "https://i.postimg.cc/7PRDYRh1/cecep.jpg",
                "Petani"
            )
        ),
        Feed(
            3,
            "Ubi jalar mantap enak untuk digoreng maupun di rebus. free ongkir.",
            "https://i.postimg.cc/BvNbhCgh/ubi11.jpg",
            "Ciawi - Rp.3800/Kg",
            "1 hari yang lalu",
            "Jual",
            "Jenis pisang dengan nama lain pisang cavendish. Pisang Ambon terdiri dari beragam jenis misalnya pisang Ambon lumut, pisang Ambon putih, pisang Ambon kuning, dan sebagainya. Pisang Ambon merupakan hasil perkembangbiakkan genetis dengan kultur jaringan. Pisang Ambon yang umum ditemui memiliki kulit yang halus berwarna hijau atau kuning dengan daging putih dan manis serta tidak berbiji atau berbiji sangat halus. Pisang Ambon berukuran cukup besar ",
            "Antasida alami sangat penting untuk mencegah sakit maag. Sehingga jika kamu menderita sakit maag, perbanyaklah mengonsumsi pisang.",
            User(
                3,
                "Fajar Sidik",
                "https://t4.ftcdn.net/jpg/02/24/86/95/360_F_224869519_aRaeLneqALfPNBzg0xxMZXghtvBXkfIA.jpg",
                "Pengepul",
            )
        ),
        Feed(
            4,
            "Jual ubi jalar termurah dibogor.",
            "https://i.postimg.cc/9X9V0p7v/ubi8.jpg",
            "Bogor - Rp.4500/Kg",
            "2 hari yang lalu",
            "Jual",
            "Jenis terong yang berbentuk bulat kecil. Terong lalap mudah dibudidayakan di lahan perkebunan, ladang, sawah, perkarangan rumah, dll. Terong lalap banyak dimanfaatkan untuk berbagai kepentingan dengan salah satunya dapat diolah untuk dijadikan aneka kuliner masakan dengan cita rasa yang melezatkan. Terong lalap dapat dimasak untuk dijadikan semur terong, tumis terong, dll.",
            "adalah menurunkan kadar kolesterol. Umumnya makanan yang mampu untuk menurunkan kadar gula darah juga memiliki kemampuan untuk menurunkan kolesterol. Kondisi kadar gula darah tinggi dapat menyebabkan kadar kolesterol jahat serta trigliserida meningkat.",
            User(
                4,
                "M Ihsan Basuki",
                "https://i.pinimg.com/originals/90/52/10/9052103321a96a84d18baa467db2b40d.jpg",
                "Pengepul",
            )
        ),
        Feed(
            5,
            "Cari ubi jalar harga terbaik diangkut",
            "https://i.postimg.cc/JnGrpCtn/ubi5.jpg",
            "Sumedang - Rp.4000/Kg",
            "3 hari yang lalu",
            "Beli",
            "Ubi adalah istilah untuk tanaman yang memiliki umbi atau bagian akar yang membesar dan bisa dijadikan makanan karena menumpuknya nutrisi di bagian ini. Walaupun orang Indonesia biasanya merujuk istilah ubi kepada ketela pohon, ",
            "Walaupun tidak termasuk dalam keluarga kentang-kentangan biasa, ubi jalar memiliki efek antiperadangan. Didukung betakaroten, vitamin C, dan magnesium, ubi jalar sangat efektif dalam menyembuhkan peradangan internal maupun eksternal.",
            User(
                5,
                "Rohdian Al Ahad",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5kDOTPlrJlffieEK-I38ODBZF4D6H2NSCEw&usqp=CAU",
                "Pengepul",
            )
        ),
        Feed(
            6,
            "Monggo di liat dulu guys.",
            "https://i.postimg.cc/FKnmdCGQ/ubi6.jpg",
            "Cisalopa - Rp.1000/Kg",
            "6 hari yang lalu",
            "Beli",
            " Tanaman perdu ini berasal dari Semenanjung Yukatan di Meksiko, Amerika Tengah, dan di sana dikenal dengan nama â€œchayaâ€. Di daerah asalnya, tanaman chaya dianggap sangat berharga oleh masyarakat pedesaan dan digunakan untuk makanan, tanaman obat, serta untuk tanaman hias. Chaya telah dikonsumsi oleh orang-orang dari suku Maya sejak zaman pra-Columbus dan hingga kini masih terus dikonsumsi oleh masyarakat modern.\n\n",
            "Bahkan bila dibandingkan dengan bayam, daun ini jauh lebih bernutrisi: 78% lebih banyak protein, 111% lebih banyak serat, 100% lebih banyak zat besi, dan 242% lebih banyak vitamin C. Melihat kandungan nutrisinya yang tinggi, daun ini pastilah bermanfaat bagi kesehatan tubuh. Salah satunya adalah sebagai penambah darah dan pencegah anemia yang lebih besar jika mengonsumsi daun chaya ini.",
            User(
                6,
                "Husein Al-Habsyi",
                "https://wp.en.aleteia.org/wp-content/uploads/sites/2/2017/04/web3-muslim-man-face-young-beard-head-shutterstock_122151928-shutterstock.jpg",
                "Petani"
            )
        ),
        Feed(
            7,
            "Harga murah meriah bisa di COD.",
            "https://i.postimg.cc/gkvYSDcv/ubi7.jpg",
            "Cianjur - Rp.3500/Kg",
            "1 minggu yang lalu",
            "Jual",
            "Jenis labu berbentuk 'unik' yang di luar negeri dikenal dengan nama Pumpkin Butternut atau Butternut Squash adalah jenis labu yang kini mulai menjadi tren pangan sehat alami di berbagai negara.\nBerbeda dengan jenis labu lainnya, labu madu memiliki rasa daging buah yang sangat manis sehingga disebut sebagai labu madu, namun meski meiliki rasa yang sangat manis, labu ini memiliki kandungan gula dan kalori yang relatife rendah, sehingga bisa menjadi pangan alternatif yang aman dikonsumsi oleh siapa saja.",
            "Kandungan gizinya yang cukup tinggi, membuat jenis labu yang berbentuk unik ini, semakin banyak dicari sebagai bahan pangan alternative yang sangat bermanfaat bagi kesehatan. Labu ini memiliki warna daging kuning mentega sehingga disebut butternut, mengandung  serat yang tinggi, antioksidan, beta karoten, vitamin A dan B Complek  serta zat besi yang cukup tinggi.\n" +
                    "Salah satu manfaat buah ini adalah mampu mengontrol gula darah dan mengurangi resiko terkena penyakit diabetes karena rendah kalori.",
            User(
                7,
                "Ali Farlan Seychan",
                "https://static.toiimg.com/imagenext/toiblogs/photo/blogs/wp-content/uploads/2017/04/asaduddin_fp_0211_dlhtoi_4c.jpg",
                "Pengepul"
            )
        ),
        Feed(
            8,
            "Ubi Jalar mantap terenak lansunng dari petani.",
            "https://i.postimg.cc/YS8BcnTW/ubi4.jpg",
            "Bogor - Rp.2500/Kg",
            "3 minggu yang lalu",
            "Beli",
            "Dalam bahasa Sunda disebut Tangkil, merupakan suatu spesies tanaman berbiji terbuka (Gymnospermae) berbentuk pohon yang berasal dari Asia tropik, melanesia, dan Pasifik Barat. Melinjo dikenal pula dengan nama belinjo, mlinjo (bahasa Jawa), tangkil (bahasa Sunda) atau bago (bahasa Melayu dan bahasa Tagalog), Khalet (Bahasa Kamboja). Melinjo banyak ditanam di pekarangan sebagai peneduh atau pembatas pekarangan dan terutama dimanfaatkan buah dan daunnya.",
            "Kandungan mangan di dalamnya sangat penting untuk fungsi otak dan juga mengobati gangguan saraf. Sedangkan superoksida menghilangkan radikal bebas dari tubuh yang meliputi jalur saraf. Melinjo baik juga untuk kesehatan dan pertumbuhan. Sangat penting untuk mencegah sistem kerangka, kardiovaskular, dan saraf. Baik untuk pertumbuhan jaringan dan organ yang sehat.",
            User(
                8,
                "Siti Maryam Ulfah",
                "https://www.harapanrakyat.com/wp-content/uploads/2021/06/Adab-Berbicara-Wanita-Muslimah-Berdasarkan-Agama-Islam.jpg",
                "Petani"
            )
        ),
        Feed(
            9,
            "Ubi enak manis harga murah, bisa cod, termurah, terpercaya. minat hubungi 08237737732\nBisa COD lur.",
            "https://i.postimg.cc/WpGKxfrb/ubi9.jpg",
            "Ciawi - Rp.1500/Kg",
            "1 tahun yang lalu",
            "Jual",
            "Tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar untuk tumbuhan tersebut berbunga pada tahun kedua. Batang bunga tumbuh setinggi sekitar 1 m, dengan bunga berwarna putih, dan rasa yang manis langu. Bagian yang dapat dimakan dari wortel adalah bagian umbi atau akarnya.",
            "Berbagai penelitian menunjukan jika wortel mentah terbukti dapat membantu menurunkan resiko kanker usus, kanker payudara hingga kanker paru – paru. Penelitian terbaru bahkan menunjukan jika wortel mentah mengandung zat falcarinol dan falcarindiol yang termasuk ke dalam zat anti kanker. Falcarinol sendiri merupakan sejenis pestida alami yang dihasilkan oleh wortel guna melawan penyakit tanaman yang diakibatkan oleh jamur.",
            User(
                9,
                "Andy Muhammad",
                "https://img.freepik.com/free-photo/young-bearded-man-with-striped-shirt_273609-5677.jpg",
                "Petani"
            )
        ),
        Feed(
            10,
            "Ubi Jalar dengan kualitas terbaik.",
            "https://i.postimg.cc/MTR469F5/ubi10.jpg",
            "Megamendung - Rp.7000/Kg",
            "1 tahun yang lalu",
            "Beli",
            "Paprika atau lada manis atau capsicum (Capsicum Annum) yang berwarna hijau. Buah polong berukuran sedang ini memiliki bentuk lonceng yang indah, kulit tebal dan rapuh dengan penutup luar yang mengkilap dan tekstur berdaging. Karena rasanya yang cukup menyengat, ia dikategorikan sebagai sayuran dan bukan bumbu. Namun, sayuran ini tidak hanya membuat makanan kita menjadi enak, tetapi mereka juga memiliki sejumlah besar manfaat. ",
            "Selain menjaga kesehatan usus besar, paprika hijau juga memainkan peran penting dalam mengurangi risiko kanker usus besar. Vitamin antioksidan (A, B9 dan C) dianggap sebagai faktor utama yang bertanggung jawab untuk ini.",
            User(
                10,
                "Zaenal Andrian",
                "https://i.guim.co.uk/img/media/33c508e9f0c30a90df363e3b5cc3925f0b70f5b6/0_0_3600_2159/master/3600.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=6c1e047f1edc4a54f1770458201ed69e",
                "Petani"
            )
        ),
    )
}