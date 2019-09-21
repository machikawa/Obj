package machikawa.hidemasa.techacademy.obj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val abe = Human("あべ",60, "日本")
        val ichiro = Human("いちろう",45, "シアトル")

        abe.say()
        abe.think()

        ichiro.say()
        ichiro.think()
    }
}
