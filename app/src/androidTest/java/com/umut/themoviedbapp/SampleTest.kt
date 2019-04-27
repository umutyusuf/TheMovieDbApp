package com.umut.themoviedbapp



import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class SampleTest {

    @get:Rule
    val sampleActivityRule = ActivityTestRule(SampleTestActivity::class.java)

    @Test
    fun testSampleActivity() {
        onView(withId(R.id.helloWorldTextView)).check(matches(withText("Hello World")))
    }

}