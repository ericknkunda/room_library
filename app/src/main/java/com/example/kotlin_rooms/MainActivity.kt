package com.example.kotlin_rooms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room

class MainActivity : AppCompatActivity() {

     lateinit var adapter:CountryAdapter
     lateinit var recyclerView: RecyclerView
//     lateinit var countryList: List<Country>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_layout)
        recyclerView =findViewById(R.id.recycler)

        val db = CountryDB.getDatabase(this)
//        val dbObj =db.getD
        val manager =LinearLayoutManager(this)
        recyclerView.layoutManager =manager

        val countryList = mutableListOf<Country>()
//        lateinit var object:Country()

        val obj =db.getDaoObj()
        countryList.add(Country(1, "Rwanda", "flag_rwanda"))
        countryList.add(Country(2, "Kenya", "flag_Kenya"))
        countryList.add(Country(3, "Uganda", "flag_Uganda"))
        countryList.add(Country(4, "Tanzania", "flag_Tanzania"))

        for(i in 0 until countryList.size){
            obj.insertCountry(countryList.get(i))
        }
        adapter =CountryAdapter(countryList)
        recyclerView.adapter =adapter
        Log.d("Data ", "${obj.getAllCountries()}")

//        updateList(countryList)
    }
    fun updateList(country:List<Country>){

    }
}