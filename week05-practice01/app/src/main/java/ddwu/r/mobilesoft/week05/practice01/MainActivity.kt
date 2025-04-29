package ddwu.r.mobilesoft.week05.practice01

import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.r.mobilesoft.week05.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        val myClick = object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                mainBinding.myCustomView.posX = event!!.x
                mainBinding.myCustomView.posY = event!!.y
                mainBinding.myCustomView.invalidate()

                return false
            }
        }
        mainBinding.myCustomView.setOnTouchListener(myClick)

        val myLongClick = object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                mainBinding.myCustomView.paintColor = Color.BLUE

                return true
            }
        }
        mainBinding.myCustomView.setOnLongClickListener(myLongClick)
    }
}