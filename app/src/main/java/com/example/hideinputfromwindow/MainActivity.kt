package com.example.hideinputfromwindow

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ok_button.setOnClickListener {
            showResult(it)
        }
    }

    private fun showResult(it: View) {
        show_name.text = name_editText.text
        name_editText.visibility = View.GONE
        it.visibility = View.GONE
        show_name.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager
                imm.hideSoftInputFromWindow(it.windowToken , 0)
    }
}