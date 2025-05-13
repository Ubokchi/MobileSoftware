package ddwu.com.mobile.week10.foodexam

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import ddwu.com.mobile.week10.foodexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

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
        val foods = FoodDao().foods         // foods.removeAt(index)
        val adapter = FoodAdapter(foods)

        val listener = object: FoodAdapter.OnitemClickListener {
            override fun onItemclick(view: View, pos: Int) {
                Toast.makeText(this@MainActivity, "${foods[pos]}", Toast.LENGTH_SHORT).show()
            }
        }

        adapter.setOnitemClickListener(listener)

        val longClick = object: FoodAdapter.OnLongItemClickListener {
            override fun onLongItemClick(view: View, pos: Int): Boolean {
                foods.removeAt(pos)
                adapter.notifyDataSetChanged()
                return true
            }
        }

        button.setOnclickList {

        }



        adapter.setOnLongItemClickListener(longClick)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
    }
}