package com.example.miproyectofinal.database

import android.content.ClipData.Item
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.ItemDao


@Database(
    entities = [Item::class],
    version = 1
)
class DBItem {
    abstract class DBPrueba : RoomDatabase() {
        abstract fun itemDao(): ItemDao
    }
}

