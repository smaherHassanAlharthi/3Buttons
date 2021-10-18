package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val et3=findViewById<EditText>(R.id.et3)

        val tvtext=findViewById<TextView>(R.id.textView)

        val toast=findViewById<Button>(R.id.bt1)
        val tv=findViewById<Button>(R.id.bt2)
        val go=findViewById<Button>(R.id.bt3)

        toast.setOnClickListener{
            Toast.makeText(this, "${ et1.text } \n ${ et2.text } \n ${ et3.text }" ,Toast.LENGTH_SHORT).show()
            clear(et1,et2,et3)
        }
        tv.setOnClickListener{
            tvtext.text="${ et1.text } \n ${ et2.text } \n ${ et3.text }"
            clear(et1,et2,et3)
        }
        go.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("text","${ et1.text } \n ${ et2.text } \n ${ et3.text }")
            startActivity(intent)

        }
    }

    fun clear(et1: EditText, et2: EditText, et3: EditText)
    {
        et1.text.clear()
        et2.text.clear()
        et3.text.clear()
    }
}