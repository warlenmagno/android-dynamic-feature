package com.warlenmagno.samples.dynamicfeatures.ondemand

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.warlenmagno.samples.dynamicfeatures.ondemand.kotlin.R

/** A simple Activity displaying some text, written in Kotlin. */
class KotlinSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_kotlin)
    }

}
