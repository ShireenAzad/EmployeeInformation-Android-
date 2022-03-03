package com.example.employeeinformation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.employeeinformation.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textWatcherClass = TextWatcherClass(binding.root)
        binding.name.addTextChangedListener(textWatcherClass.textWatcher)
        binding.age.addTextChangedListener(textWatcherClass.textWatcher)
        binding.role.addTextChangedListener(textWatcherClass.textWatcher)
        binding.experience.addTextChangedListener(textWatcherClass.textWatcher)
        binding.submitData.setOnClickListener {
            val employeeAge = Integer.parseInt(binding.age.text.toString().trim())
            val employeeExperience = Integer.parseInt(binding.experience.text.toString().trim())
            val validationResult =
                ageValidation(employeeAge) && experienceValidation(employeeExperience, employeeAge)
            if (validationResult) {
                dataPassingFromOneActivityToOtherActivity()
            }

        }
    }

    fun ageValidation(employeeAge: Int): Boolean {
        if (employeeAge > 0 && employeeAge < 150) {
            return true
        } else {
            Toast.makeText(this, "Please enter the age between 0 to 150", Toast.LENGTH_LONG).show()
            return false
        }
    }

    fun experienceValidation(employeeExperience: Int, employeeAge: Int): Boolean {
        if (employeeExperience >= 0 && employeeExperience < employeeAge) {
            return true
        } else {
            Toast.makeText(this, "Experience cannot be greater than age", Toast.LENGTH_LONG)
                .show()
            return false

        }
    }

    fun dataPassingFromOneActivityToOtherActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(NAME, binding.name.text.toString().trim())
        intent.putExtra(AGE, binding.age.text.toString().trim())
        intent.putExtra(ROLE, binding.age.text.toString().trim())
        intent.putExtra(EXPERIENCE, binding.experience.text.toString().trim())
        startActivity(intent)
    }
}
