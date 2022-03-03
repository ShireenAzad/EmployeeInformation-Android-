package com.example.employeeinformation

import android.text.Editable
import android.text.TextWatcher
import com.example.employeeinformation.databinding.ActivityDetailsBinding

class TextWatcherClass(binding: ActivityDetailsBinding) {

    val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val employeeName = binding.name.text.toString().trim()
            val employeeAge = binding.age.text.toString().trim()
            val employeeRole = binding.role.text.toString().trim()
            val employeeExperience =binding.experience.text.toString()
            binding.submitData.setEnabled(!employeeName.isEmpty() && !employeeAge.isEmpty() && !employeeRole.isEmpty() && !employeeExperience.isEmpty())
        }

        override fun afterTextChanged(p0: Editable?) {
        }
    }
}