package ddwu.r.mobilesoft.week09.practice01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import ddwu.r.mobilesoft.week09.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainAvtivityTag"
    lateinit var binding : ActivityMainBinding
    val itemList = ArrayList<String>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemList.add("노르웨이숲")
        itemList.add("러시안블루")
        itemList.add("코리안숏헤어")
        itemList.add("먼치킨")
        itemList.add("터키시앙고라")
        itemList.add("페르시안")
        itemList.add("스코티시폴드")

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerView.layoutManager = layoutManager

        val adapter = ItemAdapter(this, itemList)
        binding.recyclerView.adapter = adapter
    }
}