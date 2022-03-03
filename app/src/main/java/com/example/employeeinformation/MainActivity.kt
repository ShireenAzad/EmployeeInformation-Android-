package com.example.employeeinformation
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.name)
        val age = findViewById<TextView>(R.id.age)
        val role = findViewById<TextView>(R.id.role)
        val experience = findViewById<TextView>(R.id.experience)

        val text = getString(R.string.Name,intent.getStringExtra(NAME).toString())
        val text1 = getString(R.string.Age,intent.getStringExtra(AGE).toString())
        val text2= getString(R.string.Role,intent.getStringExtra(ROLE).toString())
        val text3: String = getString(R.string.Experience,intent.getStringExtra(EXPERIENCE).toString())

        name.setText(text)
        age.setText(text1)
        role.setText(text2)
        experience.setText(text3)
    }
}