package ddwu.r.mobilesoft.week09.recyclerviewtest

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import ddwu.r.mobilesoft.week09.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = "MainAvtivityTag"
    lateinit var binding : ActivityMainBinding
    val itemList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemList.add("모바일소프트웨어")
        itemList.add("웹프로그래밍")
        itemList.add("네트워크")
        itemList.add("시스템프로그래밍")
        itemList.add("모바일소프트웨어")
        itemList.add("웹프로그래밍")
        itemList.add("네트워크")
        itemList.add("시스템프로그래밍")
        itemList.add("모바일소프트웨어")
        itemList.add("웹프로그래밍")
        itemList.add("네트워크")
        itemList.add("시스템프로그래밍")
        itemList.add("모바일소프트웨어")
        itemList.add("웹프로그래밍")
        itemList.add("네트워크")
        itemList.add("시스템프로그래밍")

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerView.layoutManager = layoutManager

        val adapter = ItemAdapter(this, itemList)
        binding.recyclerView.adapter = adapter
    }
}