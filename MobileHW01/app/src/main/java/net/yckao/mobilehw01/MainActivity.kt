package net.yckao.mobilehw01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.yckao.utils.TypefaceUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TypefaceUtil.overrideFont(applicationContext, "SERIF", "fonts/NotoSans-Regular.ttf")
        setContentView(R.layout.activity_main)

        cleanBtn.setOnClickListener { cleanData() }
        enterBtn.setOnClickListener { enterData() }
    }

    fun cleanData() {
        mail.text = ""
        name.text = ""
        mailInput.setText("")
        nameInput.setText("")
    }


    fun enterData() {
        name.text = nameInput.text
        mail.text = mailInput.text
    }
}
