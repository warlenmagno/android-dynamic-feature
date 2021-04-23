package com.warlenmagno.samples.dynamicfeatures.ondemand

import android.os.Bundle
import android.widget.TextView
import com.warlenmagno.samples.dynamicfeatures.ondemand.ccode.R
import androidx.appcompat.app.AppCompatActivity

/** A simple activity displaying some text coming through via JNI. */
class NativeSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.loadLibrary("hello-jni")

        setContentView(R.layout.activity_hello_jni)
        findViewById<TextView>(R.id.hello_textview).text = stringFromJNI()
    }

    /** Read a string from packaged native code. */
    external fun stringFromJNI(): String
}
