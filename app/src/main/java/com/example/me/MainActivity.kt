package com.example.me

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { layoutInflater.inflate(R.layout.activity_main, null, false) }
            ) { root ->
                val nameInput = root.findViewById<EditText>(R.id.nameInput)
                val profileInitial = root.findViewById<TextView>(R.id.profileInitial)

                nameInput.addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(
                        s: CharSequence?, start: Int, count: Int, after: Int
                    ) {}

                    override fun onTextChanged(
                        s: CharSequence?, start: Int, before: Int, count: Int
                    ) {
                        val text = s.toString().trim()
                        if (text.isNotEmpty()) {
                            profileInitial.text = text[0].uppercase()
                        } else {
                            profileInitial.text = "--"
                        }
                    }

                    override fun afterTextChanged(s: Editable?) {}
                })
            }
        }
    }
}
