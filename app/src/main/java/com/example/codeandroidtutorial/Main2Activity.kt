package com.example.codeandroidtutorial

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.country_child.view.*

class Main2Activity : AppCompatActivity() {

    var countries: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        loadData()

        //countryList.layoutManager = LinearLayoutManager(this)
        countryList.layoutManager= GridLayoutManager(this,2)
        countryList.adapter= CountryAdapter(countries,this)

    }


        class CountryAdapter(items: List<String>, ctx: Context): RecyclerView.Adapter<CountryAdapter.ViewHolder>(){

            var list = items
            var context = ctx

            class ViewHolder (v: View): RecyclerView.ViewHolder(v){
                val name = v.countryName
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.country_child,parent,false))
            }

            override fun getItemCount(): Int {
                return list.size
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.name.text= list.get(position)
            }
        }


    fun loadData(){
        countries.add("nigeria")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("Ghana")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("England")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("Ghana")
        countries.add("Togo")
        countries.add("Madagascar")
        countries.add("Congo")
        countries.add("nigeria")
        countries.add("india")
        countries.add("USA")
        countries.add("Ghana")
    }
}
