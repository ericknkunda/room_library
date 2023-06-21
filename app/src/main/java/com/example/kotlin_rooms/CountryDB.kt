package com.example.kotlin_rooms

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Country::class], version = 1, exportSchema = false)
abstract class CountryDB:RoomDatabase() {
    abstract fun getDaoObj():CountryDAO

    companion object{
        var instance:CountryDB? =null
        fun getDatabase(context:Context):CountryDB{
            if(instance ==null){
                instance = Room.databaseBuilder(
                    context.applicationContext,CountryDB::class.java, "my_database"
                ).allowMainThreadQueries().build()
            }
            return instance!!
            instance
        }
    }
}