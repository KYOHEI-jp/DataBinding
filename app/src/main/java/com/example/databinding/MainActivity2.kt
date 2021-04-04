package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //MainActivity2と紐づける
    lateinit var binding: ActivityMain2Binding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bindingにMainActivity2をセットする
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        //viewModelクラスのインスタンスを作成
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.editText.observe(this, Observer {
            if (viewModel.isEmailValid(it.toString())) {
                Log.d("Email text:", it.toString())
                viewModel.error.value = null
            } else {
                viewModel.error.value = "This email is not valid"
            }
        })

        viewModel.textData.value = "KYOHEI Test Text"
        viewModel.btnText.value = "OKOKOKOK"
    }
}