package com.example.photonapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.lifecycleScope
import com.example.photonapp.R
import com.example.photonapp.ui.retrofit.ApiInterface
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SampleActivity : AppCompatActivity() {

    @Inject
    lateinit var helper : Helper

    @Inject
    lateinit var apiInterface: ApiInterface


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        (findViewById<AppCompatTextView>(R.id.tvTxt)).text = helper.getTodayDate().toString()

        lifecycleScope.launch {
            Log.d("SampleX", "onCreate: data ${apiInterface.getUserResponse()} sampleService ")
        }

        helper.printSomething()
    }
}