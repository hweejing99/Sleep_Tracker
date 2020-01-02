package com.example.sleeptracker
 import androidx.room.Entity
 import androidx.room.PrimaryKey

@Entity(tableName="sleep")
data class Sleep(
    //SQLite Database
    @PrimaryKey(autoGenerate = true) val id: Int,
            val startDate :Long = System.currentTimeMillis(),
            val endDate: Long,
            val quality: Int  //1 to 5
)