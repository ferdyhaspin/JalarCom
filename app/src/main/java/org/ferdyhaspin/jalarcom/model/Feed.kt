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
    val dummy = Feed(
        0,
        "Jual Pisang Mas enak mantap harga murah. Minat hubungi 08232232738237288.",
        "https://i.postimg.cc/4d8c5qnB/fruit-pisang-emas.jpg",
        "Sukabumi - Rp10.000/Kg",
        "1 jam yang lalu",
        "Penjual",
        "Salah satu kultivar pisang dari kelompok kultivar ABB. Pisang ini termasuk kelompok pisang olah (plantain) karena tinggi kandungan patinya.",
        "Ada suatu senyawa yang berfungsi dalam mengobati penyakit batu darah yang diakibatkan adanya luka atau peradangan di dalam paru-paru. Dengan mengkonsumsi jenis pisang kepok ini maka akan membantu dalam mengatasinya.",
        User(
            0,
            "Martin Escobar",
            "https://i.postimg.cc/cHK9DFWZ/martin.jpg",
            "Pengepul"
        )
    )

    val feeds = listOf(
        Feed(
            0,
            "Jual Pisang Mas enak mantap harga murah. Minat hubungi 08232232738237288.",
            "https://i.postimg.cc/4d8c5qnB/fruit-pisang-emas.jpg",
            "Sukabumi - Rp10.000/Kg",
            "1 jam yang lalu",
            "Penjual",
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
            "Melon segar mantap harga murah bisa COD.",
            "https://i.postimg.cc/yd7tMQBM/fruit-melon.jpg",
            "Bogor - Rp18.000/Kg",
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
            3,
            "Pisang Ambon mantap enak untuk digoreng maupun di rebus. free ongkir.",
            "https://i.postimg.cc/ZR9st12D/fruit-pisang-ambon.jpg",
            "Ciawi - Rp13.800/Kg",
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
            "Jual Semangka enak dan termurah dibogor.",
            "https://i.postimg.cc/k4Tm53gN/fruit-semangka.jpg",
            "Bogor - Rp10.000/Kg",
            "2 hari yang lalu",
            "Jual",
            "Semangka merupakan Tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci. Sebagaimana anggota suku ketimun-ketimunan lainnya, habitus tanaman ini merambat namun ia tidak dapat membentuk akar adventif dan tidak dapat memanjat. Jangkauan rambatan dapat mencapai belasan meter.",
            "Buah semangka mengandung 92% air dan elektrolit yang sangat baik untuk menghidrasi tubuh agar tidak kena dehidrasi. Manfaat semangka juga baik untuk membantu suhu tubuh tetap stabil dalam cuaca panas yang menyengat. Buah ini juga mengandung citruline dan arginine yang sama baiknya untuk kesehatan jantung. Sebuah jurnal yang diterbitkan oleh American Journal of Hypertension menemukan bawah arginine mampu menjaga sirkulasi darah yang dipompa oleh jantung. Arginine pun dapat membantu mengurangi lemak berlebih yang bisa menimbulkan kolesterol hingga serangan jantung mendadak.",
            User(
                4,
                "M Ihsan Basuki",
                "https://i.pinimg.com/originals/90/52/10/9052103321a96a84d18baa467db2b40d.jpg",
                "Pengepul",
            )
        ),
        Feed(
            5,
            "Cari Ubi Jalar harga terbaik diangkut",
            "https://i.postimg.cc/tCgK2MCw/veg-ubi.jpg",
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
            "Pengen cari Daun Pepaya Jepang.",
            "https://i.postimg.cc/Pq8hKFKT/veg-pepaya.jpg",
            "Cisalopa - Rp.1000/Kg",
            "6 hari yang lalu",
            "Beli",
            "Tanaman perdu ini berasal dari Semenanjung Yukatan di Meksiko, Amerika Tengah, dan di sana dikenal dengan nama â€œchayaâ€. Di daerah asalnya, tanaman chaya dianggap sangat berharga oleh masyarakat pedesaan dan digunakan untuk makanan, tanaman obat, serta untuk tanaman hias. Chaya telah dikonsumsi oleh orang-orang dari suku Maya sejak zaman pra-Columbus dan hingga kini masih terus dikonsumsi oleh masyarakat modern.\n\n",
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
            "Jual Labu Harga murah meriah bisa di COD.",
            "https://i.postimg.cc/MpgJcmw4/veg-labu.jpg",
            "Cianjur - Rp13.500/Kg",
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
            "Mangga Harum Manis segar mantap terenak lansunng dari petani.",
            "https://i.postimg.cc/vBBK31G9/fruit-mangga.jpg",
            "Bogor - Rp5.500/Kg",
            "3 minggu yang lalu",
            "Jual",
            "Jenis mangga yang berasal dari Jawa Timur, lebih tepatnya berasal dari wilayah Probolinggo. Buah Mangga Manalagi memiliki ukuran yang kecil dan sedang dengan kulit luar yang berwarna hijau dan tebal.Jika diperhatikan dengan seksama, maka Anda akan mendapatkan bahwa Mangga ini memiliki bintik-bintik putih yang lebih banyak dibandingkan dengan jenis mangga yang lain.\n\n",
            "Tubuh Anda sangat membutuhkan Antioksidan untuk menjaga sistem imun agar tidak mudah terserang penyakit. Mangga Manalagi memiliki kandungan Vitamin C yang sangat tinggi dan bisa memberi manfaat harian bagi tubuh. Vitamin C yang terkandung di dalamnya sangat bermanfaat untuk mentralkan radikal bebas pada tubuh dan meningkatkan sistem imunitas.",
            User(
                8,
                "Siti Maryam Ulfah",
                "https://www.harapanrakyat.com/wp-content/uploads/2021/06/Adab-Berbicara-Wanita-Muslimah-Berdasarkan-Agama-Islam.jpg",
                "Petani"
            )
        ),
        Feed(
            9,
            "Wrotel Import Enak enak manis harga murah, bisa cod, termurah, terpercaya. minat hubungi 08237737732\nBisa COD lur.",
            "https://i.postimg.cc/vHQVj5pp/veg-wortel.jpg",
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
            "Paprika dengan kualitas terbaik.",
            "https://i.postimg.cc/1RBB7R85/veg-pap.jpg",
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