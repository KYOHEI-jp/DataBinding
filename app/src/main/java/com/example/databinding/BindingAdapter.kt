package com.example.databinding

import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("app:textWatcher")

fun watcher(view: EditText, textWatcher: TextWatcher) {

    view.addTextChangedListener(textWatcher)

}

@BindingAdapter("app:error")
fun error(view: TextInputLayout, errorString: String) {
    view.isErrorEnabled = true
    view.error = errorString
}