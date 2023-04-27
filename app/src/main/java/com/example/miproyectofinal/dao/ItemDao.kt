package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entities.Item


@Dao
interface ItemDao {

    @Query("SELECT * FROM item ORDER BY name ASC")
    fun obtenerItem(): MutableList<Item>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarItem(item: Item)

    @Update
    suspend fun actualizarItem(item: Item)

    @Delete
    suspend fun eliminarItem(item: Item)


}