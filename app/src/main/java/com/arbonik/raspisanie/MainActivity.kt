package com.arbonik.raspisanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var CalendarView = findViewById<CalendarView>(R.id.calendarView)
        
    }
}