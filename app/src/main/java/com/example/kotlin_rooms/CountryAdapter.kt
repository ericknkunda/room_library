package com.example.kotlin_rooms

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(var country:List<Country>) :RecyclerView.Adapter<CountryAdapter.CountryHolder>(){

    inner class CountryHolder(view: View):RecyclerView.ViewHolder(view), View.OnClickListener{
        override fun onClick(v: View?) {
//            TODO("Not yet implemented")
        }

        val name:TextView =view.findViewById(R.id.name)
        var flag:TextView =view.findViewById(R.id.flag)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
//        TODO("Not yet implemented")
        val inflator =LayoutInflater.from(parent.context)
        val view =inflator.inflate(R.layout.layout_to_inflate, parent, false)
        val holder =CountryHolder(view)

        return  holder

    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return country.size
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
//        TODO("Not yet implemented")
        val thisCountry =country.get(position)
        holder.name.text =thisCountry.name
        holder.flag.text =thisCountry.flag
    }
}