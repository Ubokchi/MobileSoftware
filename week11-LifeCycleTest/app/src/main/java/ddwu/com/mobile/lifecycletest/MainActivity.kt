package ddwu.com.mobile.lifecycletest

import android.os.Bundle
import android.util.Log
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.com.mobile.lifecycletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "Parent"
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.textView.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        Log.v(TAG, "$TAG - onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "$TAG - onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, "$TAG - onRestart()")

    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "$TAG - onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "$TAG - onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, "$TAG - onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "$TAG - onDestroy()")
    }
}