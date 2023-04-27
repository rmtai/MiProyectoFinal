package com.example.miproyectofinal.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "item")

data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var name: String,
    var description: String
)