package com.example.employeeinformation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        val name: TextView = this.findViewById(R.id.name)
        val age: TextView = this.findViewById(R.id.age)
        val role: TextView = this.findViewById(R.id.role)
        val experience: TextView = this.findViewById(R.id.experience)
        val employeeName = getString(R.string.Name, intent.getStringExtra(NAME).toString())
        val employeeAge = getString(R.string.Age, intent.getStringExtra(AGE).toString())
        val employeeRole = getString(R.string.Role, intent.getStringExtra(ROLE).toString())
        val employeeExperience =
            getString(R.string.Experience, intent.getStringExtra(EXPERIENCE).toString())
        name.text=employeeName
        age.text=employeeAge
        role.text=employeeRole
        experience.text=employeeExperience

    }

}