package dev.matyaqubov.secretkeywithcmake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("native-lib")
    }

    private external fun stringFromJNI(): String?
    var ss=stringFromJNI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("@@@", "onCreate:$ss ")
    }
}