package com.yuri.dominandoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//AppCompatActivity permite usar alguns recursos mais recentes, nas versões mais antigas do Android
class MainActivity : AppCompatActivity() {
    //Em kotlin , object é Any
    //Unit é void
    //Funções são públicas por padrão
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}