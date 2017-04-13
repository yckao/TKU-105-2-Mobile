package net.yckao.mobilehw02

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openBtn.setOnClickListener { lightChange() }
        offBtn.setOnClickListener { lightChange() }
        lightBtn.setOnClickListener { showToast(resources.getString(R.string.click)) }
    }

    fun lightChange() {
        if (count++%2 == 0) {
            lightBtn.background = getDrawable(R.drawable.img_light)
            showToast(getString(R.string.openLight))
        } else {
            lightBtn.background = getDrawable(R.drawable.light)
            showToast(getString(R.string.closeLight))
        }
    }
    fun showToast(message: String) {
        var toast = Toast.makeText(this,message, 0)
        toast.show()

        var handler = Handler()
        handler.postDelayed({toast.cancel()}, 500)
    }
}
