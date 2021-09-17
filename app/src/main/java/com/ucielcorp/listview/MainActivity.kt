package com.ucielcorp.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myListView = findViewById<ListView>(R.id.listView1)

        //Conectar el nodo de string con el codigo
        var personasString = resources.getStringArray(R.array.personas)

        //Adaptador de Array con el ListView
        val adapter = ArrayAdapter(this, R.layout.row, R.id.textViewlabel, personasString)

        //Conexion con nuestra lista
        myListView.adapter = adapter

        //Utilizacion del OnItemClickListener --> basicamente una funcion que nos permite hacer algo cuanto presionamos un componenete dentro de ListView
        myListView.onItemClickListener = AdapterView.OnItemClickListener{
            parent, view, position, id ->

            val i = Intent(this, holaActivity::class.java)
            startActivity(i)

            //val selectedFromList = parent.getItemAtPosition(position) as String
            //Toast.makeText(applicationContext, """Click ListItem Number $position""", Toast.LENGTH_LONG).show()

            //Toast.makeText(applicationContext, """Hola mundo! $selectedFromList""", Toast.LENGTH_SHORT).show()

        }

    }
}