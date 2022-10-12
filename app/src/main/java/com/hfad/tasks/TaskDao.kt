package com.hfad.tasks

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface TaskDao {

    @Insert
    fun insert(task: Task)

    @Update
    fun update(task: Task)
}