package org.csuf.cpsc411.simplehttpclient

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class FieldValueViewGenerator(val ctx : Context, val labelName : String) {
    lateinit var layoutObj : LinearLayout
    fun createTextView() : View {
        lateinit var tv : TextView
        tv = TextView(ctx)
        tv.text = labelName
        tv.setTextColor(Color.BLACK)
        tv.setTextSize(15F)
        tv.setTypeface(Typeface.create("monospace", Typeface.BOLD))
        tv.setPadding(50, 50, 50, 50)
        tv.gravity = Gravity.CENTER
        return tv
    }

    fun StatusTextView() : View {
        lateinit var tv : TextView
        tv = TextView(ctx)
        tv.text = labelName
        tv.setTextColor(Color.BLACK)
        tv.setPadding(50, 500, 50, 50)
        return tv
    }

    fun generate() : LinearLayout {
        layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.HORIZONTAL
        //


        val lblView = TextView(ctx)
        lblView.text = labelName
        lblView.setTextColor(Color.BLACK)
        //lblView.setBackgroundColor(Color.YELLOW)
        val lbParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        layoutObj.addView(lblView, lbParams)
        lbParams.weight = 3.0f
        lblView.gravity = Gravity.CENTER
        //
        val valView = EditText(ctx)
        //valView.setBackgroundColor(Color.GREEN)
        val vParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vParams.weight = 1.0f
        layoutObj.addView(valView, vParams)

        return layoutObj
    }
}