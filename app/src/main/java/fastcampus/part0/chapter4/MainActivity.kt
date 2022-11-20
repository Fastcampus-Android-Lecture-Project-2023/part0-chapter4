package fastcampus.part0.chapter4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test() {
        val a : Int = Math.random().toInt()
        if(a < 0) {
            println("hello")
        } else {

        }
    }
}
