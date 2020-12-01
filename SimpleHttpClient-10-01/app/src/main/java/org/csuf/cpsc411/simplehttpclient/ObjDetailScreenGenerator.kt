package org.csuf.cpsc411.simplehttpclient

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class ObjDetailScreenGenerator(val ctx : Context) {
    lateinit var layoutObj: LinearLayout
    // 1. create a Linear Layout Object
    fun generate() : LinearLayout {
        layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.VERTICAL

        val fldRowGenerator = ObjDetailSectionGenerator(ctx)
        val colView = fldRowGenerator.generate()
        layoutObj.addView(colView)

        val nLayout = LinearLayout(ctx)
        val nParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        nParams.gravity = Gravity.RIGHT
        layoutObj.layoutParams = nParams
        layoutObj.orientation = LinearLayout.VERTICAL


        val nButton = Button(ctx)
        nButton.text = "Add"
        nButton.setTextColor(Color.BLACK)
        val nbParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        //nbParams.gravity = Gravity.BOTTOM
        nLayout.addView(nButton, nbParams)

        layoutObj.addView(nLayout)

        var textview = FieldValueViewGenerator(ctx, "Status: ")
        layoutObj.addView(textview.StatusTextView())
        return layoutObj
    }
}