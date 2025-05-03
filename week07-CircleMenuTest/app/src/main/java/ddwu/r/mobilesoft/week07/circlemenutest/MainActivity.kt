package ddwu.r.mobilesoft.week07.circlemenutest

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.r.mobilesoft.week07.circlemenutest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding

    var RedSelected = false
    var GreenSelected = false
    var BlueSelected = false

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.size_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.Bigger -> {
                mainBinding.myCustomView.radius += 10f
                mainBinding.myCustomView.invalidate()
                true
            }
            R.id.Smaller -> {
                mainBinding.myCustomView.radius -= 10f
                mainBinding.myCustomView.invalidate()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val RedCheck: MenuItem? = menu?.findItem(R.id.Red)
        RedCheck?.isChecked = RedSelected

        val GreenCheck: MenuItem? = menu?.findItem(R.id.Green)
        GreenCheck?.isChecked = GreenSelected

        val BlueCheck: MenuItem? = menu?.findItem(R.id.Blue)
        BlueCheck?.isChecked = BlueSelected

        return true
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        when (v?.id) {
            R.id.myCustomView ->
                menuInflater.inflate(R.menu.color_menu, menu)
        }
     }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Red -> {
                RedSelected = !RedSelected
                mainBinding.myCustomView.paintColor = Color.RED
                mainBinding.myCustomView.invalidate()
                true
            }
            R.id.Green -> {
                GreenSelected = !GreenSelected
                mainBinding.myCustomView.paintColor = Color.GREEN
                mainBinding.myCustomView.invalidate()
                true
            }
            R.id.Blue -> {
                BlueSelected = !BlueSelected
                mainBinding.myCustomView.paintColor = Color.BLUE
                mainBinding.myCustomView.invalidate()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        registerForContextMenu(mainBinding.myCustomView)
    }
}