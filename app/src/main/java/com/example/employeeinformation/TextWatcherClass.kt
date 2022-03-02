package com.example.employeeinformation

import android.text.Editable
import android.text.TextWatcher
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_details.view.*

class TextWatcherClass(root: GridLayout) {

    val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val employeeName = root.name.text.toString().trim()
            val employeeAge = root.age.text.toString().trim()
            val employeeRole = root.role.text.toString().trim()
            val employeeExperience = root.experience.text.toString()
            root.submitData.setEnabled(!employeeName.isEmpty() && !employeeAge.isEmpty() && !employeeRole.isEmpty() && !employeeExperience.isEmpty())
        }

        override fun afterTextChanged(p0: Editable?) {
        }
    }
}