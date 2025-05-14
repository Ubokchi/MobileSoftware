package ddwu.com.mobile.week10.foodexam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import ddwu.r.mobilesoft.week10.practic01.databinding.ListWeatherBinding

class CustomAdapter (val weathers: ArrayList<WeatherDto>)
    :RecyclerView.Adapter<CustomAdapter.WeatherViewHolder>() {

    override fun getItemCount() = weathers.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val weatherBinding : ListWeatherBinding
            = ListWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WeatherViewHolder(weatherBinding)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.weatherBinding.tvNo.text = weathers[position].no.toString()
        holder.weatherBinding.tvDong.text = weathers[position].dong
        holder.weatherBinding.tvLoc.text = weathers[position].loc
        holder.weatherBinding.tvWeather.text = weathers[position].weather
    }

    class WeatherViewHolder (val weatherBinding: ListWeatherBinding)
        : RecyclerView.ViewHolder(weatherBinding.root)

}