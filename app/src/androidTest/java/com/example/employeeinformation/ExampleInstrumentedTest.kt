package com.example.employeeinformation

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(DetailsActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.employeeinformation", appContext.packageName)
    }

    @Test
    fun validatingDataIsPassingFromOneActivityToOtherActivity() {
        onView(withId(R.id.name)).perform(ViewActions.typeText("Shireen"))
        onView(withId(R.id.age)).perform(ViewActions.typeText("22"))
        onView(withId(R.id.role)).perform(ViewActions.typeText("intern"))
        onView(withId(R.id.experience)).perform(ViewActions.typeText("0"))
        onView(withId(R.id.submitData)).perform(ViewActions.click())
        onView(withId(R.id.name)).check(ViewAssertions.matches(ViewMatchers.withText("Employee Name:Shireen")))
        onView(withId(R.id.age)).check(ViewAssertions.matches(ViewMatchers.withText("Employee Age:22")))
        onView(withId(R.id.role)).check(ViewAssertions.matches(ViewMatchers.withText("Employee Role:intern")))
        onView(withId(R.id.experience)).check(ViewAssertions.matches(ViewMatchers.withText("Employee Experience:0")))


    }
}