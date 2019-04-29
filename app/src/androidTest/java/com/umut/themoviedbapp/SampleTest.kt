package com.umut.themoviedbapp

import android.content.ComponentName
import android.support.test.runner.AndroidJUnit4
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsActivity
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
        intended(hasComponent(ComponentName(ApplicationProvider.getApplicationContext(),
            PopularTvShowsActivity::class.java
        )))
    }

}