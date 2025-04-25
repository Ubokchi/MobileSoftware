package ddwu.r.mobilesoft.week03.practice

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun printInfo( view : View) {
        val name : EditText = findViewById(R.id.etName)
        val phone : EditText = findViewById(R.id.etPhone)

        Toast.makeText(this, "안녕하세요, 저는 ${name.text}입니다. 전화번호는 ${phone.text}입니다.", Toast.LENGTH_SHORT).show()
    }

    fun exit( view : View) {
        finish()
    }
}