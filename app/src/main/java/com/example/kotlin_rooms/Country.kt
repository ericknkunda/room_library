package com.example.kotlin_rooms

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="countries")
data class Country(
    @PrimaryKey val id:Int,
    @ColumnInfo(name ="name") val name:String,
    @ColumnInfo(name ="flag") val flag:String
)
