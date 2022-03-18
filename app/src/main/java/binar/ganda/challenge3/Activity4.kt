package binar.ganda.challenge3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_4.*

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        four_btn.setOnClickListener {

            val usia = et_usia.text.toString()

            /* if (usia % 2 == 0) {
                "Usia Genap"
            } else {
                "Usia Ganjil"
            }*/

            val alamat = et_alamat.text.toString()
            val pekerjaan = et_pekerjaan.text.toString()

            val proceed = Intent(this, Activity3::class.java)

            val bund = Bundle()
            bund.putString("data_usia", usia)
            bund.putString("data_alamat", alamat)
            bund.putString("data_pekerjaan", pekerjaan)

            proceed.putExtras(bund)
            startActivity(proceed)

        }
    }
}