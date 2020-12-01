package org.csuf.cpsc411.simplehttpclient

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.loopj.android.http.AsyncHttpClient

class CustomActivity : AppCompatActivity() {
    lateinit var pList : MutableList<Person>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fldRowGenerator = ObjDetailScreenGenerator(this)
        val fNameView = fldRowGenerator.generate()
        setContentView(fNameView)
        //setContentView(R.layout.activity_main)
    }
}