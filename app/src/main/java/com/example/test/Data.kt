package com.example.test

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(val valute: String, val country: String?) : Parcelable
