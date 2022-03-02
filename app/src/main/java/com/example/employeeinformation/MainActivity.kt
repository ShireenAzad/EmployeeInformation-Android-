package com.example.employeeinformation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<TextView>(R.id.name)
        val age=findViewById<TextView>(R.id.age)
        val role=findViewById<TextView>(R.id.role)
        val experience=findViewById<TextView>(R.id.experience)
        name.setText("Employee Name:"+intent.getStringExtra(NAME).toString())
        age.setText("Employee Age:"+(intent.getIntExtra(AGE,10)).toString())
        role.setText("Employee Role:"+intent.getStringExtra(ROLE).toString())
        experience.setText("Employee Experience:"+intent.getIntExtra(EXPERIENCE,0).toString())


    }
}