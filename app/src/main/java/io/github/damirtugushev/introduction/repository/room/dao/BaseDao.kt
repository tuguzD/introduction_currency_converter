package io.github.damirtugushev.introduction.repository.room.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

sealed interface BaseDao<T> {

    @Insert
    suspend fun insert(item: T)

    @Update
    suspend fun update(item: T)

    @Delete
    suspend fun delete(item: T)
}
