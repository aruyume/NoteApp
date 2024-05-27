package com.example.noteapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.data.db.daos.NoteDao
import com.example.noteapp.data.model.NoteModel

@Database(entities = [NoteModel::class], version = 7)
abstract class AppDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao
}