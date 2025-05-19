package ddwu.com.mobile.actvitiysavetest

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.com.mobile.actvitiysavetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainTAG"
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        
//        binding.myView.posX = savedInstanceState?.getFloat("x") ?: 200.0f

//        val pref = getSharedPreferences("save_state", 0)
//        binding.myView.posY = pref.getFloat("y", 200.0f)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


//    override fun onPause() {
//        super.onPause()
//        val pref: SharedPreferences = getSharedPreferences("save_state", 0)
//        val editor: SharedPreferences.Editor = pref.edit()
//        editor.putFloat("y", binding.myView.posY)
//        editor.commit()
//    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState?.putFloat("x", binding.myView.posX)
//    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        binding.myView.posX = savedInstanceState?.getFloat("x") ?: 200.0f
//    }
}