package ddwu.r.mobilesoft.week09.practice02

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val context: Context, val list: ArrayList<String>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.tvItemText.text = list[position]
    }

    inner class  ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val TAG = "ItemViewHolder"
        val tvItemText : TextView = view.findViewById<TextView>(R.id.tvItemText)
        init {
            tvItemText.setOnClickListener {
                Log.i(TAG, "tvItemTextClick! ${list[adapterPosition]}")
            }

            view.setOnLongClickListener {
                list.removeAt(adapterPosition)
                this@ItemAdapter.notifyDataSetChanged()
                true
            }
        }
    }
}