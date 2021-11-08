package com.light.notes.cleancodetest.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.light.notes.cleancodetest.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tvGet = findViewById<TextView>(R.id.tvGet)
        val btn_getData = findViewById<Button>(R.id.btn_getData)
        val btn_saveData = findViewById<Button>(R.id.btn_saveData)
        val etSave = findViewById<EditText>(R.id.etSave)

        viewModel.text.observe(this, {
            tvGet.text = it
        })

        btn_getData.setOnClickListener {
            viewModel.load(tvGet.text.toString())
        }

        btn_saveData.setOnClickListener {
            val text = etSave.text.toString()
            viewModel.save(text = text)
        }

    }
}