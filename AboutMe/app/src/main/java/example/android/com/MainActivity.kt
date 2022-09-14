package example.android.com

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.about_me).setOnClickListener {
            val intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.skills_me).setOnClickListener {
            val intent = Intent(this, MainActivity3 :: class.java)
            startActivity(intent)
        }
    }


}