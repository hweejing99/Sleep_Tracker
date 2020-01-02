package com.example.sleeptracker

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface  SleepDao{
    @Insert
    suspend fun insertSleep(sleep: Sleep)

    @Query("SELECT * FROM sleep")
     fun getSleep() : LiveData<List<Sleep>> //return u a list record

    @Query("SELECT * FROM sleep WHERE id=:sleep_id")
     fun getASleep(sleep_id: Int): Sleep //: Sleep = return sleep

    @Update
    suspend fun updateSleep(sleep: Sleep) //suspend means run in background not UI

    @Delete
    suspend fun deleteSleep(sleep: Sleep)

    @Query("DELETE FROM sleep WHERE id=:sleep_id")
    suspend fun deleteASleep(sleep_id: Int)
}