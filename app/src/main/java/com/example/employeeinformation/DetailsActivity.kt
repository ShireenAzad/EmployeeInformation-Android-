package com.example.employeeinformation

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var name: EditText
    lateinit var role: EditText
    lateinit var age: EditText
    lateinit var experience: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        button = findViewById(R.id.submitData)
        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        role = findViewById(R.id.role)
        experience = findViewById(R.id.experience)
        name.addTextChangedListener(textWatcher)
        age.addTextChangedListener(textWatcher)
        role.addTextChangedListener(textWatcher)
        experience.addTextChangedListener(textWatcher)
        button.setOnClickListener {
            val employeeName = name.text.toString().trim()
            val employeeAge = Integer.parseInt(age.text.toString().trim())
            val employeeRole = role.text.toString().trim()
            val employeeExperience = Integer.parseInt(experience.text.toString())
            if(employeeAge>0 && employeeAge<150) {
                    if(employeeAge>employeeExperience){
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra(NAME, employeeName)
                    intent.putExtra(AGE, employeeAge)
                    intent.putExtra(ROLE, employeeRole)
                    intent.putExtra(EXPERIENCE, employeeExperience)
                    startActivity(intent)}
                    else
                    {
                        Toast.makeText(this,"Experience cannot be greater than age",Toast.LENGTH_LONG).show()

                    }

            }
            else{
               Toast.makeText(this,"Please enter the age between 0 to 150",Toast.LENGTH_LONG).show()
            }
        }

    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val employeeName = name.text.toString().trim()
            val employeeAge = age.text.toString().trim()
            val employeeRole = role.text.toString().trim()
            val employeeExperience = experience.text.toString()
            button.setEnabled(!employeeName.isEmpty() && !employeeAge.isEmpty() && !employeeRole.isEmpty() && !employeeExperience.isEmpty())

        }

        override fun afterTextChanged(p0: Editable?) {
        }

    }

}