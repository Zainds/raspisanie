package com.arbonik.raspisanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CalendarView
import com.shrikanthravi.collapsiblecalendarview.data.Day
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var CalendarView = findViewById<CollapsibleCalendar>(R.id.calendarView)
        val collapsibleCalendar : CollapsibleCalendar = findViewById(R.id.calendarView)
        collapsibleCalendar.setCalendarListener(CollapsibleCalendar.CalendarListener{
            fun onDaySelect(){
                val day: Day = viewCalendar.getSelectedDay(this)
                Log.i(getClass().getName(), "Selected Day: "
                        + day.getYear() + "/" + (day.getMonth() + 1) + "/" + day.getDay())
            }
            fun onItemClick(view: View) {  }
            fun onDataUpdate(view: View) {  }
            fun onMonthChange(view: View) {  }
            fun onWeekChange(view: View) {  }
    }
}