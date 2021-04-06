package com.example.newapprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myrv.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        var myDataList =  ArrayList<UserData>()
        myDataList.add(UserData("Jai","jaiDubai@mango.com","7777777777"))
        myDataList.add(UserData("Vishal","jaiDubaifdfd@mango.com","777743777777"))
        myDataList.add(UserData("JaiLol","jaiDubadsfi@mango.com","777777777dfd7"))
        myDataList.add(UserData("Bataiye","jaiDubfdai@mdfdango.com","77777777dsf77"))
        myDataList.add(UserData("Jai","jaiDubai@mango.com","7777777777"))
        myDataList.add(UserData("Vishal","jaiDubaifdfd@mango.com","777743777777"))
        myDataList.add(UserData("JaiLol","jaiDubadsfi@mango.com","777777777dfd7"))
        myDataList.add(UserData("Bataiye","jaiDubfdai@mdfdango.com","77777777dsf77"))



        myrv.adapter = MyAdapter(myDataList)
    }
}