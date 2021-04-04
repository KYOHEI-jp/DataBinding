package com.example.databinding

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    var textData = MutableLiveData<String>()

    var btnText = MutableLiveData<String>()

    var editText = MutableLiveData<String>()

    fun onClick(view: View) {
        textData.value = "Text success"
        btnText.value = "Done"
    }

}