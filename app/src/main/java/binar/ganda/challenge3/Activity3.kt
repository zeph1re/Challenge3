package binar.ganda.challenge3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val bund = intent.extras
        val name = bund?.getString("data_name")
        val usia = bund?.getString("data_usia")
        val alamat = bund?.getString("data_alamat")
        val pekerjaan = bund?.getString("data_pekerjaan")

        tv_nama.text = name

        val usiaA = usia?.toInt()
        val value: String
        if (usiaA != null) {
            value = if (usiaA % 2 == 0) {
                "$usia, bernilai Genap"
            } else {
                "$usia, bernilai Ganjil"
            }

            tv_return.text = """
                $name
                $value
                $alamat
                $pekerjaan
            """.trimIndent()

        }
        
        three_btn.setOnClickListener {
            startActivity(Intent(this, Activity4::class.java))
        }


    }
}