package org.ferdyhaspin.jalarcom.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by ferdyhaspin on 30/12/22.
 */

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val photo: String,
    val type : String
) : Parcelable