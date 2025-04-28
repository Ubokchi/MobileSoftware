package ddwu.r.mobilesoft.week06.practice01

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import ddwu.r.mobilesoft.week06.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*viewBinding 관련 부분 작성할 것*/
    val mainBinding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnOutput.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setTitle("입력 확인")
                setMessage("${mainBinding.etInput.text}를 입력하시겠습니까?")
                setPositiveButton("네", {
                        dlgInterface: DialogInterface?, which : Int ->
                    mainBinding.tvDisplay.text = mainBinding.etInput.text
                })
                setNegativeButton("아니오", null)
                setCancelable(false)
            }

            builder.show()
        }
    }
}