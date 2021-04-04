package com.example.databinding

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    var textData = MutableLiveData<String>()
    var btnText = MutableLiveData<String>()
    var editText = MutableLiveData<String>()
    var error = MutableLiveData<String>()
    var emailText = MutableLiveData<String>()

    fun onClick(view: View) {
        textData.value = "Text success"
        btnText.value = "Done"
    }

    val emailTextWatcher: TextWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {

        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.d("Text Watcher :", s.toString())
        }

    }

}