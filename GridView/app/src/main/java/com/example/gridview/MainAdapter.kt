package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast

class TextAdapter(private var context: Context) : BaseAdapter() {
    var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return 60
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View, viewGroup: ViewGroup): View {
        var view = view
        if (layoutInflater == null) layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = "${i + 1}"
        textView.setOnClickListener {
            Toast.makeText(context, textView.text, Toast.LENGTH_SHORT).show()
        }
        return view
    }
}
