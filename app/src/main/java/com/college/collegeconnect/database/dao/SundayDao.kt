package com.college.collegeconnect.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.college.collegeconnect.database.entity.SundayEntity
import com.college.collegeconnect.database.entity.ThursdayEntity
import com.college.collegeconnect.database.entity.TuesdayEntity

@Dao
interface SundayDao {

    @Insert
     fun add(sub : SundayEntity)

    @Query("SELECT * FROM SundayEntity")
    fun getSunClasses(): LiveData<List<SundayEntity>>
}