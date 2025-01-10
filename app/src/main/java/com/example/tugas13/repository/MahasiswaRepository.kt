package com.example.tugas13.repository

import com.example.tugas13.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository {
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)
    suspend fun getMahasiswa(): Flow<List<Mahasiswa>>
    suspend fun getMahasiswabyNim(nim: String): Flow <Mahasiswa>
}
