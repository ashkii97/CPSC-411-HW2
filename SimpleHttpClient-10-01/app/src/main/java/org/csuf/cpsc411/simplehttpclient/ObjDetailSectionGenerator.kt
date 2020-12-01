package org.csuf.cpsc411.simplehttpclient

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout

class ObjDetailSectionGenerator(val ctx : Context) {
    lateinit var layoutObj : LinearLayout
    fun generate() : LinearLayout {
        layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.VERTICAL
        //
        var textview = FieldValueViewGenerator(ctx, "Please Enter Claim Information")
        layoutObj.addView((textview.createTextView()))

        var fldRowGenerator = FieldValueViewGenerator(ctx, "Claim Title")
        layoutObj.addView(fldRowGenerator.generate())

        fldRowGenerator = FieldValueViewGenerator(ctx, "Date")
        layoutObj.addView(fldRowGenerator.generate())

        return layoutObj
    }
}