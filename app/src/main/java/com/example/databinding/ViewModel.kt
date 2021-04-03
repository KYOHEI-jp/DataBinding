package com.example.databinding

import android.view.View
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    var textData = "TEST"

    var btnText = "OK"

    fun onClick(view: View) {
        textData = "Text success"
        btnText = "Done"
    }

}