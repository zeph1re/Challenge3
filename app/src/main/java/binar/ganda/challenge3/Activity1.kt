package binar.ganda.challenge3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        one_btn.setOnClickListener {
            val proceed = Intent(this, Activity2::class.java)
            startActivity(proceed)
        }
    }
}