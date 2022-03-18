package binar.ganda.challenge3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        two_btn.setOnClickListener {
            val name = et_name.text.toString()

            val proceed = Intent(this, Activity3::class.java)

            val bund = Bundle()
            bund.putString("data_name", name)
            proceed.putExtras(bund)
            startActivity(proceed)




        }
    }
}