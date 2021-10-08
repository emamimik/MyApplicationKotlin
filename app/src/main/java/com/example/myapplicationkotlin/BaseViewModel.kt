package com.example.myapplicationkotlin

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel

open class BaseViewModel() : ViewModel(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseViewModel> {
        override fun createFromParcel(parcel: Parcel): BaseViewModel {
            return BaseViewModel(parcel)
        }

        override fun newArray(size: Int): Array<BaseViewModel?> {
            return arrayOfNulls(size)
        }
    }
}