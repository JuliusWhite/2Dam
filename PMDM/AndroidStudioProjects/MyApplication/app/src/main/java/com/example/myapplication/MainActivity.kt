package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var hInicial: Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado","onCreate")
        hInicial = System.currentTimeMillis();
    }

    override fun onStart(){
        super.onStart();
        Log.d("Estado","onStart")
    }

    override fun onPause() {
        super.onPause();
        Log.d("Estado","onPause")
        var hfinal: Long = System.currentTimeMillis();
        var t:Long= ((hfinal-hInicial) / 1000) % 60;
        Log.d("Estado","Tiempo transcurrido: " + t + "s.")
        var txtosaludo: TextView = findViewById(R.id.orientation)
        txtosaludo.text = t.toString() + " seconds"
    }

    override fun onRestart() {
        super.onRestart();
        Log.d("Estado","onRestart");
    }

    override fun onDestroy(){
        super.onDestroy();
        Log.d("Estado","onDestroy")
    }

    override fun onResume(){
        super.onResume();
        Log.d("Estado","onResume")
    }

}