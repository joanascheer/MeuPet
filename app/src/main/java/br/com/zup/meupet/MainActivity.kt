package br.com.zup.meupet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.button)
        botaoMensagem.setOnClickListener {
            Toast.makeText(this, "Oi, meu nome é Márcia!", Toast.LENGTH_SHORT).show()
        }
    }
}