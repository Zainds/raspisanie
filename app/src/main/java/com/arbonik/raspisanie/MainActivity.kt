package com.arbonik.raspisanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shrikanthravi.collapsiblecalendarview.data.Day
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var CalendarView = findViewById<CollapsibleCalendar>(R.id.calendarView)
//        val collapsibleCalendar : CollapsibleCalendar = findViewById(R.id.calendarView)
//        collapsibleCalendar.setCalendarListener(listener = CollapsibleCalendar.CalendarListener)
        var RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        RecyclerView.layoutManager = LinearLayoutManager(baseContext)
        RecyclerView.adapter = MyAdapter().apply {
            items = MutableList(10, {
                Item((String(Random.nextBytes(5))),
                        (String(Random.nextBytes(5))),
                        (String(Random.nextBytes(5))),
                        (String(Random.nextBytes(5))))
            })
        }
    }
}
class MyAdapter: RecyclerView.Adapter<MyAdapter.Companion.MyViewHolder>(){

    var items = mutableListOf<Item>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder
            = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(items[position])

    }

    override fun getItemCount(): Int = items.size

    companion object{
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val textView = itemView.findViewById<TextView>(R.id.textView)
            val textView2 = itemView.findViewById<TextView>(R.id.textView2)
            val textView3 = itemView.findViewById<TextView>(R.id.textView3)
            val textView4 = itemView.findViewById<TextView>(R.id.textView4)
            fun onBind(item: Item){
                textView.text = item.str
                textView2.text = item.str2
                textView3.text = item.str3
                textView4.text = item.str4
            }
        }
    }
}
data class Item(val str: String, val str2: String, val str3: String, val str4: String)