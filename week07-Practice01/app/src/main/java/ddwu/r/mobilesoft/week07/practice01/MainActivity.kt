package ddwu.r.mobilesoft.week07.practice01

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.r.mobilesoft.week07.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = "MainActicityTAG"
    lateinit var viewBinding: ActivityMainBinding
    var SoupSelected01 = false
    var SoupSelected02 = false
    var NoodleSelected01 = false
    var NoodleSelected02 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_foods, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.SoupItem01 -> {
                Log.i(TAG, "김치찌개 맛있어요!")
                SoupSelected01 = !SoupSelected01
                true
            }
            R.id.SoupItem02 -> {
                Log.i(TAG, "순두부찌개 맛있어요!")
                SoupSelected02 = !SoupSelected02
                true
            }
            R.id.NoodleItem01 -> {
                Log.i(TAG, "짜장면 맛있어요!")
                NoodleSelected01 = !NoodleSelected01
                true
            }
            R.id.NoodleItem02 -> {
                Log.i(TAG, "파스타 맛있어요!")
                NoodleSelected02 = !NoodleSelected02
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val soupItemCheck01: MenuItem? = menu?.findItem(R.id.SoupItem01)
        soupItemCheck01?.isChecked = SoupSelected01

        val soupItemCheck02: MenuItem? = menu?.findItem(R.id.SoupItem02)
        soupItemCheck02?.isChecked = SoupSelected01

        val noodleItemCheck01: MenuItem? = menu?.findItem(R.id.NoodleItem01)
        noodleItemCheck01?.isChecked = NoodleSelected01

        val noodleItemCheck02: MenuItem? = menu?.findItem(R.id.NoodleItem02)
        noodleItemCheck02?.isChecked = NoodleSelected02

        return true
    }
}