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
    val user: User,
) : Parcelable

object FeedsData {
    val dummy = Feed(0, "", "", "", "", "", User(0, "", "", ""))

    val feeds = listOf(
        Feed(
            0,
            "Jual ubi enak mantap harga murah. Minat hubungi 08232232738237288.",
            "https://i.postimg.cc/HxPzXX8K/ubi.jpg",
            "Sukabumi - Rp.2000/Kg",
            "1 jam yang lalu",
            "Beli",
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
            User(
                10,
                "Zaenal Andrian",
                "https://i.guim.co.uk/img/media/33c508e9f0c30a90df363e3b5cc3925f0b70f5b6/0_0_3600_2159/master/3600.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=6c1e047f1edc4a54f1770458201ed69e",
                "Petani"
            )
        ),
    )
}