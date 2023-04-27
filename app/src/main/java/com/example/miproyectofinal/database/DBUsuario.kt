package com.example.miproyectofinal.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.DaoUsuario
import com.example.miproyectofinal.entities.Usuario

class DBUsuario {


    @Database(
        entities = [Usuario::class],
        version = 1
    )
    class DBItem {
        abstract class DBPrueba : RoomDatabase() {
            abstract fun usuarioDao(): DaoUsuario
        }
    }
}