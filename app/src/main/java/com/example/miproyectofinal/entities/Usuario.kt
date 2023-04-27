package com.example.miproyectofinal.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuario")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val user: String
)


