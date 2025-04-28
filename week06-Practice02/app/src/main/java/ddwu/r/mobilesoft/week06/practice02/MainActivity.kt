package ddwu.r.mobilesoft.week06.practice02

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.r.mobilesoft.week06.practice02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val mainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    var selectedIdx = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.myCustomView.setOnLongClickListener {
            val builder : AlertDialog.Builder = AlertDialog.Builder(this).apply {
                setSingleChoiceItems(R.array.colors, selectedIdx) {
                        dialoginterface : DialogInterface?, idx : Int ->
                    selectedIdx = idx
                }
                setTitle("색상 선택")
                setNegativeButton("취소", null)
                setPositiveButton("확인") {
                        dialogInterface : DialogInterface?, idx : Int ->
                    if (selectedIdx == 0)
                        mainBinding.myCustomView.paintColor = Color.RED
                    else if (selectedIdx == 1)
                        mainBinding.myCustomView.paintColor = Color.CYAN
                    else
                        mainBinding.myCustomView.paintColor = Color.BLUE

                    mainBinding.myCustomView.invalidate()
                }
            }

            builder.show()
            true
        }
    }
}