package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entities.Usuario

@Dao
interface DaoUsuario {

    @Query("SELECT * FROM usuario ORDER BY USER ASC")
    suspend fun obtenerUsuarios(): LiveData<List<Usuario>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarUsuario(usuario: Usuario)

    @Update
    suspend fun actualizarUsuario(usuario: Usuario)

    @Delete
    suspend fun eliminarUsuario(usuario: Usuario)
}


