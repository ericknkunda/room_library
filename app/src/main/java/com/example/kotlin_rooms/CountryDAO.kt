package com.example.kotlin_rooms

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CountryDAO {
    @Query("SELECT * FROM countries")
    fun getAllCountries():List<Country>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertCountry(country: Country)
}