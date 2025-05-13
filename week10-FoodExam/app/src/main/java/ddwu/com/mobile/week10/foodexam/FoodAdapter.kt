package ddwu.com.mobile.week10.foodexam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ddwu.com.mobile.week10.foodexam.databinding.ListItemBinding

class FoodAdapter (val foods: ArrayList<FoodDto>)
    :RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun getItemCount() = foods.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        val itemBinding : ListItemBinding
            = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.itemBinding.ivPhoto.setImageResource(foods[position].photo)
        holder.itemBinding.tvFood.text = foods[position].food
        holder.itemBinding.tvCount.text = foods[position].count.toString()
    }

    inner class FoodViewHolder(val itemBinding: ListItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {
            val TAG = "FoodViewHolder"
            init {
                itemBinding.root.setOnClickListener  {
                    Log.i(TAG, "${foods[adapterPosition]}")
                    itemClickListener.onItemclick(it, adapterPosition)
                }
                itemBinding.root.setOnLongClickListener{
                    // 외부에서 전달한 이벤트 리스너 함수 실행
                    longClick.onLongItemClick(it, adapterPosition)
                }
            }
    }

    interface OnLongItemClickListener {
        fun onLongItemClick (view: View, pos: Int) : Boolean
    }

    lateinit var longClick : FoodAdapter.OnLongItemClickListener

//    lateinit var longFunction : (view: View, pos: Int) -> Boolean

    fun setOnLongItemClickListener (l: OnLongItemClickListener) {
        longClick = l
    }

    interface OnitemClickListener {
        fun onItemclick (view: View, pos: Int)
    }

    lateinit var itemClickListener: OnitemClickListener

    fun setOnitemClickListener (listener: OnitemClickListener) {
        itemClickListener = listener
    }

}