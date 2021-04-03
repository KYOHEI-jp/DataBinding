package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //MainActivity2と紐づける
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bindingにMainActivity2をセットする
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        //MainActivityのidついているウィジェットを使用出来るようになる。
        binding.textViewId.text = "Shiva2"
    }
}