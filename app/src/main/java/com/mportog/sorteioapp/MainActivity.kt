package com.mportog.sorteioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortNumber(view: View ){
        var text = findViewById<View>(R.id.displayText) as TextView
        var sorted = Random().nextInt(51)
        text.setText("Número sorteado: $sorted")
    }

}